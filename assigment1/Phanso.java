package baitap1;

import java.util.Scanner;

public class Phanso {
    public int tuso;
    public int mauso;
    public Phanso(){
    }
    public Phanso(int tuso,int mauso){

    }

    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Tu So:");
        setTuso(sc.nextInt());
        System.out.println(("Nhap Mau So"));
        setMauso(sc.nextInt());
    }
    public void InPhanso(){
        System.out.println(getTuso()+"/"+getMauso());
    }
    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a-b;
            } else {
                b = b-a;
            }
        }
        return a;
    }
    public void RutGonPhanSo() {
        int i = timUSCLN(this.getTuso(), this.getMauso());
        this.setTuso(this.getTuso() / i);
        this.setMauso(this.getMauso() / i);
    }
}

