
public class SinhVien {
	private String email;
	private String hoTen;
	private String chuyenNganh;

	public SinhVien(String email, String hoTen, String chuyenNganh) {
		this.email = email;
		this.hoTen = hoTen;
		this.chuyenNganh = chuyenNganh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	@Override
	public String toString() {
		return "SinhVien [email=" + email + ", hoTen=" + hoTen + ", chuyenNganh=" + chuyenNganh + "]";
	}

	
}
