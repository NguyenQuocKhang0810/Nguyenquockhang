import java.util.Scanner;

public class ktrahotentrongds{
    public static void main(String[] args) {
        String[] danhSachKhoiTao = {"Nguyen quoc khang", "Nguyen dao bach", "Nguyen minh khai"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten can ktra: ");
        String ktraTen = scanner.nextLine();

        boolean tonTai = false;

        for (String hoTen : danhSachKhoiTao) {
            if (hoTen.equals(ktraTen)) {
                tonTai = true;
                break;
            }
        }

        if (tonTai) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
