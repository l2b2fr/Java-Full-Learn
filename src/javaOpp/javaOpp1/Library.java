package javaOpp.javaOpp1;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(int id) {
        for (int i = 0; i < books.size(); i++) {
                Book idBook = books.get(i);
                if(idBook.getIdBook() == id){
                    books.remove(i);
                    System.out.println("Đã xóa sách thành công\n");
                    return;
                }
        }
        System.out.println("Không tìm thấy sách muốn xóa\n");
    }

    public void listBook() {
        System.out.println("Những quyển sách trong thư viện: \n");
        for (Book i : books) {
            System.out.println(i.infoBook());
        }
    }
}
