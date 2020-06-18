using System;

namespace Labo6
{
    public class Evaluation
    { 
        protected int _percentage;
        public int Percentage
        {
            get { return _percentage; }
        }
       
        protected String _nom;
        public String Nom
        {
            get { return _nom; }
        }
       
        public Evaluation(int percentage, string nom)
        {
            this._percentage = percentage;
            this._nom = nom;
        } 
    }
}