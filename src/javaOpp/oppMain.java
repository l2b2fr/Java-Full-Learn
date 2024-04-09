package javaOpp;

import java.util.Scanner;

import javaOpp.javaOpp1.exerciseOpp1;
import javaOpp.javaOpp2.exerciseOpp2;
import javaOpp.javaOpp3.exerciseOpp3;

public class oppMain {
    private static void menu(Scanner scanner) {
        int values;
        boolean success = false;

        System.out.println("\nBài 1: Tạo lớp “Library” với một bộ sưu tập sách và các phương thức để thêm và xóa sách.");
        System.out.println("\nBài 2: Tạo lớp “Person” với thuộc tính tên và tuổi. Tạo hai đối tượng của lớp “Person”, thiết lập thuộc tính bằng constructor và in tên và tuổi của chúng.");
        System.out.println("\nBài 3: Tạo lớp “Dog” với thuộc tính tên và giống. Tạo hai đối tượng của lớp “Dog”, thiết lập thuộc tính của chúng bằng constructor và điều chỉnh thuộc tính bằng các phương thức setter, sau đó in các giá trị đã cập nhật.");
        System.out.println("0: Thoát");

        do {
            System.out.println("\nNhập lựa chọn của bạn: ");
            values = scanner.nextInt();
            switch (values) {
                case 1:
                    exerciseOpp1.run();
                    success = true;
                    break;
                case 2:
                    exerciseOpp2.run();
                    success = true;
                    break;
                case 3:
                    exerciseOpp3.run();
                    success = true;
                    break;
                case 0:
                    System.out.println("1");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập sai lựa chọn, vui lòng chọn lại.");
            }
        } while (success == false);
    }

    public static void oppMenu() {
        Scanner scanner = new Scanner(System.in);
        menu(scanner);
        scanner.close();
    }
}