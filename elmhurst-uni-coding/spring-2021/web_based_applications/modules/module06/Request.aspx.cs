//Izabella Paulski CS440 hw06
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace XEx06Reservation
{
    public partial class Request : System.Web.UI.Page
    {
        private string currentDate = DateTime.Today.ToShortDateString();
        private string currentYear = DateTime.Today.Year.ToString();

        protected void Page_Load(object sender, EventArgs e)
        {
            txtArrivalDate.Text = currentDate;
        }

        protected void btnSubmit_Click(object sender, EventArgs e)
        {
            lblMessage.Text = "Thank you for your request.\nWe will get back to you within 24 hours.";
        }

        protected void btnClear_Click(object sender, EventArgs e)
        {
            rdo2Queens.Checked = false;
            rdoKing.Checked = false;
            rdoQueen.Checked = false;
            txtArrivalDate.Text = currentDate;
            txtDepartureDate.Text = "";
        }
    }
}