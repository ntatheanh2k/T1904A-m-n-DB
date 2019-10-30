package Lap7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ListStudent {
    public ArrayList<Student> listStudent;

    public ListStudent() {
        listStudent = new ArrayList<Student>();
    }
    public void addStudent(){
        System.out.println("Moi nhap sinh vien vao phong");
        Student newstudent = new Student();
        listStudent.add(newstudent);
    }
    public void showList(){
        System.out.println("Danh sach cac sinh vien hien tai:");
        for(Student st:listStudent){
            System.out.println("ID: "+st.getID()+" - Name: "+st.getName()+" - Age: "
                    +st.getAge()+" - Adress: "+st.getAdress()+" - GPA: "+st.getGpa());
        }
    }
    public void updateStudent(){
        System.out.println("Nhap ID sinh vien can sua:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(Student st:listStudent){
            if(st.getID() == x){
                System.out.println("Nhap lai ID: ");
                st.setID(sc.nextInt());
                sc.nextLine();
                System.out.println("Nhap lai Ten SV: ");
                st.setName(sc.nextLine());
                System.out.println("Nhap lai Tuoi SV: ");
                st.setAge(sc.nextInt());
                sc.nextLine();
                System.out.println("Nhap lai Dia chi: ");
                st.setAdress(sc.nextLine());
                System.out.println("Nhap lai GPA: ");
                st.setGpa(sc.nextFloat());
            }
        }
    }
    public void deleteStudent(){
        System.out.println("Nhap ID sinh vien can xoa:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(Student st:listStudent){
            if(st.getID() == x){
                listStudent.remove(st);
                return;
            }
        }
    }
    public void sortbyGPA(){
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getGpa() < o2.getGpa()) return -1;
                else return 0;
            }
        });
    }

    public void sortbyName(){
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

}
