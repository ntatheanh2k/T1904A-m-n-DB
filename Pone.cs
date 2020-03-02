using System;


namespace ConsoleApplication3
{
    public class Phone
    {
        protected string phonename;
        protected string phonetype;
        protected float phoneprice;

        public Phone()
        {
        }

        public Phone(string phonename, string phonetype, float phoneprice)
        {
            this.phonename = phonename;
            this.phonetype = phonetype;
            this.phoneprice = phoneprice;
        }

        public string PhoneName
        {
            get
            {
                return phonename;
            }

            set
            {
                phonename = value;
            }
        }

        public string PhoneType
        {
            get
            {
                return phonetype;
            }

            set
            {
                phonetype = value;
            }
        }

        public float PhonePrice
        {
            get
            {
                return phoneprice;
            }

            set
            {
                phoneprice = value;
            }
        }


        public void display()
        {
            Console.WriteLine("Phone " + PhoneName + ", type " + PhoneType + ", price " + PhonePrice);
        }
    }
}