using System;
namespace Labo5
{
    public static class Palindromo
    {
      public static void Pal()
      {
          Console.WriteLine("Palindromo");
          Console.WriteLine("Ingresar palabra: ");
      
          String input = Console.ReadLine();
      
          int x = 0, y = input.Length - 1;
      
          bool p = true;
      
          while (x <= y)
          {
              if (input[x] != input[y])
              {
                  p = false;
              }
      
              x++;
              y--;
          }
                  
          Console.WriteLine(" Palindrmo? "+ p);
                      
        }  
    }
}