namespace Labo6
{
    public class parcial : Evaluation
    {
       private int _Preguntas;
       
               public parcial(int percentage, string nom, int numPreguntas) : base(percentage, nom)
               {
                   this._Preguntas = numPreguntas;
               } 
    }
}