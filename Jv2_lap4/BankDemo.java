package Jv2_lap4;

public class BankDemo {
    public static void main(String args[]){
        BankAccount b=new BankAccount();
        new Thread(()->{
            b.lamTheAtm();
        }).start();
        new Thread(()->{
            b.doiMatKhau();
        }).start();
        new Thread(()->{
            b.moTaiKhoan();
        }).start();
    }
}
