using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations.Schema;

namespace SearchGenerator.Models
{
    [NotMapped()] //EF core ignores this class when building database
    public class SearchInput
    {
        //Default constructor
        public SearchInput()
        {
            id = -1;
            certType = certID = fname = lname = city = state = country = "";

        }

        public int id { get; set; }
        public string certType { get; set; }

        public string certID { get; set; }
        public string fname { get; set; }
        public string lname { get; set; }
        public string city { get; set; }
        public string state { get; set; }
        public string country { get; set; }

    }
}
