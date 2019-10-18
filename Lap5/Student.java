package Lap5;

public class Student extends Person{
    public void Student(){
        System.out.println("Ban da du 18 tuoi chua");
    }
    public Boolean CheckAge() {
        if(age >= 18){
            System.out.println("ban dã du 18 tuoi");
            return true;
        }else{
            System.out.println("ban chua du 18 tuoi");
            return false;
        }
    }
}
