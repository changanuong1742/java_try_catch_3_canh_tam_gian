import java.util.Scanner;

public class TryCatchCanhTamGiac {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Nhap a");
            int a = scanner.nextInt();
            System.out.println("Nhap b");
            int b = scanner.nextInt();
            System.out.println("Nhap c");
            int c = scanner.nextInt();
            if (a < 0 || b < 0 || c < 0) {
                if (a + b < c || a + c < b || b + c < a) {
                    System.out.println("Khong phai hinh tam giac");
                }
            }
        } catch (Exception e) {
            System.out.println("La hinh tam giac");
        }
        System.out.println("Done");
    }

}


