using System.Collections.Generic;
using System;

namespace Labo6
{
    public static class Nota
    {
        public static float Calculo(List<Evaluation> v)
        {
            float note = 0.0f;
            foreach (var evaluacion in v)
            {
                try
                {
                    Console.WriteLine("INGRESE SU NOTA: " + evaluacion.Nom + ". ");
                    float g = 0f, s = 0f;
                    g = float.Parse(Console.ReadLine());
                    if (g > 10 || g < 0)
                    {
                        throw new IOB("ERROR! no valido");
                    }
        
                    s = (g * evaluacion.Percentage) / 100;
        
                    note += s;
                }
                catch (IOB e)
                {
                    Console.WriteLine(e.Message);
                    return -1.0f;
                }
                catch (Exception e)
                {
                    Console.WriteLine("ERROR");
                    return -1.0f;
                }
            }
            return note;
        }
    }
}