using System;
using System.Collections.Generic;

namespace Labo5
{
    public static class List
    {
        public static void L()
        {
            Console.WriteLine("Guardar en lista");
            Console.WriteLine("Ingrese una cantidad de letras:  ");
            int n = Convert.ToInt32(Console.ReadLine());
            List<Char> List= new List<char>();
            for (int s = 0; s < n; s++)
            {
                Console.WriteLine("ingresar un caracter "+ (s+1)+ ": ");
                char aux = Convert.ToChar(Console.ReadLine());
                        
                if(aux == 'a' || aux == 'e' || aux== 'i'|| aux== 'o'|| 
                   aux== 'u'|| aux== 'A'|| aux== 'E'|| aux=='I'|| aux== 'O'|| aux=='U'){
                    List.Add(aux);
                }
            }
            Console.WriteLine("Se ingresaron la sig. vocales : "+ String.Join(",", List));
        }
    }
}