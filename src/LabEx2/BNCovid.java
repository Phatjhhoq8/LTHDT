package LabEx2;

import java.util.Scanner;

public class BNCovid extends BNhan {
	private String ngay,odich,noi;
	private char loai;
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap ngay cach ly (ngay-thang-nam): ");
		ngay=sc.nextLine();
		System.out.println("Nhap loai nguoi nhiem: ");
		loai=sc.nextLine().charAt(0);
		System.out.println("Nhap o dich: ");
		odich=sc.nextLine();
		System.out.println("Nhap noi: ");
		noi=sc.nextLine();
	}
	public void in() {
		super.in();
		System.out.println("Ngay cach ly (ngay-thang-nam): "+ngay);
		System.out.println("Loai nguoi nhiem: "+loai);
		System.out.println("O dich: "+odich);
		System.out.println("Noi: "+noi);
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Nhap so luong benh nhan:" );
		int n=sc.nextInt();
		BNhan ds[] = new BNhan[n];
		for(int i=0;i<n;i++) {
			System.out.println("Nhap 1 de chon benh nhan 0 de nhap benh nhan covid-19: ");
			int state=sc.nextInt();
			if(state==0) {
				System.out.println("NMhap thong tin cua benh nhan: ");
				ds[i]=new BNCovid();
				ds[i].nhap();
			}else if(state==1) {
				System.out.println("NMhap thong tin cua benh nhan covid-19: ");
				ds[i]=new BNhan();
				ds[i].nhap();
			}else {
				System.out.println("Nhap khong hop le! Vui long nhap lai!");
				i--;
			}
		}
		for(int i=0;i<n;i++) {
			if(ds[i] instanceof BNCovid) {
				BNCovid bnc = (BNCovid) ds[i];
				if(bnc.loai=='1'&&bnc.odich.toLowerCase().equals("Cong ty Hosiden".toLowerCase())) {
					System.out.println("Thong tin cua benh nhan covid-19 f1 o o dich cong ty hosiden: ");
					bnc.in();
				}
			}
		}
		for(int i=0;i<n;i++) {
			if(ds[i] instanceof BNCovid) {
				BNCovid bnc = (BNCovid) ds[i];
				int day=Integer.parseInt(bnc.ngay.substring(0,2)),mon=Integer.parseInt(bnc.ngay.substring(3,5)),year=Integer.parseInt(bnc.ngay.substring(6));
				if(year>2021||year==2021&&mon>5||year==2021&&mon==5&&day>4) continue;
				System.out.println("Thong tin cua benh nhan covid-19 da het thoi gian cach ly: ");
				bnc.in();
			}
		}
	}
}
