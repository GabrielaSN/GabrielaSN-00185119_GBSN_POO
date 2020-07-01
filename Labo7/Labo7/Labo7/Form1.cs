using System;
using System.Collections.Generic;
using System.Drawing;
using System.Windows.Forms;

namespace Labo7
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
          comboBox1.DataSource= new List<String>() {"Celeste", "Rosa", "Morado"};
        }

        private void Blue_Click(object sender, EventArgs e)
        {
            BackColor = Color.Blue;
        }

        private void Green_Click(object sender, EventArgs e)
        {
            BackColor = Color.Green;
        }

        private void red_Click(object sender, EventArgs e)
        {
            BackColor = Color.Red;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            BackColor = ColorTranslator.FromHtml("#" + textBox1.Text);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            string Morado = "#ae29cc" , Celeste = "#2ac0d1", Rosado = "#d645d6";
                        
            switch(comboBox1.SelectedIndex)
            {
                case 0: 
                    BackColor = ColorTranslator.FromHtml(Celeste);
                    break;
                case 1:
                   BackColor = ColorTranslator.FromHtml(Rosado);
                    break;
                case 2:
                    BackColor = ColorTranslator.FromHtml(Morado);
                    break;
            }
        }
    }
}