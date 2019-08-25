package Tongketchuong;

import java.util.Scanner;

public class CongNhan extends CanBo {
	public String wage;

	public CongNhan(String name, int year, String sex, String address, String wage) {
		super(name, year, sex, address);
		this.wage = wage;
		// TODO Auto-generated constructor stub

	}

	String ten, bacluong;

	public void nhapthongtinCongNhan() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên công nhân: ");
		ten = scanner.nextLine();
		System.out.println("Nhập bậc lương: ");
		bacluong = scanner.next();
	}

	public void showInformation() {
		System.out.println("Tên công nhân: " + ten + ", Bậc lương:  " + bacluong + ".");
	}
}
