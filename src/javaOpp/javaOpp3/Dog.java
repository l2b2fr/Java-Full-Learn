package javaOpp.javaOpp3;

public class Dog {
    private String name;
    private String sex;

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void getInfo() {
        System.out.println("Tên: " + name + " Giống: " + sex);
    }
}
