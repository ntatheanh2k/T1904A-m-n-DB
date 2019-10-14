package assigment2;

import java.util.Scanner;

public class NhanVien {
    public String name;
    public int age;
    public String address;
    public double salary;
    public int total_time;
    public NhanVien(){
        System.out.println("vua tao mot nhan vien");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int Age){
        this.age=age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getTotalTime() {
        return total_time;
    }

    public void setTotalTime(int totalTime) {
        this.total_time = totalTime;
    }
public void inputInfo(){
   Scanner sc = new Scanner(System.in);
System.out.println("nhap ten nhan vien");
setName(sc.nextLine());
System.out.println("nhap tuoi cua nhan vien");
setAge(sc.nextInt());
System.out.println("nhap dia chi");
setAddress(sc.nextLine());
System.out.println("nhap so luong");
setSalary(sc.nextDouble());
System.out.println("nhap tong thoi gian");
setTotalTime(sc.nextInt());
}
public void printInfo(){
        System.out.println("Ten"+getName());
        System.out.println("Tuoi"+getAge());
        System.out.println("Dia chi"+getAddress());
        System.out.println("So luong"+getSalary());
        System.out.println("Thoi gian"+getTotalTime());
}
public void double tinhThuong(){
        double thuong
                if(getTotalTime()>=200){
                    thuong=getSalary()*0.2;
                }if (getTotalTime()>=100){
                    thuong=getSalary()*0.1;
        }else {
                    thuong=0;
        }
                    return thuong;
    }
}





