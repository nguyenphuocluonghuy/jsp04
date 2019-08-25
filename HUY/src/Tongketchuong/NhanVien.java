package Tongketchuong;

import java.util.ArrayList;
import java.util.Scanner;

public class NhanVien extends CanBo {
	public String job;

	public NhanVien(String name, int year, String sex, String address, String job) {
		super(name, year, sex, address);
		this.job = job;
		// TODO Auto-generated constructor stub
	}

	private String thongTin, ketQua;
	ArrayList<String> arrNhanVien = new ArrayList<>(1);
	Scanner scanner = new Scanner(System.in);

	public void nhapThongTinNhanVien() {
		for (int i = 0; i < 1; i++) {
			System.out.println("Nhập tên nhân viên: ");
			String tenNhanVien = scanner.nextLine();
			System.out.println("Nhập số điện thoại: ");
			String soDienThoai = scanner.nextLine();
			thongTin = tenNhanVien + "\t" + soDienThoai;
			arrNhanVien.add(thongTin);//add thông tin nhân viên vào thongtin
		}
	}

	public String timNhanVienTheoTen(String tenNV) {
		String[] thongTinNV = thongTin.split("\t");//tách chuỗi dựa trên khoảng trắng
		if (thongTinNV[0].equals(tenNV)) {//so sánh 2 chuỗi 
			ketQua = "Có nhân viên tên " + tenNV;
		} else {
			ketQua = "Không có nhân viên tên " + tenNV;
		}
		return ketQua;
	}

}
