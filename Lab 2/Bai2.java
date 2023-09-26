import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap 1 so: ");
            double num = scanner.nextDouble();
            System.out.println("So vua nhap la: " + num);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Nguoi dung nhap string khong nhap so");
        }
        System.out.println("Ket thuc chuong trinh!!!");
    }

    
}
