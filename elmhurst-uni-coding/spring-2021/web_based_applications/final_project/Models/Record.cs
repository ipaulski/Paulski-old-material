using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

//namespace CS440Practice.Models
//{
public class Record
{
    public int Borrower_ID { get; set; }
    public string Borrower_FName { get; set; }
    public string Borrower_LName { get; set; }
    public string Borrower_DOB { get; set; }     
    public string Borrower_Address { get; set; }
    public string Borrower_Phone { get; set; }
    public int Staff_ID { get; set; }
    public string Staff_FName { get; set; }
    public string Staff_LName { get; set; }
    public int Book_ID { get; set; }
    public string Book_Title { get; set; }
    public string Book_Author { get; set; }
    public int Book_Copies { get; set; }
    public DateTime Rec_IssueDate { get; set; }
    public DateTime Rec_ReturnDate { get; set; }
    public string Borrower_Msg { get; set; }
}
//}