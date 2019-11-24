package Jv2_lap4;

public class SoNguyenTo {
    public int snt = 2;
    public int prev_snt;


    public synchronized void soNguyenToTiepTheo(){
        for (int i = snt+1;true;i++) {
            if (checkSNT(i)){
                snt = i;
                notify();
                System.out.println("Next: "+snt);
                return;
            }
        }
    }

    public boolean checkSNT(int n){
        if(n<=1) return false;
        if (n<=3) return true;
        for (int i = 2; i <= n/2; i++) {
            if(n%i==0) return false;
        }
        return true;
    }

    public synchronized void binhphuong(){
        if(prev_snt==snt){
            try{
                wait();
            }
            catch (Exception e){}
        }

        System.out.println("Square: "+snt*snt);
        prev_snt = snt;
    }
}