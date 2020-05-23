namespace Labo9
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }

            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.tableLayoutPanel1 = new System.Windows.Forms.TableLayoutPanel();
            this.Estudiante = new System.Windows.Forms.Button();
            this.Materia = new System.Windows.Forms.Button();
            this.Inscripcion = new System.Windows.Forms.Button();
            this.Consultar = new System.Windows.Forms.Button();
            this.registerStudent1 = new Labo9.RegisterStudent();
            this.tableLayoutPanel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // tableLayoutPanel1
            // 
            this.tableLayoutPanel1.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.tableLayoutPanel1.ColumnCount = 4;
            this.tableLayoutPanel1.ColumnStyles.Add(
                new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.ColumnStyles.Add(
                new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.ColumnStyles.Add(
                new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.ColumnStyles.Add(
                new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.Controls.Add(this.Estudiante, 0, 0);
            this.tableLayoutPanel1.Controls.Add(this.Materia, 1, 0);
            this.tableLayoutPanel1.Controls.Add(this.Inscripcion, 2, 0);
            this.tableLayoutPanel1.Controls.Add(this.Consultar, 3, 0);
            this.tableLayoutPanel1.Controls.Add(this.registerStudent1, 0, 1);
            this.tableLayoutPanel1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.tableLayoutPanel1.Location = new System.Drawing.Point(0, 0);
            this.tableLayoutPanel1.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.tableLayoutPanel1.Name = "tableLayoutPanel1";
            this.tableLayoutPanel1.RowCount = 2;
            this.tableLayoutPanel1.RowStyles.Add(
                new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 15F));
            this.tableLayoutPanel1.RowStyles.Add(
                new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 85F));
            this.tableLayoutPanel1.Size = new System.Drawing.Size(800, 562);
            this.tableLayoutPanel1.TabIndex = 0;
            
            // 
            // Estudiante
            // 
            this.Estudiante.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.Estudiante.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.Estudiante.Dock = System.Windows.Forms.DockStyle.Fill;
            this.Estudiante.Font = new System.Drawing.Font("Segoe UI", 13.8F, System.Drawing.FontStyle.Regular,
                System.Drawing.GraphicsUnit.Point, ((byte) (0)));
            this.Estudiante.Location = new System.Drawing.Point(3, 2);
            this.Estudiante.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Estudiante.Name = "Estudiante";
            this.Estudiante.Size = new System.Drawing.Size(194, 80);
            this.Estudiante.TabIndex = 0;
            this.Estudiante.Text = "Estudiante";
            this.Estudiante.UseVisualStyleBackColor = false;
            this.Estudiante.Click += new System.EventHandler(this.button1_Click);
            // 
            // Materia
            // 
            this.Materia.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.Materia.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.Materia.Dock = System.Windows.Forms.DockStyle.Fill;
            this.Materia.Font = new System.Drawing.Font("Segoe UI", 13.8F, System.Drawing.FontStyle.Regular,
                System.Drawing.GraphicsUnit.Point, ((byte) (0)));
            this.Materia.Location = new System.Drawing.Point(203, 2);
            this.Materia.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Materia.Name = "Materia";
            this.Materia.Size = new System.Drawing.Size(194, 80);
            this.Materia.TabIndex = 1;
            this.Materia.Text = "Materia";
            this.Materia.UseVisualStyleBackColor = false;
            this.Materia.Click += new System.EventHandler(this.button2_Click);
            // 
            // Inscripcion
            // 
            this.Inscripcion.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.Inscripcion.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.Inscripcion.Font = new System.Drawing.Font("Segoe UI", 13.8F, System.Drawing.FontStyle.Regular,
                System.Drawing.GraphicsUnit.Point, ((byte) (0)));
            this.Inscripcion.Location = new System.Drawing.Point(403, 2);
            this.Inscripcion.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Inscripcion.Name = "Inscripcion";
            this.Inscripcion.Size = new System.Drawing.Size(194, 78);
            this.Inscripcion.TabIndex = 2;
            this.Inscripcion.Text = "Inscripción";
            this.Inscripcion.UseVisualStyleBackColor = false;
            this.Inscripcion.Click += new System.EventHandler(this.button3_Click);
            // 
            // Consultar
            // 
            this.Consultar.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.Consultar.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.Consultar.Dock = System.Windows.Forms.DockStyle.Fill;
            this.Consultar.Font = new System.Drawing.Font("Segoe UI", 13.8F, System.Drawing.FontStyle.Regular,
                System.Drawing.GraphicsUnit.Point, ((byte) (0)));
            this.Consultar.Location = new System.Drawing.Point(603, 2);
            this.Consultar.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Consultar.Name = "Consultar";
            this.Consultar.Size = new System.Drawing.Size(194, 80);
            this.Consultar.TabIndex = 3;
            this.Consultar.Text = "Consultar";
            this.Consultar.UseVisualStyleBackColor = false;
            this.Consultar.Click += new System.EventHandler(this.button4_Click);
            // 
            // registerStudent1
            // 
            this.tableLayoutPanel1.SetColumnSpan(this.registerStudent1, 4);
            this.registerStudent1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.registerStudent1.Location = new System.Drawing.Point(3, 88);
            this.registerStudent1.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.registerStudent1.Name = "registerStudent1";
            this.registerStudent1.Size = new System.Drawing.Size(794, 470);
            this.registerStudent1.TabIndex = 4;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 562);
            this.Controls.Add(this.tableLayoutPanel1);
            this.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.Name = "Form1";
            this.Text = "Form1";
            this.tableLayoutPanel1.ResumeLayout(false);
            this.ResumeLayout(false);
        }

        #endregion

        private System.Windows.Forms.TableLayoutPanel tableLayoutPanel1;
        private Labo9.RegisterStudent registerStudent1;
        private System.Windows.Forms.Button Estudiante;
        private System.Windows.Forms.Button Consultar;
        private System.Windows.Forms.Button Inscripcion;
        private System.Windows.Forms.Button Materia;
    }
}