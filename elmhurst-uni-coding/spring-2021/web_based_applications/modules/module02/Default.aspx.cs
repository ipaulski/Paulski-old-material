using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Exercise02
{
    public partial class Default : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            UnobtrusiveValidationMode = UnobtrusiveValidationMode.None;
            if (!IsPostBack)
                for (int i = 50; i < 500; i += 50)
                    DropDownList1.Items.Add(i.ToString());
        }

        protected void btnClear_Click(object sender, EventArgs e)
        {
            DropDownList1.SelectedIndex = 0;
            txtAnnualInterestRate.Text = "";
            txtNumberOfYears.Text = "";
            lblFutureValue.Text = "";
        }

        protected void btnCalculate_Click(object sender, EventArgs e)
        {
            int monthlyInvestment =
                Convert.ToInt32(DropDownList1.SelectedValue);
            decimal yearlyInterestRate =
                Convert.ToDecimal(txtAnnualInterestRate.Text);
            int years = Convert.ToInt32(txtNumberOfYears.Text);
            decimal futureValue = this.CalculateFutureValue(
                monthlyInvestment, yearlyInterestRate, years);
            lblFutureValue.Text = futureValue.ToString("c");
        }
        protected decimal CalculateFutureValue(int monthlyInvestment,
            decimal yearlyInterestRate, int years)
        {
            int months = years * 12;
            decimal monthlyInterestRate = yearlyInterestRate / 12 / 100;
            decimal futureValue = 0;
            for (int i = 0; i < months; i++)
            {
                futureValue = (futureValue + monthlyInvestment) *
                    (1 + monthlyInterestRate);
            }
            return futureValue;
        }
    }
}