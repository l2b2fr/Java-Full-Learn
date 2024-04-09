package javaOpp.javaOpp1;

import java.util.Scanner;

public class exerciseOpp1 {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        library.addBook(new Book(1,"Sách 1"));
        library.addBook(new Book(2,"Sách 2"));
        library.addBook(new Book(3,"Sách 3"));

        library.listBook();

        System.out.println("\nNhập mã sách muốn xóa: ");
        int id = scanner.nextInt();
        library.deleteBook(id);
        library.listBook();
    }
}
