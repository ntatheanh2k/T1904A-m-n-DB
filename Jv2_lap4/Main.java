package Jv2_lap4;

public class Main {
    public static void main(String[] args) {
        SoNguyenTo s = new SoNguyenTo();

        new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                s.soNguyenToTiepTheo();
                try{
                    Thread.sleep(10);
                }
                catch (Exception e){};

            }
        }).start();

        new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                s.binhphuong();
                try{
                    Thread.sleep(10);
                }
                catch (Exception e){}
            }
        }).start();


    }
}