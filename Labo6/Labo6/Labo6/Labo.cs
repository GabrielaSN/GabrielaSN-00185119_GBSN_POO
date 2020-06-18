using System;
namespace Labo6
{
    public class Labo : Evaluation
    {
        private String _type;
        
        public Labo(int percentage, string nom, string type) : base(percentage, nom)
        {
            this._type = type;
        }
    }
}