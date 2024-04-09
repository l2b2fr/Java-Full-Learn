package javaOpp.javaOpp2;

public class Person {
    private String ten;
    private int tuoi;

    public Person(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return this.ten;
    }

    public int getTuoi() {
        return this.tuoi;
    }

    public void getInfo() {
        System.out.println("Tên: " + this.ten + " Tuổi là: " + this.tuoi);
    }
}
