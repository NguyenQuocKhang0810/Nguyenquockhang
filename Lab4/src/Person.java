
public class Person {
	private String email;
	private String hoTen;
	private int namSinh;
	private String gioiTinh;
	private String soDienThoai;
	private String diaChi;

	public Person(String email, String hoTen, int namSinh, String gioiTinh, String soDienThoai, String diaChi) {
		this.email = email;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
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

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void hienThiThongTin() {
		System.out.println("Email: " + this.email);
		System.out.println("Ho va ten: " + this.hoTen);
		System.out.println("Nam sinh: " + this.namSinh);
		System.out.println("Gioi tinh: " + this.gioiTinh);
		System.out.println("So dien thoai: " + this.soDienThoai);
		System.out.println("Dia chi: " + this.diaChi);
	}

	public void thayDoiSoDienThoai(String soDienThoaiMoi) {
		this.soDienThoai = soDienThoaiMoi;
	}
	
	public void thayDoiDiaChi(String diaChiMoi) {
        this.diaChi = diaChiMoi;
    }

}
