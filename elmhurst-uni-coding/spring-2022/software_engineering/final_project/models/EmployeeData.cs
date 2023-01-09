using System.ComponentModel.DataAnnotations.Schema;

namespace SearchGenerator.Models
{

    [NotMapped()]
    public class EmployeeData
    {  
        // Default constructor
        public EmployeeData()
        {
            expirationDate = DateTime.MinValue;
            id = firstName = lastName = phoneNumber = certification = city = state = country = "";
        }
        public string id { get; set; }
        public string firstName { get; set; }
        public string lastName { get; set; }
        public string city { get; set; }
        public string state { get; set; }
        public string country { get; set; }

        public DateTime? expirationDate { get; set; }
        public string? phoneNumber { get; set; }
        public string certification { get; set; }

        public override string ToString()
        {
            return "{ " + id + ", "
                + firstName + ", "
                + lastName + ", "
                + expirationDate + ", "
                + phoneNumber + ", "
                + certification + ", "
                + city + ", "
                + state + ", "
                + country
                + "}";
        }

    }
}
