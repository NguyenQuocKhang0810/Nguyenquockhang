import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> themMonHoc = new ArrayList<String>();
		themMonHoc.add("Toan");
		themMonHoc.add("Ly");
		themMonHoc.add("Sinh");

		GiangVien gVien = new GiangVien("tranquocdung@gmail.com", "Tran Quoc Dung", 1995, "Nam", "014581825",
				"Quy Nhon", themMonHoc);
		gVien.hienThiThongTin();
		gVien.hienThiMonHocSeDay();

		System.out.println("----------------");

		ArrayList<String> monHocCN = new ArrayList<String>();
		monHocCN.add("PRO");
		monHocCN.add("MAD");
		monHocCN.add("SSG");
		monHocCN.add("NWC");

		SinhVien sVien = new SinhVien("quockhang972@gmail.com", "Nguyen Quoc Khang", 2004, "Nam", "0336642035",
				"Nga ba Dong Da", monHocCN);
		sVien.hienThiThongTin();
		sVien.hienThiMonHocChuyenNganh();
		
	}
}
