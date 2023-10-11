import java.util.ArrayList;
import java.util.List;

public class duLieuPerson {

    private int soLuongNguoi;
    private Person[] Nguoi;

    public duLieuPerson() {
        soLuongNguoi = 7;
        Nguoi = new Person[soLuongNguoi];
        List<String> danhSach1 = new ArrayList<>();
        danhSach1.add("Math");
        danhSach1.add("Physics");
        List<String> danhSach2 = new ArrayList<>();
        danhSach2.add("SSG");
        danhSach2.add("PRO");
        List<String> danhSach3 = new ArrayList<>();
        danhSach3.add("NWC");
        danhSach3.add("OSG");
        List<String> danhSach4 = new ArrayList<>();
        danhSach4.add("Python");
        danhSach4.add("Lap trinh C");
        List<String> danhSach5 = new ArrayList<>();
        danhSach5.add("C++");
        danhSach5.add("Java");
        List<String> danhSach6 = new ArrayList<>();
        danhSach6.add("JavaScript");
        danhSach6.add("Kotlin");
        
        
        Nguoi[0] = new GiangVien("nguyenkhang@fpt.edu.vn", "Nguyen Khang", 2004, "Male", "1234", "binh dinh", danhSach1);
        Nguoi[1] = new GiangVien("nguyentien@fpt.edu.vn", "Nguyen Tien", 2003, "Male", "6245", "Quy nhon", danhSach2);
        Nguoi[2] = new GiangVien("nguyenbach@fpt.edu.vn", "Nguyen Bach", 2002, "Female", "123453", "Quang Ngai", danhSach3);
        Nguoi[3] = new GiangVien("nguyentoan@fpt.edu.vn", "Nguyen Toan", 1990, "Female", "64561", "Quang Binh", danhSach3);
        Nguoi[4] = new SinhVien("nguyenhuy@fpt.edu.vn", "Nguyen Huy", 1998, "Female", "1451", "Quang Tri", danhSach4);
        Nguoi[5] = new SinhVien("nguyenkhai@fpt.edu.vn", "Nguyen Khai", 1975, "Male", "565473", "Sai Gon", danhSach5);
        Nguoi[6] = new SinhVien("nguyenchau@fpt.edu.vn", "Nguyen Chau", 2010, "Male", "132513", "Gia Lai", danhSach6);
    }

    public Person timGiangVienTheoEmail(String email) {
        for (int i = 0; i < soLuongNguoi; i++) {
            if (Nguoi[i] instanceof GiangVien && Nguoi[i].getEmail().equals(email)) {
                return Nguoi[i];
            }
        }
        return null;
    }
    public GiangVien timGiangVienTheoMonHoc(String monHoc) {
        for (int i = 0; i < soLuongNguoi; i++) {
            if (Nguoi[i] instanceof GiangVien) {
                GiangVien giangVien = (GiangVien) Nguoi[i];
                if (giangVien.getDanhSach().contains(monHoc)) {
                    return giangVien;
                }
            }
        }
        return null;
    }
    public Person timSinhVienTheoEmail(String email) {
        for (int i = 0; i < soLuongNguoi; i++) {
            if (Nguoi[i] instanceof SinhVien && Nguoi[i].getEmail().equals(email)) {
                return Nguoi[i];
            }
        }
        return null;
    }
    public SinhVien timSinhVienTheoChuyenNganh(String chuyenNganh) {
        for (int i = 0; i < soLuongNguoi; i++) {
            if (Nguoi[i] instanceof SinhVien) {
                SinhVien sinhVien = (SinhVien) Nguoi[i];
                if (sinhVien.getDanhSachChuyenNganh().contains(chuyenNganh)) {
                    return sinhVien;
                }
            }
        }
        return null;
    }



}
