package Jv2_Asigment1;

public class Fibonaci{
    public static void main(String[] args) {
        System.out.println("tong 20 so Fibo la :");
        totalFibo();
    }

    public static void totalFibo(){
        int S=0;
        int x1= 1,x2=1,x3=2;
        for(int i=4;i<=20;i++){
            x1=x2;
            x2=x3;
            x3=x1+x2;
            S += x3;
        }
        System.out.println("s=" +S);
    }
}