import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
    int n = 0;
    Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Nhap vao n: ");
            n = sc.nextInt();
            int error = n/0;
        } catch (ArithmeticException e) {
            System.out.println("Khong the chia cho 0 ");
            System.out.println(n);
        }finally{
            System.out.println("Finally!!");
        }

        System.out.println("Ket thuc chuong trinh");
    }
}
