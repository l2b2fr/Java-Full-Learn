package javaOpp;
import java.util.Scanner;
import javaOpp.javaOpp1.*;

public class oppMain {
    private static void menu(Scanner scanner){
        int values;
        boolean success = false;

        System.out.println("\nBài 1: Tạo lớp “Library” với một bộ sưu tập sách và các phương thức để thêm và xóa sách.");
        System.out.println("0: Thoát");

        do {
            System.out.println("\nNhập lựa chọn của bạn: ");
            values =scanner.nextInt();
            switch (values){
                case 1:
                    exerciseOpp1.run();
                    success = true;
                    break;
                case 0:
                    System.out.println("1");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập sai lựa chọn, vui lòng chọn lại.");
            }
        }while (success == false);
    }

    public static void oppMenu(){
        Scanner scanner = new Scanner(System.in);
        menu(scanner);
        scanner.close();
    }
}