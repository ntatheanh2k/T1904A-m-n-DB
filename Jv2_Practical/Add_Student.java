package Jv2_Practical;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Add_Student {
    public ArrayList<Student> listStudent;

    public Add_Student() {
        listStudent = new ArrayList<Student>();
    }
    public void addStudent(){
        System.out.println("Moi nhap sinh vien vao phong");
        Student newstudent = new Student();
        listStudent.add(newstudent);
    }
    public void showStudent(){
        System.out.println("hien thi ho so sinh vien:");
        for(Student st:listStudent){
            System.out.println("ID: "+st.getId()+" - Name: "+st.getName()+" - Age: "
                    +st.getAge()+" - Adress: "+st.getAddress()+" - Phone: "+st.getPhone());
        }
    }

}
