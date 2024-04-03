import java.util.*;
import static javaOpp.oppMain.oppMenu;

public class Main {
    public static void menu(Scanner scanner) {
        int values;
        boolean success = false;

        System.out.println("\n1: Bài tập về OPP");
        System.out.println("2: Chương trình 2");
        System.out.println("3: Chương trình 3");
        System.out.println("4: Chương trình 4");
        System.out.println("5: Thoát");

        do {
            System.out.print("\nNhập lựa chọn của bạn: ");
            values = scanner.nextInt();

            switch (values) {
                case 1:
                    oppMenu();
                    success = true;
                    break;
                case 2:
                    System.out.println("Lựa chọn 2");
                    success = true;
                    break;
                case 3:
                    System.out.println("Lựa chọn 3");
                    success = true;
                    break;
                case 4:
                    System.out.println("Lựa chọn 4");
                    success = true;
                    break;
                case 5:
                    System.out.println("Bạn đã chọn thoát");
                    success = true;
                    break;
                default:
                    System.out.println("Nhập sai lựa chọn, vui lòng chọn lại.");
            }
        } while (success==false);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu(scanner);
        scanner.close();
    }
}
