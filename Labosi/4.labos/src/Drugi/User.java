package Drugi;

public class User {
    private String name;
    private int id;
    private int age;
    private boolean adultStatus;

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        if(age<18)
            this.adultStatus=false;
        else
            this.adultStatus=true;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdultStatus() {
        return adultStatus;
    }
}
