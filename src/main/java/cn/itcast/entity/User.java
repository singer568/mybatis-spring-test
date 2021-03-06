package cn.itcast.entity;

public class User {
    private int id;
    private int age;
    private String name;

    public User(int id,String name, int age) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    //需要添加，不然报错
    public User() {
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
