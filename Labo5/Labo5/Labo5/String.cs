using System;
namespace Labo5
{ 
    public static class String
    {
      public static void StringModification()
      {
          Console.WriteLine("Metodo de Recursion");
          Console.WriteLine("Ingrese una cadena de texto: ");
          String input = Console.ReadLine();
     
          char[] inputChars = input.ToCharArray();
                 
          Console.WriteLine("Qué caracter desea modificar? ");
          char x = 'x', y = 'y';
          x = Convert.ToChar(Console.ReadLine());
          Console.WriteLine("Por cuál lo cambiará?: ");
          y = Convert.ToChar(Console.ReadLine());
                 
          Console.WriteLine("El resultado es: ");
          for (int s = 0; s < inputChars.Length; s++)
          {
              if (inputChars[s] == x)
              {
                  inputChars[s] = y;
              }
          }
          string output = new string(inputChars);
                 
          Console.WriteLine(output);
     
        }
    }
}