package Buoi4;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVienCNTT extends SinhVien {
	private String taikhoan,matkhau,email;
	public SinhVienCNTT() {
		super();
		taikhoan="";
		matkhau="";
		email="";
	}
	public SinhVienCNTT(String mssv, String hoten, Date ngaysinh) {
		super(mssv,hoten,ngaysinh);
		taikhoan="";
		matkhau="";
		email="";
	}
	public SinhVienCNTT(String mssv, String hoten, Date ngaysinh,String taikhoan,String matkhau,String email) {
		super(mssv,hoten,ngaysinh);
		this.taikhoan=taikhoan;
		this.matkhau=matkhau;
		this.email=email;
	}
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		super.nhapThongTin();
		System.out.println("Nhap tai khoan cua hoc sinh: ");
		taikhoan=sc.nextLine();
		System.out.println("Nhap mat khau cua hoc sinh: ");
		matkhau=sc.nextLine();
		System.out.println("Nhap email cua hoc sinh: ");
		email=sc.nextLine();
	}
	public void doiMatKhau(String newpass) {
		this.matkhau=newpass;
	}
	public String getEmail() {
		return this.email;
	}
	@Override
	public String toString() {
		return super.toString()+"-tai khoan: "+taikhoan+"-mat khau: "+matkhau+"-email: "+email;
	}
	
}
