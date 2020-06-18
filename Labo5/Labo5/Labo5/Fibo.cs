using System;
namespace Labo5
{
    public class Fibo
    {
        public static void Fbncc()
        {
            Console.WriteLine("Serie Fibonacci");
            Console.WriteLine("Igrese la longitud de la serie:\n");
            int s = Convert.ToInt32(Console.ReadLine());
        
            int x = 0, y = 1, z = 0;
                    
            Console.WriteLine("La serie es: ");
        
            for (int a = 0; a < s; a++)
            {
                if (a == 0)
                {
                    Console.WriteLine(x + " ");
                }
                else if (a == 1)
                {
                    Console.WriteLine(y + " ");
                }
                else
                {
                    Console.WriteLine(x + y + " ");
                    z = x + y;
                    x = y;
                    y = z;
                }
            }
        }
    }
}