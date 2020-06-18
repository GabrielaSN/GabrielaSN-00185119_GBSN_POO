using System;
namespace Labo5
{
    public static class RecMethod
    { 
        private static void Rcr(int num, int s)
        {
            s++;
            Console.WriteLine(" "+s);
              
            if (s <num)
            {
                Rcr(num, s);
            }
            else if (s == num)
            {
                return;
            }
                          
            Console.WriteLine(" "+ s);
        }
        
      public static void Met()
      {
          Console.WriteLine("Metodo de Recursion ");
          Console.WriteLine("Inserte su numero pivote: ");
          int input = Convert.ToInt32(Console.ReadLine());
                  
          Console.WriteLine("La secuencia numerica es: ");
          int s = 0;
          Rcr(input, s);
      }
    }
}