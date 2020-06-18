using System.Collections.Generic;
using System.Linq;
using System;
using Labo6.Properties;

namespace Labo6
{
    internal class Menu
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Bienvenido al Sistema de notas");
        
            List<Evaluation> evaluaciones = new List<Evaluation>();
            bool o = true;
            int x;
            do
            {
                x = PMenu();
                switch (x)
                {
                    case 1:
                        Evaluation v;
                        try
                        {
                            v = AddEvaluacion();
                        }
                        catch (NullReferenceException e)
                        {
                            Console.WriteLine("ERROR");
                            break;
                        }
        
                        try
                        {
                            if (Per(evaluaciones, v) == false)
                            {
                                Console.WriteLine("Error");
                                throw new Exception();
                            }
                        }
                        catch (Exception b)
                        {
                            Console.WriteLine(" ");
                            break;
                        }
                        try
                        {
                            evaluaciones.Add(v);
                        }
                        catch (Exception b)
                        {
                            Console.WriteLine("ERROR");
                            break;
                        }
                        Console.WriteLine(" ");
                        break;
                    case 2:
                        LEvaluaciones(evaluaciones);
                        break;
                    case 3:
                        String remove = Delete(evaluaciones);
                        if (remove == null)
                        {
                            break;
                        }
                        evaluaciones.RemoveAll(eva => eva.Nom == remove);
                        Console.WriteLine("Ha sido eliminado");
                        break;
                    case 4:
                        float note=0.0f;
                        try
                        {
                            note= Nota.Calculo(evaluaciones);
                            if (note == -1.0f)
                            {
                                throw new Exception();
                            }
                        }
                        catch (Exception b)
                        {
                            Console.WriteLine(" ");
                            break;
                        }
                        Console.WriteLine("Su nota es: "+ note);
                        o = false;
                        break;
                    default:
                        Console.WriteLine(" ");
                        break;
                }
            } while (o);
        }
        
        private static int PMenu()
        {
            int x =0;
            try
            { 
                Console.WriteLine(
                    "SELECCIONAR : \n1.Agregar una Evaluacion.\n2.Catalogo de evaluaciones.\n3. Eliminar una" +
                    " evaluacion del catalogo.\n" +
                    "4.salir.\n");
                        x = Convert.ToInt32(Console.ReadLine());
        
                        if (x > 4 || x < 1)
                        {
                            throw new NNE("ERROR");
                        }
        
            }
            catch (NNE b)
            {
                Console.WriteLine(b.Message);
            }
            catch (FormatException b)
            {
                Console.WriteLine("ERROR");
            }
        
        
            return x;
        }
        
        public static bool Per(List<Evaluation> evaluaciones, Evaluation v)
        {
            int per= 0;
            evaluaciones.ForEach(eva => { per += eva.Percentage; });
        
            return (v.Percentage + per) <= 100;
        }
        
        public static Evaluation AddEvaluacion()
        {
            int s = 0;
            bool o = true;
            do
            {
                try
                {
                    Console.WriteLine("SELECCIONA para agregar\n1. Laboratorio\n2. Parcial\n3. Tarea\n" +
                                      "4. Volver a menu principal");
                    s = Convert.ToInt32(Console.ReadLine());
        
                    if (s > 4 || s < 1)
                    {
                        throw new NNE("ERROR");
                    }
                }
                catch (NNE b)
                {
                    Console.WriteLine(b.Message);
                }
                catch (FormatException b)
                {
                    Console.WriteLine("ERROR");
                }
                catch (Exception b)
                {
                    Console.WriteLine(b);
                }
                switch (s)
                {
                    case 1:
                        return labo();
                    case 2:
                        return par();
                    case 3:
                        return tarea();
                    case 4:
                        o = false;
                        break;
                    default:
                        Console.WriteLine("ERROR");
                        break;
                }
        
            } while (o);
        
            return null;
                }
        
        private static Evaluation labo()
        {
            int p = 0;
            String nom, type;
            Console.WriteLine("Valor del laboratorio (porcentaje): \n");
            try
            {
                p = PC();
            }
            catch (IOB b)
            {
                Console.WriteLine(b.Message);
                return null;
            }
            Console.WriteLine("Nombre de su laboratorio: \n");
            nom = Console.ReadLine();
            Console.WriteLine("Tipo: \n");
            type = Console.ReadLine();
                    
            return new Labo(p, nom, type);
        }
                
        private static Evaluation par()
        {
            int percent = 0, numP=0;
            String nomb;
            Console.WriteLine("Valor del parcial: \n");
            try
            {
                percent = PC();
            }
            catch (IOB b)
            {
                Console.WriteLine(b.Message);
                return null;
            }
            Console.WriteLine("Nombre del parcial: \n");
            nomb = Console.ReadLine();
            try
            {
                Console.WriteLine("Cuantas preguntas tiene?: \n");
                numP = Convert.ToInt32(Console.ReadLine());
                if (numP <= 0)
                {
                    throw new IOB("ERROR");
                }
            }
            catch (IOB b)
            {
                Console.WriteLine(b.Message);
                return null;
            }
            return new parcial(percent, nomb, numP);
        }
        
        private static Evaluation tarea()
        {
            int percent = 0, numP=0;
            String nomb;
            Console.WriteLine("Valor de la tarea: \n");
            try
            {
                percent = PC();
            }
            catch (IOB b)
            {
                Console.WriteLine(b.Message);
                return null;
            }
            Console.WriteLine("Nombre de la tarea: \n");
            nomb = Console.ReadLine();
            int d = 0, m = 0;
            try
            {
                Console.WriteLine("\nFecha para entregar: ");
                Console.WriteLine("DIA: ");
                d = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("MES: ");
                m = Convert.ToInt32(Console.ReadLine());
            }
            catch (ArgumentOutOfRangeException b)
            {
                Console.WriteLine("ERROR");
                return null;
            }
            catch (IOB b)
            {
                Console.WriteLine(b.Message);
                return null;
            }
            catch (Exception b)
            {
                Console.WriteLine("ERROR");
                return null;
            }
            return new Homewrk(percent, nomb, new DateTime(2020, m, d));
        }
        
        private static int PC()
        {
            int p;
                   
            p = Convert.ToInt32(Console.ReadLine());
            if (p > 100 || p < 0)
            {
                throw new IOB("ERROR");
            }
                    
            return p;
        }
        private static String Delete(List<Evaluation> e)
        {
            Console.WriteLine("Que evaluacion desea eliminar?: ");
            String nom = Console.ReadLine();
            try
            {
                int s = 0;
                foreach (var evaluacion in e)
                {
                    if (evaluacion.Nom.Equals(nom))
                    {
                        s++;
                    }
                }
                        
                if (s == 0)
                {
                    throw new NNE("ERROR, NO EXISTE.");
                }
            }
            catch (Exception b)
            {
                Console.WriteLine(b.Message);
                return null;
            }
                        
            return nom;
        }
        
        private static void LEvaluaciones(List<Evaluation> evaluaciones)
        {
            if (evaluaciones?.Any() != true)
            {
                Console.WriteLine("No hay elementos por mostrar");
            }
            else
            {
                bool a = false, c = false, d = false;
                        
                foreach (var v in evaluaciones)
                {
                    if (v is parcial)
                    {
                        a = true;
                    }
                    if (v is Labo)
                    {
                        c = true;
                    }
                    if (v is Homewrk)
                    {
                        d = true;
                    }
                }
                if (a)
                {
                    var exams = from evaluacion in evaluaciones
                        where evaluacion is parcial select evaluacion;
                    Console.WriteLine("\nParciales: ");
                    foreach (var evaluacion in exams)
                    {
                        Console.WriteLine(evaluacion.Nom + ", Porcentaje: " +evaluacion.Percentage+ "%");
                    }
                }
                if (c)
                {
                    var labs = from evaluacion in evaluaciones where evaluacion 
                                is Labo select evaluacion;
                    Console.WriteLine("\nLaboratorios: ");
                    foreach (var evaluacion in labs)
                    {
                        Console.WriteLine(evaluacion.Nom + ", Porcentaje: " +evaluacion.Percentage+ "%");
                    }
                }
                if (d)
                {
                    var hws = from evaluacion in evaluaciones where evaluacion
                        is Homewrk select evaluacion;
                    Console.WriteLine("\nTarea: ");
                    foreach (var evaluacion in hws)
                    {
                        Console.WriteLine(evaluacion.Nom + ", Porcentaje: " +evaluacion.Percentage+ "%");
                    }
                }
            }
        }
                
    }
}