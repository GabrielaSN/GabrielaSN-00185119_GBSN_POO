using System;
namespace Labo6
{
    public class Homewrk : Evaluation
    {
        private DateTime Entrega { get; }
       
        public Homewrk(int percentage, string nom, DateTime fechaEntrega) : base(percentage, nom)
        {
            Entrega = fechaEntrega;
        } 
    }
}