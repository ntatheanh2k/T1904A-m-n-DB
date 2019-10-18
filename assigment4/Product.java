package assigment4;

public class Product {
    public int id;
    public String productName;
    public int qty;
    public int price;

    public void product(){}
    public void procuct(int id,String productName,int qty,int price){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void soluong(){
        if(getQty()>0){
           System.out.println("con hang");
        }else {
            System.out.println("het hang");
        }
    }
}
