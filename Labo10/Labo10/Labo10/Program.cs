using System;
using System.Collections.Generic;
namespace Labo10
{
    internal class Program
    {
      private delegate void D(List<CBancaria> p);
        private static D cuentas;
      
        public static void Main(string[] args)
        { 
            string m = "1) AGREGAR una Cuenta de Banco.\n" +
                     "2) Cuentas almacenadas. \n" +
                     "3) Cuentas almacenadas y total.\n" +
                     "4) Cuentas almacenadas,total y cuentas con nombres con " +
                     "inicial vocal. \n" +
                     "5. TERMINAR";
            
            var C = new List<CBancaria>();
            int s = 0, balance= 0;
            string nom = "";

            Console.WriteLine("BIENVENIDOS AL SISTEMA DEL BANCO AGRICOLA");
                  
            do
            {
                Console.WriteLine("Que acción desea realizar?:");
                Console.WriteLine(m);
                s = Convert.ToInt32(Console.ReadLine());
                switch (s)
                {
                    case 1 : 
                        Console.Write("NOMBRE DE PROPIETARIO: ");
                        nom = Console.ReadLine();
                        Console.Write("DIGITE CANTIDAD: ");
                        balance = Convert.ToInt32(Console.ReadLine());
                        C.Add(new CBancaria(nom,balance));
                        break;
                    
                    case 2 :
                        VerDatos(C);
                        break;
                    
                    case 3 :
                        cuentas = VerDatos;
                        cuentas += TotalCuentas;
                        cuentas.Invoke(C);
                        break;
                    
                    case 4:
                        Action<List<CBancaria>> Act = (p) =>
                        {
                            Console.WriteLine("CUENTAS EN ACTIVIDAD");
                            foreach (var VARIABLE in p)
                            {
                                Console.WriteLine(
                                    "NOMBRE:" + VARIABLE._persona + " SALDO:" + VARIABLE._balance + "\n");
                            }
                        };
                        
                        Act += (p) =>
                        {
                            Console.WriteLine("TOTAL DE CUENTAS");
                            int numC = 0;
                            foreach (var VARIABLE in p)
                            {
                                numC += 1;
                            }
      
                            Console.WriteLine(numC.ToString());
                        };
      
                        Act += (p) =>
                        {
                            foreach (var VARIABLE in p)
                            {
                                if (VARIABLE._persona.Substring(0, 1) == "a" ||
                                    VARIABLE._persona.Substring(0, 1) == "A" ||
                                    VARIABLE._persona.Substring(0, 1) == "e" ||
                                    VARIABLE._persona.Substring(0, 1) == "E" ||
                                    VARIABLE._persona.Substring(0, 1) == "i" ||
                                    VARIABLE._persona.Substring(0, 1) == "I" ||
                                    VARIABLE._persona.Substring(0, 1) == "o" ||
                                    VARIABLE._persona.Substring(0, 1) == "O" ||
                                    VARIABLE._persona.Substring(0, 1) == "u" ||
                                    VARIABLE._persona.Substring(0, 1) == "U")
                                {
                                    Console.WriteLine("CUENTAS QUE INICIAN CON UNA VOCAL");
                                    Console.WriteLine(
                                        "NOMBRE=" + VARIABLE._persona + " SALDO:" + VARIABLE._balance + "\n");
                                }
                            }
                        };
                              
                        Act.Invoke(C);
      
                        break;
                    case 5:
                        Console.WriteLine("¡HASTA PRONTO!");
                        break;
                    default:
                        Console.WriteLine("ERROR");
                        break;
                }        
            } while (s!=5);
        }
        public static void TotalCuentas(List<CBancaria> p)
        {
            Console.WriteLine("TOTAL");
            int numC = 0;
            foreach (var VARIABLE in p)
            {
                numC += 1;
            }
              
            Console.WriteLine(numC.ToString());
        }
      
        public static void VerDatos(List<CBancaria> p)
        {
            Console.WriteLine("CUENTAS ACTIVAS");
            foreach (var VARIABLE in p)
            {
                Console.WriteLine("NOMBRE="+VARIABLE._persona+" SALDO:"+VARIABLE._balance+"\n");
            }
        }
    }
}