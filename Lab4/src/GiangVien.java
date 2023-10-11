import java.util.ArrayList;
import java.util.List;


public class GiangVien extends Person {
	private List<String> danhSach = new ArrayList<String>();

	public GiangVien(String email, String hoTen, int namSinh, String gioiTinh, String soDienThoai, String diaChi,
			List<String> danhSach) {
		super(email, hoTen, namSinh, gioiTinh, soDienThoai, diaChi);
		this.danhSach = danhSach;
	}

	public List<String> getDanhSach() {
		return danhSach;
	}

	public void setDanhSach(List<String> danhSach) {
		this.danhSach = danhSach;
	}

	public void themMonHocSeDay(String themMonHoc) {
		danhSach.add(themMonHoc);
	}

	public void hienThiMonHocSeDay() {
		System.out.println("Cac mon hoc se day:");
		for (String themMonHoc : danhSach) {
			System.out.println(themMonHoc);
		}
	}
}
