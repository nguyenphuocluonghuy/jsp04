package Tongketchuong;

import java.util.Scanner;

public class QuanLyCanBo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CongNhan congnhan1= new CongNhan("Huy",22,"nam","Hue","4/7");
		congnhan1.nhapthongtinCongNhan();
		congnhan1.showInformation();
		Scanner input = new Scanner(System.in);
		NhanVien nhanVien1 = new NhanVien("Vi", 20, "Nu", "Hue", "CEO");
		nhanVien1.nhapThongTinNhanVien();

		System.out.println("Nhập tên nhân viên cần tìm: ");

		String tenNVCanTim = input.nextLine();
		String kQ = nhanVien1.timNhanVienTheoTen(tenNVCanTim);
		System.out.println(kQ);
	}

	}
