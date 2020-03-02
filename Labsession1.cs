using System;
namespace Labsession1
{
    public class Fibonaci
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Nhap n = ");
            int n = Convert.ToInt32(Console.ReadLine());
            int a = FindFibonaci(n);
            Console.WriteLine("So nguyen to lon nhat nho hon n la: "+a);
        }
        
        static int FindFibonaci(int x)
        {
            int a = 1;
            int b = 2;
            int c = a + b;
            while (c < x)
            {
                a = b;
                b = c;
                c = a + b;
            }
            return b;
        }
    }
}