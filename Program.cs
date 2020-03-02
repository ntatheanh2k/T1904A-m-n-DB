using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication3
{
    class Program
    {
        static void Main(string[] args)
        {
            Phone testPhone = new Phone("theanh", "display phone", 5686.2f);
            MobilePhone testMobilePhone = new MobilePhone();
            testPhone.display();
            testMobilePhone.display();
        }
    }
}