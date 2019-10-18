package assigment4;

import java.util.ArrayList;

public class Cart {
    public int id;
    public String customer;
    public int grandTotal=0;
    public String productList;
    public String city;
    public void Cart(){}
    public ArrayList<Product>themcustomer;
    public Cart(){
        themcustomer=new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void  themcustomer(Product u){
        this.themcustomer.add(u);
        System.out.println("da them san pham");
    }
    public void xoacustomer(Product u){
        this.themcustomer.remove(u);
        System.out.println("da xoa san pham");
    }

}
