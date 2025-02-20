package Buoi4;

import java.util.Scanner;

public class SDSVCNTT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vui long nhap so luong sinh vien: ");
		int n=sc.nextInt();
		sc.nextLine();
		SinhVienCNTT []ds = new SinhVienCNTT[n];
		for(int i=0;i<n;i++) {
			ds[i] = new SinhVienCNTT();
			ds[i].nhapThongTin();
		}
		System.out.print("Nhap email muon kiem tra: ");
		String email=sc.nextLine();
		for(SinhVienCNTT sv:ds) {
			if(sv.getEmail().equals(email)) {
				System.out.println("Ket qua hoc tap cua sinh vien "+sv.toString()+" la: "+sv.diemTrungBinh());
				break;
			}
		}
	}

}
