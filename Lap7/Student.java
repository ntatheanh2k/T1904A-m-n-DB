package Lap7;

import java.util.Scanner;
public class Student {
    private int ID;
    private String name;
    private int age;
    private String adress;
    private float gpa;

    public Student() {
        inputStudent();
    }
    public Student(int ID, String name, int age, String adress, float gpa) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.gpa = gpa;
    }
    //co the viet
//    public class Student Comparable<Student>{}
//    public int compareTo(Student o){
//        if(this.getGpa() < o.getGpa()){
//            return -1;
//        }
//        return 0
//    }


    public int getID() { return ID; }
    public void setID(int ID) { this.ID = ID; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getAdress() { return adress; }
    public void setAdress(String adress) { this.adress = adress; }
    public float getGpa() { return gpa; }
    public void setGpa(float gpa) { this.gpa = gpa; }

    public void inputStudent(){
        System.out.println("Nhap thong tin sinh vien: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID: ");
        setID(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap Ten SV: ");
        setName(sc.nextLine());
        System.out.println("Nhap Tuoi SV: ");
        setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap Dia chi: ");
        setAdress(sc.nextLine());
        System.out.println("Nhap GPA: ");
        setGpa(sc.nextFloat());
    }
}
