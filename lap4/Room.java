package lap4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Room {
    public String tenphong;
    public String vitri;
    public ArrayList<User> dsNguoidung;

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public ArrayList<User> getDsNguoidung() {
        return dsNguoidung;
    }

    public void setDsNguoidung(ArrayList<User> dsNguoidung) {
        this.dsNguoidung = dsNguoidung;
    }

    {
    dsNguoidung=new ArrayList<>();
}
    public void themsv(User sv){
        this.dsNguoidung.add(sv);
    }
    public void xoasv(User sv){
        this.dsNguoidung.remove(sv);
    }

    public void inthongtin(){
        System.out.println("ten phong"+this.getTenphong());
        System.out.println("vi tri"+this.getVitri());
        for (int i=0;i<this.dsNguoidung.size();i++) {
            System.out.println(this.dsNguoidung.get(i).getName());
            System.out.println(this.dsNguoidung.get(i).getAge());
            System.out.println(this.dsNguoidung.get(i).getCmnd());
        }
    }
}
