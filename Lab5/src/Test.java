import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		duLieuPerson dl = new duLieuPerson();
		System.out.println("Tim kiem giang vien theo email: ");
		dl.timGiangVienTheoEmail("nguyenkhang@fpt.edu.vn").hienThiThongTin();

		System.out.println("----------------");
		System.out.println("Tim kiem giang vien theo mon hoc: ");
		GiangVien giangVien = dl.timGiangVienTheoMonHoc("OSG");
		if (giangVien != null) {
			giangVien.hienThiThongTin();
		} else {
			System.out.println("Không tìm thấy giảng viên dạy môn học này. ");
		}

		System.out.println("----------------");
		System.out.println("Tim kiem sinh vien theo email: ");
		dl.timSinhVienTheoEmail("nguyenkhai@fpt.edu.vn").hienThiThongTin();

		System.out.println("----------------");
		System.out.println("Tim kiem sinh vien theo chuyen nganh: ");
		SinhVien sinhVien = dl.timSinhVienTheoChuyenNganh("Kotlin");
		if (sinhVien != null) {
			sinhVien.hienThiThongTin();
		} else {
			System.out.println("Không tìm thấy sinh viên theo chuyên ngành này. ");
		}

	}
}