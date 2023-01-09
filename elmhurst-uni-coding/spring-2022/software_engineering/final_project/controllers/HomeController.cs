using Microsoft.AspNetCore.Mvc;
using SearchGenerator.Models;
using System.Diagnostics;


namespace SearchGenerator.Controllers
{
    // Main controller
    public class HomeController : Controller
    {
        private readonly ILogger<HomeController> _logger;

        public HomeController(ILogger<HomeController> logger)
        {
            _logger = logger;
        }
       
        public IActionResult Index()
        {
            return View();
        }

        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }

        //Action called by the "search" button in home page
        public IActionResult btnsearch_Click()
        {

            // Create input object and populate it with field inputs
            SearchInput userInput = new SearchInput();
            userInput.certType = Request.Form["certType"];
            userInput.certID = Request.Form["certID"];
            userInput.lname = Request.Form["lname"];
            userInput.fname = Request.Form["fname"];
            userInput.city = Request.Form["city"];
            userInput.state = Request.Form["state"];
            userInput.country = Request.Form["country"];

            // Place input into ViewBag object then redirect to results page
            return RedirectToAction(actionName: "Index", controllerName: "Results", userInput);
        }
    }

}