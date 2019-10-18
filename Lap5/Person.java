package Lap5;

import java.util.Scanner;

public class Person {
    public String name;
    public String gender;
    public int age;
    public String address;

    public void Person(){

    }
    public void Person(String name,String gender,int age,String address){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInfo(){
        Scanner ab=new Scanner(System.in);
        System.out.println("nhap ten");
        setName(ab.nextLine());
        System.out.println("nhap gioi tinh");
        setGender(ab.nextLine());
        System.out.println("nhap tuoi");
        setAge(ab.nextInt());
        ab.nextLine();
        System.out.println("nhap dia chi");
    }
    public void showInfo(){
        System.out.println("Name"+getName());
        System.out.println("Gender"+getGender());
        System.out.println("Age"+getAge());
        System.out.println("Address"+getAddress());

    }
}
