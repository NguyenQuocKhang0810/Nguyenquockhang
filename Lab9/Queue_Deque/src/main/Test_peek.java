package main;

import java.util.LinkedList;
import java.util.Queue;

public class Test_peek {
	public static void main(String[] args) {
		Queue<String> danhSachSV = new LinkedList<String>();

		danhSachSV.offer("QK 1");
		danhSachSV.offer("TITV 1");
		danhSachSV.offer("QK 2");
		danhSachSV.offer("TITV 2");

		while (true) {
			String ten = danhSachSV.peek(); 
			if (ten == null) {
				break;
			}
			// peek => lấy ra nhưng không xóa
			System.out.println(ten);
			danhSachSV.poll(); 
		}
	}
}
