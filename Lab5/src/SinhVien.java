import java.util.ArrayList;
import java.util.List;

public class SinhVien extends Person {
	private List<String> danhSachChuyenNganh = new ArrayList<String>();

	public SinhVien(String email, String hoTen, int namSinh, String gioiTinh, String soDienThoai, String diaChi,
			List<String> danhSachChuyenNganh) {
		super(email, hoTen, namSinh, gioiTinh, soDienThoai, diaChi);
		this.danhSachChuyenNganh = danhSachChuyenNganh;
	}

	public List<String> getDanhSachChuyenNganh() {
		return danhSachChuyenNganh;
	}

	public void setDanhSachChuyenNganh(List<String> danhSachChuyenNganh) {
		this.danhSachChuyenNganh = danhSachChuyenNganh;
	}

	public void cacMonHocChuyenNganh(String monHocCN) {
		danhSachChuyenNganh.add(monHocCN);
	}

	public void hienThiMonHocChuyenNganh() {
		System.out.println("Cac mon hoc chuyen nganh: ");
		for (String monHocCN : danhSachChuyenNganh) {
			System.out.println(monHocCN);
		}
	}

	@Override
	public void hienThiThongTin() {
		System.out.println("Email: " + this.email);
		System.out.println("Ho va ten: " + this.hoTen);
		System.out.println("Nam sinh: " + this.namSinh);
		System.out.println("Gioi tinh: " + this.gioiTinh);
		System.out.println("So dien thoai: " + this.soDienThoai);
		System.out.println("Dia chi: " + this.diaChi);
		hienThiMonHocChuyenNganh();
	}

}
