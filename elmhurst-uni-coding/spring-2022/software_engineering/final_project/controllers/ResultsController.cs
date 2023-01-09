using Microsoft.AspNetCore.Mvc;
using SearchGenerator.Models;
using System.Diagnostics;


namespace SearchGenerator.Controllers
{
    public class ResultsController : Controller
    {
        private readonly ILogger<ResultsController> _logger;
        private readonly SteelTankApplicationDbContext appContext;

        public ResultsController(ILogger<ResultsController> logger, SteelTankApplicationDbContext ctxt)
        {
            appContext = ctxt;
            _logger = logger;
        }

       
        public IActionResult Index(SearchInput userInput)
        {
            // The certification type must have been chosen by user
            // helps prevent user calling actoin through the url
            if (userInput != null && userInput.certType != "")
            {
                obtainResults(userInput);
                return View();
            } else
                return View("~/Views/Shared/Oops.cshtml");
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }

        // Runs query and populates results list
        public IActionResult obtainResults(SearchInput userInput)
        {

            IQueryable<EmployeeData> certQuery;

            if (userInput.certType == "SP001")
            {
                certQuery = (from employee in appContext.Sp001certifiedTankInspectorsLists                            
                             select new EmployeeData
                             {
                                 id = employee.Id,
                                 firstName = employee.First,
                                 lastName = employee.Last,
                                 expirationDate = employee.LicenseExpires,
                                 phoneNumber = employee.Phone,
                                 city = employee.City,
                                 state = employee.St,
                                 certification = "SP001"
                             });
            }
            else if (userInput.certType == "CP")
            {
                certQuery = (from employee in appContext.CpcertifiedTestersLists
                             select new EmployeeData
                             {
                                 id = employee.Id,
                                 firstName = employee.First,
                                 lastName = employee.Last,
                                 expirationDate = employee.LicenseExpires,
                                 phoneNumber = employee.Phone,
                                 city = employee.City,
                                 state = employee.St,
                                 certification = "CP"

                             });
            }

            // Handles improper action call
            else
                return View("~/Views/Shared/Oops.cshtml");

            // all foreign countries are in the state columns of both docs 
            //if US not chosen look for country in state colmn

            // Filter out the query with the input fields from user
            if (userInput.certID != null && userInput.certID != "")
                certQuery = certQuery.Where(employee => employee.id.Contains(userInput.certID));

            if (userInput.fname != null && userInput.fname != "")
                certQuery = certQuery.Where(employee => employee.firstName.Contains(userInput.fname));

            if (userInput.lname != null && userInput.lname != "")
                certQuery = certQuery.Where(employee => employee.lastName.Contains(userInput.lname));
            
            if (userInput.city != null && userInput.city != "" )
                certQuery = certQuery.Where(employee => employee.city.Contains(userInput.city));
            
            if (userInput.state != null && userInput.state != "" )
                if(userInput.state != "ALL")
                    certQuery = certQuery.Where(employee => employee.state.Contains(userInput.state));

            if (userInput.country != null && userInput.country != "")
                if (userInput.country != "ALL")
                {
                    if (userInput.country != "United States")
                        certQuery = certQuery.Where(employee => employee.state.Contains(userInput.country));
                    else if (userInput.state != null && userInput.state != "")
                        if(userInput.state != "ALL")
                            certQuery = certQuery.Where(employee => employee.state.Contains(userInput.state));
                }

            //Results returned from query
            List<EmployeeData> results = certQuery.ToList();

            // Sorts data by Last name
            results.Sort((empOne, empTwo) => String.Compare(empOne.lastName, empTwo.lastName));
            return View(results);
        }
    }


}

