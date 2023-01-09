using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace XEx08Reservation
{
    public partial class Confirm : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            lblYear.Text = DateTime.Today.Year.ToString();
            DisplayReservation();
        }

        private void DisplayReservation()
        {
            Reservation reservation = (Reservation)Session["Reservation"];
            lblArrivalDate.Text = Convert.ToString(reservation.ArrivalDate);
            lblDepartureDate.Text = Convert.ToString(reservation.DepartureDate);
            //lblBedType.Text = reservation.BedType;
            lblEmail.Text = reservation.Email;
            lblFirstName.Text = reservation.FirstName;
            lblLastName.Text = reservation.LastName;
            lblMessage.Text = reservation.SpecialRequests;
            //lblNoOfDays.Text = Convert.ToString(reservation.NoOfDays);
            lblNoOfPeople.Text = Convert.ToString(reservation.NoOfPeople);
            lblPhone.Text = reservation.Phone;
            lblPreferredMethod.Text = reservation.PreferredMethod;
            lblSpecialRequests.Text = reservation.SpecialRequests;
        }

        protected void btnConfirm_Click(object sender, EventArgs e)
        {
            lblMessage.Text = "Thank you for your request.\nWe will get back to you within 24 hours.";
        }

        protected void btnModify_Click(object sender, EventArgs e)
        {
            Response.Redirect("Request.aspx");
        }
    }
}