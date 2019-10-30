package Lap2;

import java.util.Scanner;

public class Session2 {
    private String name;
    private int age;

    public Session2(){

        inputInfo();
        showInfo();
    }

    public static String abc = "good";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showInfo(){
        System.out.println("Fullname: "+name);
        System.out.println("Age: "+age);
        System.out.println(Session2.abc);
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten:");
        setName(sc.nextLine());
        System.out.println("Nhap Tuoi:");
        setAge(sc.nextInt());
    }

    public static void main(String args[]){

        SoNguyenTo snt = new SoNguyenTo();
        for (int i=0;i<10;i++){
            snt.setA(snt.timSoNguyenToTiepTheo());
            System.out.println(snt.getA());
        }
        snt.setA(43);
        System.out.println("Next: "+snt.timSoNguyenToTiepTheo());
    }

    public static void sayHello(){
        Session2 ss3 = new Session2();
        ss3.showInfo();
        System.out.println("Hello World!");
        System.out.println(abc);
    }
}
