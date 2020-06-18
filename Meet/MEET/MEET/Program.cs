using System;
using System.Collections.Generic;
namespace MEET
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            var p = new List<Person>();
            p.Add(new Person("Walter", "Rafael", 20));
            p.Add(new Person(nombre: "Baltar", edad:19));
            p.Add(new Person(edad: 22));
            p.Add(new Person(apellido:"Morales"));
            
            String buscar = "walter";
            buscar = Console.ReadLine();
            
            p.ForEach(person =>
            {
                if (buscar.Equals(person.Nombre))
                {
                    Console.WriteLine("Nuevo Nombre: ");
                    person.Nombre = Console.ReadLine();
                    Console.WriteLine(person.ToString());
                }
            });
            
            int añadir = 12;
            int árbol = 14;

        }
    }
}