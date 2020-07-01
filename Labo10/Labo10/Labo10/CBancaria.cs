namespace Labo10
{
    public class CBancaria
    {
         public readonly string _persona;
                public readonly double _balance;
        
                public CBancaria(string persona = "unnamed", double balance = 0)
                {
                    _persona = persona;
                    _balance = balance;
                }
    }
}