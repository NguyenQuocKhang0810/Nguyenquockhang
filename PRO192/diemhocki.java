import java.util.Scanner;

public class diemhocki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diemchuyencan, diemgiuaki, diemcuoiki;
        
        System.out.println("Nhap diemchuyencan =");
        diemchuyencan = sc.nextDouble();
        diemchuyencan = diemchuyencan * 0.1; 
        
        System.out.println("Nhap diemgiuaki =");
        diemgiuaki = sc.nextDouble();
        diemgiuaki = diemgiuaki * 0.2;
        
        System.out.println("Nhap diemcuoiki =");
        diemcuoiki = sc.nextDouble();
        diemcuoiki = diemcuoiki * 0.7;
        
        double diemhocphan = diemchuyencan + diemgiuaki + diemcuoiki;
        System.out.println("Diem tong ket =" + diemhocphan);
    }
}
