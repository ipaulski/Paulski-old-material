using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace XEx02Quotation
{
    public partial class Default : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            UnobtrusiveValidationMode = UnobtrusiveValidationMode.None;
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            if(IsValid)
            {
                decimal discountPercent =
                    Convert.ToDecimal(txtDiscountPrcnt.Text);
                decimal salesPrice =
                    Convert.ToDecimal(txtSalesPrice.Text);
                decimal discountAmount =
                    (discountPercent/100) * salesPrice;
                decimal totalPrice =
                    salesPrice - discountAmount;
                lblDiscountAmt.Text = discountAmount.ToString("c");
                lblTotalPrice.Text = totalPrice.ToString("c");
            }
        }

        protected void txtSalesPrice_TextChanged(object sender, EventArgs e)
        {

        }
    }
}