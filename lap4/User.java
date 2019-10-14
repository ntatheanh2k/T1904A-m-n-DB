package lap4;

public class User {
    public String name;
    public int age;
    public int cmnd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }
    public void getinfo(){
        System.out.println(this.getName());
        System.out.println(this.getAge());
        System.out.println(this.getCmnd());
    }
}
