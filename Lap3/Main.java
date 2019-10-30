package Lap3;

public class Main {
    public static void main(String args[]){
        Fraction fc = new Fraction();
        fc.nhapPhanSo();
        fc.inPhanSo();
        fc.rutGonPhanSo();
        fc.inPhanSo();
        fc.nghichDaoPhanSo();
        fc.inPhanSo();
        Fraction fc2 = new Fraction(1,3);

        Fraction tong = fc.addFraction(fc2);
        char a[] = {'a','b','c','d','e'};

    }
}
