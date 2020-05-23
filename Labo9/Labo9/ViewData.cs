using System;
using System.Windows.Forms;

namespace Labo9
{
    public partial class ViewData : UserControl
    {
        public ViewData()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text.Equals(""))
            {
                MessageBox.Show("No se pueden dejar camps vacios");
            }
            else
            {
                try
                {
                    var dt = ConectionDB.ExecuteQuery($"SELECT mat.idmateria, mat.nombre " +
                                                      "FROM inscripcion ins, materia mat " +
                                                      $"WHERE ins.idmateria = mat.idmateria " +
                                                      $"AND ins.carnet = '{textBox1.Text}'");

                    dataGridView1.DataSource = dt;
                    MessageBox.Show("Datos obtenidos exitosamente");
                }
                catch (Exception ex)
                { 
                    MessageBox.Show("Ha ocurrido un problema");  
                }
            }
        }
    }
}