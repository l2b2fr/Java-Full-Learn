package javaOpp.javaOpp1;

public class Book {
    private int id;
    private String name;
    public Book(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getNameBook(){
        return this.name;
    }

    public int getIdBook(){
        return this.id;
    }

    public String infoBook(){
        return "Mã: " + this.id + " Tên sách: "+ this.name;
    }
}
