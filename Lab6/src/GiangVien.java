
public class GiangVien {
	private String email;
	private String monHoc;
	private String ten;

	public GiangVien(String email, String monHoc, String ten) {
		this.email = email;
		this.monHoc = monHoc;
		this.ten = ten;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMonHoc() {
		return monHoc;
	}

	public void setMonHoc(String monHoc) {
		this.monHoc = monHoc;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Override
	public String toString() {
		return "GiangVien [email=" + email + ", monHoc=" + monHoc + ", ten=" + ten + "]";
	}
	
	

}
