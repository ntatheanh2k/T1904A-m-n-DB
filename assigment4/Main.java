package assigment4;
import java.util.Scanner;

public class Main {
   public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        Product u=new Product();
        System.out.println("nhap id");
        u.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ProductName");
        u.setProductName(sc.nextLine());
        System.out.println("Nhap qty");
        u.setQty(sc.nextInt());
        System.out.println("nhap Price");
        u.setPrice(sc.nextInt());

        u.soluong();

        //=============================123======
        Scanner c=new Scanner(System.in);
        Cart c1 = new Cart();
        System.out.println("Nhap id");
        c1.setId(c.nextInt());
        c.nextLine();
        System.out.println("Nhap customer");
        c1.setCustomer(c.nextLine());
        System.out.println("Nhap city");
        c1.setCity(c.nextLine());

        c1.themcustomer(u);

   }
}
