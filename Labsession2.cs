using System;
using System.Collections.Generic;

namespace Labsession2 
{
    public class Product
    {
        private int id;
        private string name;
        private double price;
        private int qty;
        private string image;
        private string description;
        private List<string> gallery;

        public Product()
        {
            this.gallery = new List<string>();
        }

        public Product(int id, string name, double price, int qty, string image, string description)
        {
            this.id = id;
            this.name = name;
            this.price = price;
            this.qty = qty;
            this.image = image;
            this.description = description;
            this.gallery = new List<string>();
            
            
        }

        public int Id
        {
            get => id;
            set => id = value;
        }

        public string Name
        {
            get => name;
            set => name = value;
        }

        public static void Notification(string msg)
        {
            Console.WriteLine(msg);
        }

        public int Qty
        {
            get => qty;
            set => qty = value;
        }

        public string Image
        {
            get => image;
            set => image = value;
        }

        public string Description
        {
            get => description;
            set => description = value;
        }

        public void GetInfo()
        {
            Console.WriteLine(Id+"-"+Name+"-"+Price);
        }

        public double Price
        {
            get => price;
            set => price = value;
        }

        public bool CheckStock()
        {
            return Qty > 0;
        }

        public void AddGallery(string newImage)
        {
            if (this.gallery.Count >= 10)
            {
                Console.WriteLine("Phai xoa bot anh di");
                return;
            }
            this.gallery.Add(newImage);
        }

        public void RemoveGallery()
        {
            for (int i = 0; i < gallery.Count; i++)
            {
                Console.WriteLine(i+"."+gallery[i]);
            }
            Console.WriteLine("Chon anh de xoa");
            int v = Convert.ToInt32(Console.ReadLine());
            gallery.RemoveAt(v);
        }
    }
    
}