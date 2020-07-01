using System;
using System.Windows.Forms;

namespace Labo8
{
    public partial class Form1 : Form
        {
            private UserControl current;
            private Register r = new Register();
            public Form1()
            {
                InitializeComponent();
                current = login1;
                DoubleBuffered = true;
            }
            private void button2_Click(object sender, EventArgs e)
            {
                tableLayoutPanel1.Controls.Remove(current);
                tableLayoutPanel1.Controls.Add(r,1,0);
                current = r;
                tableLayoutPanel1.SetRowSpan(current, 4);
            }

            private void button1_Click(object sender, EventArgs e)
            {
                tableLayoutPanel1.Controls.Remove(current);
                tableLayoutPanel1.Controls.Add(login1,1,0);
                current = login1;
                tableLayoutPanel1.SetRowSpan(current,4);
            }
        }
}
