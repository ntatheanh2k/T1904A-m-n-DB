package Jv2_lap4;

public class BankAccount {
    public int account;
    public synchronized void moTaiKhoan(){
        account=10;
        System.out.println("Mo tai khoan thanh cong");
        try {
            notifyAll();
        }catch (Exception e){}
    }
    public synchronized void napTien(){
        if (account==0)
            try {
                wait();
            }catch (Exception e){}
        System.out.println("nap tien vao tai khoan:"+account);

    }
    public synchronized void doiMatKhau(){
        if (account==0)
            try {
                wait();
            }catch (Exception e){}
        System.out.println("doi mat khau :"+account);
        System.out.println("doi mat khau cho tai khoan"+account);
    }
    public synchronized void lamTheAtm(){
        if (account==0)
            try {
                wait();
            }catch (Exception e){}
        System.out.println("lam the ATM:"+account);
        System.out.println("lam the ATM"+account);
    }

}
