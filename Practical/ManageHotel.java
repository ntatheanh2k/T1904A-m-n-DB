package Practical;
import java.util.ArrayList;
import java.util.Scanner;
public class ManageHotel {
    public ArrayList<Hotel> hotelList=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    public void addHotel(){
        for (int i=0;i<10;i++){
            System.out.println("Input Name");
            String name=sc.nextLine();
            System.out.println("Input Localtion");
            String localtion =sc.nextLine();
            System.out.println("Input OwnerName");
            String ownername =sc.nextLine();
            Hotel hotel=new Hotel(name,localtion,ownername);
            hotelList.add(hotel);
        }
    }
    public void showHotel() {
        System.out.println("input ownerName to show detail");
        String ownerName;
        Scanner sc = new Scanner(System.in);
        ownerName = sc.nextLine();

        for(Hotel h:hotelList) {
            if (h.getOwnername().equals(ownerName)) {
                h.showInfo();
            }
        }
    }
}

