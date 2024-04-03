import java.util.*;

public class Main {
    private static void menu(Scanner scanner) {
        int values;
        boolean sucess = false;

        System.out.println("1: Chương trình 1");
        System.out.println("2: Chương trình 2");
        System.out.println("3: Chương trình 3");
        System.out.println("4: Chương trình 4");
        System.out.println("5: Thoát");

        do {
            System.out.print("Nhập lựa chọn của bạn: ");
            values = scanner.nextInt();

            switch (values) {
                case 1:
                    System.out.println("Lựa chọn 1");
                    sucess = true;
                    break;
                case 2:
                    System.out.println("Lựa chọn 2");
                    sucess = true;
                    break;
                case 3:
                    System.out.println("Lựa chọn 3");
                    sucess = true;
                    break;
                case 4:
                    System.out.println("Lựa chọn 4");
                    sucess = true;
                    break;
                case 5:
                    System.out.println("Bạn đã chọn thoát");
                    sucess = true;
                    break;
                default:
                    System.out.println("Nhập sai lựa chọn, vui lòng chọn lại.");
            }
        } while (sucess==false);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu(scanner);
        scanner.close();
    }
}
