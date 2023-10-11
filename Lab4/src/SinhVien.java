
public class SinhVien extends Person{
	private String chuyenNganh;

	public SinhVien(String email, String hoTen, int namSinh, String gioiTinh, String soDienThoai, String diaChi,
			String chuyenNganh) {
		super(email, hoTen, namSinh, gioiTinh, soDienThoai, diaChi);
		this.chuyenNganh = chuyenNganh;
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	
	public void hienThiMonHocChuyenNganh() {
		System.out.println("Danh sach mon hoc theo chuyen nganh:" + this.chuyenNganh);
	}
}
