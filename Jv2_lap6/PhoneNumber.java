package Jv2_lap6;

public class PhoneNumber {
    String number;
    String phonetype;
    int personID;

    public PhoneNumber() {
    }
    public PhoneNumber(String number, String phonetype, int personID) {
        this.number = number;
        this.phonetype = phonetype;
        this.personID = personID;
    }

    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }
    public String getPhonetype() { return phonetype; }
    public void setPhonetype(String phonetype) { this.phonetype = phonetype; }
    public int getPersonID() { return personID; }
    public void setPersonID(int personID) { this.personID = personID; }

    public String toString(){
        return getNumber() + " - " + getPhonetype() + " - " + getPersonID();
    }
}