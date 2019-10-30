package Practical;

import java.util.Scanner;

public class Hotel {
    public String name;
    public String location;
    public String ownername;

    public Hotel(String name, String localtion, String ownername) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public void inputInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Name");
        setName(sc.nextLine());
        System.out.println("Input localtion");
        setLocation(sc.nextLine());
        System.out.println("Input ownername");
        setOwnername(sc.nextLine());
    }
    public void showInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name" + getName());
        System.out.println("Location" + getLocation());
        System.out.println("OwnerName" + getOwnername());
    }


}
