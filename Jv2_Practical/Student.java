package Jv2_Practical;

import java.util.Scanner;

public class Student {
    public int id;
    public String name;
    public String address;
    public int age;
    public int phone;

    public Student(){}

    public Student(int id,String name,String address,int age,int phone){
        this.id=id;
        this.name=name;
        this.address=address;
        this.age=age;
        this.phone=phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void inputStudent(){
        System.out.println("Nhap thong tin sinh vien");
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ID: ");
        setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap Ten SV: ");
        setName(sc.nextLine());
        System.out.println("Nhap Tuoi SV: ");
        setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap Dia chi: ");
        setAddress(sc.nextLine());
        System.out.println("Nhap so dien thoai");
        setPhone(sc.nextInt());
    }
}
