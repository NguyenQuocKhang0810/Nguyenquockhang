public class Lab3 {
    private String email;
    private String hoTen;
    private int namSinh;
    private String gioiTinh;
    private String soDienThoai;
    private String diaChi;

    public Lab3(String email, String hoTen, int namSinh, String gioiTinh, String soDienThoai, String diaChi) {
        this.email = email;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
    }

    public void hienThiTatCaThongTin() {
        System.out.println("Email: " + email);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("So dien thoai: " + soDienThoai);
        System.out.println("Dia chi: " + diaChi);
    }

    public void thayDoiSoDienThoai(String newPhone) {
        this.soDienThoai = newPhone;
    }

    public void thayDoiDiaChi(String newAddress) {
        this.diaChi = newAddress;
    }

    public static void main(String[] args) {
        Lab3 sinhVien = new Lab3("quockhang972@gmail.com", "Nguyen Quoc Khang", 2004, "Nam", "0336642035", "73 duong 1 thang 5, Quy Nhon");
        sinhVien.hienThiTatCaThongTin();
        
        
        sinhVien.thayDoiSoDienThoai("123456789");
        sinhVien.thayDoiDiaChi("55 Le Hong Phong, Quy Nhon");
        
        System.out.println("Sau khi thay doi thong tin");
        sinhVien.hienThiTatCaThongTin();
    }
}
