package Lap7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Nhap lua chon cua ban");
        System.out.println("1. Add student");
        System.out.println("2. Edit student by ID");
        System.out.println("3. Delete student by ID");
        System.out.println("4. Sort student by GPA");
        System.out.println("5. Sort student by NAME");
        System.out.println("6. Show student");
        System.out.println("0. Exit");
        ListStudent list1 = new ListStudent();

        Scanner sc = new Scanner(System.in);
        while (true){
            int x = sc.nextInt();
            switch (x){
                case 1:
                    list1.addStudent();
                    break;
                case 2:
                    list1.updateStudent();
                    break;
                case 3:
                    list1.deleteStudent();
                    break;
                case 4:
                    list1.sortbyGPA();
                    break;
                case 5:
                    list1.sortbyName();
                    break;
                case 6:
                    list1.showList();
                    break;
                case 0: return;
            }
            System.out.println("Moi ban lua chon lai: ");
        }

    }
}
