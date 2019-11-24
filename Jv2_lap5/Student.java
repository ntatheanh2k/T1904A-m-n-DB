package Jv2_lap5;

public class Student {
    public int id;
    public String name;
    public int age;
    public double mark;

    public Student() {
    }
    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
    public Student(int id,String name, int age, double mark) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public double getMark() { return mark; }
    public void setMark(double mark) { this.mark = mark; }
}