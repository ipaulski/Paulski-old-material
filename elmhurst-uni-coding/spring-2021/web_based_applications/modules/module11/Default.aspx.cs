using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace CS440Ch07
{
    public partial class Default : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            UnobtrusiveValidationMode = UnobtrusiveValidationMode.None;
        }

        protected void btnAdd01_Click(object sender, EventArgs e)
        {
            if (txtValue01.Text == "")
                lblError01.Text = "Value 1 Required";
            else
                try
                {
                    int Value1 = Convert.ToInt32(txtValue01.Text);
                    if (Value1 < 10 || Value1 > 20)
                    { txtValue01.Text = "Value 1 Must be Between 10 and 20"; }
                    else
                    {
                        Value1 += 1;
                        txtValue01.Text = Value1.ToString();
                    }
                }
                catch
                { lblError01.Text = "Value1 Must be Numeric"; }

        }

        protected void btnAdd02_Click(object sender, EventArgs e)
        {
            int Value2 = Convert.ToInt32(txtValue02.Text);
            Value2 += 2;
            txtValue02.Text = Value2.ToString();

        }
    }
}