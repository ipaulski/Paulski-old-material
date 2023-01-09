using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Module0316
{
    public partial class Default : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void TextBox3_TextChanged(object sender, EventArgs e)
        {

        }

        protected void RadioButton3_CheckedChanged(object sender, EventArgs e)
        {

        }

        protected void btnCalculate_Click(object sender, EventArgs e)
        {
            decimal results = 0m;
            decimal value01 = Convert.ToDecimal(txtValue01.Text);
            if (rdoCircle.Checked)
                results = CircleProc(value01);
            else if (rdoCircleArea.Checked)
                results = CircleAreaProc(value01);
            else if (rdoSphere.Checked)
                results = SphereProc(value01);
            else if (rdoSphereVolume.Checked)
                results = SphereVolumeProc(value01);
            else if (rdoBox.Checked)
            {
                decimal value02 = Convert.ToDecimal(txtValue02.Text);
                results = BoxProc(value01, value02);
            }
            else if (rdoBoxVolume.Checked)
            {
                decimal value02 = Convert.ToDecimal(txtValue02.Text);
                decimal value03 = Convert.ToDecimal(txtValue03.Text);
                results = BoxVolumeProc(value01, value02, value03);
            }
            lblResults.Text = results.ToString();
        }

        protected decimal CircleProc(decimal value01)
        {
            return value01 * 2 * Convert.ToDecimal(Math.PI);
        }
        protected decimal CircleAreaProc(decimal value01)
        {
            return value01 * value01 * Convert.ToDecimal(Math.PI);
        }
        protected decimal SphereProc(decimal value01)
        {
            return value01 * value01 * 4 * Convert.ToDecimal(Math.PI);
        }
        protected decimal SphereVolumeProc(decimal value01)
        {
            return value01 * value01 * value01 * 4/3 * Convert.ToDecimal(Math.PI);
        }
        protected decimal BoxProc(decimal value01, decimal value02)
        {
            return value01 * value02;
        }
        protected decimal BoxVolumeProc(decimal value01, decimal value02, decimal value03)
        {
            return value01 * value02 * value03;
        }

        protected void txtValue02_TextChanged(object sender, EventArgs e)
        {

        }

        protected void rdoBox_CheckedChanged(object sender, EventArgs e)
        {
            txtValue02.Visible = true;
        }

        protected void rdoBoxVolume_CheckedChanged(object sender, EventArgs e)
        {
            txtValue02.Visible = true;
            txtValue03.Visible = true;
        }
    }
}