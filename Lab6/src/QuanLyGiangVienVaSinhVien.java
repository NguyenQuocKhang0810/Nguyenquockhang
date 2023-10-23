import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyGiangVienVaSinhVien {
	private ArrayList<GiangVien> danhSachGiangVien = new ArrayList<>();
	private ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();

	public static void main(String[] args) {
		QuanLyGiangVienVaSinhVien quanLy = new QuanLyGiangVienVaSinhVien();
		quanLy.menu();
	}

	private void menu() {
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("Quản lý giảng viên và sinh viên");
			System.out.println("1. Thêm giảng viên");
			System.out.println("2. Thêm sinh viên");
			System.out.println("3. Tìm kiếm giảng viên theo email hoặc môn học");
			System.out.println("4. Tìm kiếm sinh viên theo email hoặc chuyên ngành");
			System.out.println("5. Xóa giảng viên theo email");
			System.out.println("6. Xóa sinh viên theo email");
			System.out.println("7. Sửa thông tin giảng viên");
			System.out.println("8. Sửa thông tin sinh viên");
			System.out.println("9. In thông tin giảng viên");
			System.out.println("10. In thông tin sinh viên");
			System.out.println("0. Thoát");
			System.out.print("Chọn một chức năng: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Nhập email giảng viên: ");
				String gvEmail = scanner.nextLine();
				System.out.print("Nhập tên giảng viên: ");
				String gvTen = scanner.nextLine();
				System.out.print("Nhập môn học của giảng viên: ");
				String gvMonHoc = scanner.nextLine();
				themGiangVien(gvEmail, gvTen, gvMonHoc);
				break;
			case 2:
				System.out.print("Nhập email sinh viên: ");
				String svEmail = scanner.nextLine();
				System.out.print("Nhập tên sinh viên: ");
				String svTen = scanner.nextLine();
				System.out.print("Nhập chuyên ngành của sinh viên: ");
				String svChuyenNganh = scanner.nextLine();
				themSinhVien(svEmail, svTen, svChuyenNganh);
				break;
			case 3:
				System.out.print("Nhập email giảng viên hoặc môn học cần tìm: ");
				String searchGvEmailOrMonHoc = scanner.nextLine();
				timKiemGiangVien(searchGvEmailOrMonHoc);
				break;

			case 4:
				System.out.print("Nhập email sinh viên hoặc chuyên ngành cần tìm: ");
				String searchSvEmailOrChuyenNganh = scanner.nextLine();
				timKiemSinhVien(searchSvEmailOrChuyenNganh);
				break;

			case 5:
				System.out.print("Nhập email giảng viên cần xóa: ");
				String deleteGvEmail = scanner.nextLine();
				xoaGiangVienTheoEmail(deleteGvEmail);
				break;
			case 6:
				System.out.print("Nhập email sinh viên cần xóa: ");
				String deleteSvEmail = scanner.nextLine();
				xoaSinhVienTheoEmail(deleteSvEmail);
				break;
			case 7:
				System.out.print("Nhập email giảng viên cần sửa: ");
				String editGvEmail = scanner.nextLine();
				System.out.print("Nhập email mới: ");
				String editGvNewEmail = scanner.nextLine();
				System.out.print("Nhập tên giảng viên mới: ");
				String editGvTen = scanner.nextLine();
				System.out.print("Nhập môn học mới: ");
				String editGvMonHoc = scanner.nextLine();
				suaThongTinGiangVien(editGvEmail, editGvNewEmail, editGvTen, editGvMonHoc);
				break;
			case 8:
				System.out.print("Nhập email sinh viên cần sửa: ");
				String editSvEmail = scanner.nextLine();
				System.out.print("Nhập email mới: ");
				String editSvNewEmail = scanner.nextLine();
				System.out.print("Nhập tên sinh viên mới: ");
				String editSvTen = scanner.nextLine();
				System.out.print("Nhập chuyên ngành mới: ");
				String editSvChuyenNganh = scanner.nextLine();
				suaThongTinSinhVien(editSvEmail, editSvNewEmail, editSvTen, editSvChuyenNganh);
				break;
			case 9:
				inThongTinGiangVien();
				break;
			case 10:
				inThongTinSinhVien();
				break;
			case 0:
				System.out.println("Chương trình kết thúc.");
				break;
			default:
				System.out.println("Chức năng không hợp lệ.");
			}
		} while (choice != 0);
	}

	private void themGiangVien(String email, String ten, String monHoc) {
		GiangVien giangVienMoi = new GiangVien(email, ten, monHoc);
		danhSachGiangVien.add(giangVienMoi);
		System.out.println("Giảng viên đã được thêm.");
	}

	private void themSinhVien(String email, String ten, String chuyenNganh) {
		SinhVien sinhVienMoi = new SinhVien(email, ten, chuyenNganh);
		danhSachSinhVien.add(sinhVienMoi);
		System.out.println("Sinh viên đã được thêm.");
	}

	public void timKiemGiangVien(String emailOrMonHoc) {
		boolean found = false;
		for (GiangVien giangVien : danhSachGiangVien) {
			if (giangVien.getEmail().equals(emailOrMonHoc) || giangVien.getMonHoc().equals(emailOrMonHoc)) {
				System.out.println("Thông tin giảng viên:");
				System.out.println("Email: " + giangVien.getEmail());
				System.out.println("Tên: " + giangVien.getTen());
				System.out.println("Môn học: " + giangVien.getMonHoc());
				found = true;
			}
		}

		if (!found) {
			System.out.println("Không tìm thấy giảng viên với email hoặc môn học " + emailOrMonHoc);
		}
	}

	public void timKiemSinhVien(String emailOrChuyenNganh) {
		boolean found = false;
		for (SinhVien sinhVien : danhSachSinhVien) {
			if (sinhVien.getEmail().equals(emailOrChuyenNganh)
					|| sinhVien.getChuyenNganh().equals(emailOrChuyenNganh)) {
				System.out.println("Thông tin sinh viên:");
				System.out.println("Email: " + sinhVien.getEmail());
				System.out.println("Tên: " + sinhVien.getHoTen());
				System.out.println("Chuyên ngành: " + sinhVien.getChuyenNganh());
				found = true;
			}
		}

		if (!found) {
			System.out.println("Không tìm thấy sinh viên với email hoặc chuyên ngành " + emailOrChuyenNganh);
		}
	}

	private void xoaGiangVienTheoEmail(String email) {
		for (GiangVien giangVien : danhSachGiangVien) {
			if (giangVien.getEmail().equals(email)) {
				danhSachGiangVien.remove(giangVien);
				System.out.println("Giảng viên đã bị xóa.");
				return;
			}
		}
		System.out.println("Không tìm thấy giảng viên với email " + email);
	}

	private void xoaSinhVienTheoEmail(String email) {
		for (SinhVien sinhVien : danhSachSinhVien) {
			if (sinhVien.getEmail().equals(email)) {
				danhSachSinhVien.remove(sinhVien);
				System.out.println("Sinh viên đã bị xóa.");
				return;
			}
		}
		System.out.println("Không tìm thấy sinh viên với email " + email);
	}

	private void suaThongTinGiangVien(String email, String emailMoi, String tenMoi, String monHocMoi) {
		for (GiangVien giangVien : danhSachGiangVien) {
			if (giangVien.getEmail().equals(email)) {
				giangVien.setEmail(emailMoi);
				giangVien.setTen(tenMoi);
				giangVien.setMonHoc(monHocMoi);
				System.out.println("Thông tin giảng viên đã được cập nhật.");
				return;
			}
		}
		System.out.println("Không tìm thấy giảng viên với email " + email);
	}

	private void suaThongTinSinhVien(String email, String emailMoi, String tenMoi, String chuyenNganhMoi) {
		for (SinhVien sinhVien : danhSachSinhVien) {
			if (sinhVien.getEmail().equals(email)) {
				sinhVien.setEmail(emailMoi);
				sinhVien.setHoTen(tenMoi);
				sinhVien.setChuyenNganh(chuyenNganhMoi);
				System.out.println("Thông tin sinh viên đã được cập nhật.");
				return;
			}
		}
		System.out.println("Không tìm thấy sinh viên với email " + email);
	}

	private void inThongTinGiangVien() {
		for (GiangVien giangVien : danhSachGiangVien) {
			System.out.println(giangVien);
		}
	}

	private void inThongTinSinhVien() {
		for (SinhVien sinhVien : danhSachSinhVien) {
			System.out.println(sinhVien);
		}
	}

}