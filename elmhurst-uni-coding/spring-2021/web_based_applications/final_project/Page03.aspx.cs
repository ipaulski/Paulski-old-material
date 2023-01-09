using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace CS440Practice
{
    public partial class Page03 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            DisplayRecord();
        }
        private void DisplayRecord()
        {
            Record borrowerRecord = (Record)Session["Record"];
            lblFirstName.Text = borrowerRecord.Borrower_FName;
            lblLastName.Text = borrowerRecord.Borrower_LName;
            lblDOB.Text = borrowerRecord.Borrower_DOB;
            lblAddress.Text = borrowerRecord.Borrower_Address;
            lblPhone.Text = borrowerRecord.Borrower_Phone;
            lblBorrowerID.Text = Convert.ToString(borrowerRecord.Borrower_ID);
            lblBooks.Text = borrowerRecord.Book_Title;
            DateTime currentDate = DateTime.Today;
            DateTime returnDate = DateTime.Today.AddDays(14);
            lblIssued.Text = Convert.ToString(currentDate);
            lblReturn.Text = Convert.ToString(returnDate);
            borrowerRecord.Rec_IssueDate = currentDate;
            borrowerRecord.Rec_ReturnDate = returnDate;
            lblMessage.Text = borrowerRecord.Borrower_Msg;
            Session["Record"] = borrowerRecord;
        }
        protected void Button2_Click(object sender, EventArgs e)
        {
            Response.Redirect("Page02.aspx");
        }

        protected void btnConfirm_Click(object sender, EventArgs e)
        {
            lblThankYou.Text = "Thank you for your request.\nWe will send a text message confirmation with your details.";
        }
    }
}