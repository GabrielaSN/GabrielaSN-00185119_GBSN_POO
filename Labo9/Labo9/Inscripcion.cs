using System;
using System.Collections.Generic;
using System.Data;
using System.Windows.Forms;

namespace Labo9
{
    public partial class Inscripcion : UserControl
    {
        public Inscripcion()
        {
            InitializeComponent();
        }

        private void Inscripcion_Load(object sender, EventArgs e)
        {
            var assignatures = ConectionDB.ExecuteQuery("SELECT nombre FROM materia ");
            var assignaturesCombo = new List<string>();

            foreach (DataRow dr in assignatures.Rows)
            {
                assignaturesCombo.Add(dr[0].ToString());
            }

            comboBox1.DataSource = assignaturesCombo;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text.Equals(" "))
            {
                MessageBox.Show("No se pueden dejar campos vacios");
            }
            else
            {
                try
                {
                    string query = $"SELECT idmateria FROM materia WHERE nombre = " +
                                   $"'{comboBox1.SelectedItem.ToString()}'";

                    var dt = ConectionDB.ExecuteQuery(query);
                    var dr = dt.Rows[0];
                    var idmateria = Convert.ToInt32(dr[0].ToString());
                    
                    string nonQuery = $"INSERT INTO INSCRIPCION(idmateria, carnet) VALUES(" +
                                      $"{idmateria}," +
                                      $"'{textBox1.Text}')";
                    
                    ConectionDB.ExecuteNonQuery(nonQuery);

                    MessageBox.Show("Se ha inscrito la materia");
                }
                catch (Exception ex)
                {
                    MessageBox.Show("Ha ocurrido un error");  
                }
            }
        }
    }
}