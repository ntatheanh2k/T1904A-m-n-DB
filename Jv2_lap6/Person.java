package Jv2_lap6;

public class Person {
    int personID;
    String person_name;
    String company;
    String adress;

    public Person() {
    }
    public Person(String person_name, String company, String adress) {
        this.person_name = person_name;
        this.company = company;
        this.adress = adress;
    }
    public Person(int personID, String person_name, String company, String adress) {
        this.personID = personID;
        this.person_name = person_name;
        this.company = company;
        this.adress = adress;
    }

    public int getPersonID() { return personID; }
    public void setPersonID(int personID) { this.personID = personID; }
    public String getPerson_name() { return person_name; }
    public void setPerson_name(String person_name) { this.person_name = person_name; }
    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }
    public String getAdress() { return adress; }
    public void setAdress(String adress) { this.adress = adress; }

    public String toString(){
        return getPersonID()+" - "+getPerson_name()
                +" - "+getAdress()+" - "+getCompany();
    }
}