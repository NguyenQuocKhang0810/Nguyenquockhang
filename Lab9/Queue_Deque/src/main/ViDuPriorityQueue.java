package main;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ViDuPriorityQueue {
	public static void main(String[] args) {
		Queue<String> danhSachSV = new PriorityQueue<String>();

		danhSachSV.offer("QK 1");
		danhSachSV.offer("TITV 1");
		danhSachSV.offer("TITV 2");
		danhSachSV.offer("QK 2");
		while (true) {
			String ten = danhSachSV.poll(); // lấy ra và xóa
			if (ten == null) {
				break;
			}
			// peek => lấy ra nhưng không xóa
			System.out.println(ten);
		}
	}
}
