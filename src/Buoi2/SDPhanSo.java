package Buoi2;

import java.util.Scanner;

public class SDPhanSo {
	public static void main(String[] args) {
		PhanSo a = new PhanSo(3,7);
		Scanner sc = new Scanner(System.in);
		System.out.print("Gia tri cua phan so a la: ");
		a.hienThi();
		PhanSo b = new PhanSo(4,9);
		System.out.print("Gia tri cua phan so b la: ");
		b.hienThi();
		System.out.println("Vui long nhap phan so x: ");
		PhanSo x = new PhanSo();
		x.nhapPhanSo();
		System.out.println("Vui long nhap phan so y: ");
		PhanSo y = new PhanSo();
		y.nhapPhanSo();
		System.out.printf("Gia tri nghich dao cua phan so %d/%d la: ",x.getTu(),x.getMau());
		x.giaTriNghichDao().hienThi();
		System.out.printf("Gia tri %d/%d + %d/%d la: ",x.getTu(),x.getMau(),y.getTu(),y.getMau());
		x.cong(y).hienThi();
		System.out.println("Vui long nhap so luong phan tu trong mang! ");
		int n=sc.nextInt();
		PhanSo []ps=new PhanSo[n];
		for(int i=0;i<n;i++) ps[i]=new PhanSo();
		for(int i=0;i<n;i++) ps[i].nhapPhanSo();
		PhanSo sum = new PhanSo();
		for(int i=0;i<n;i++) {
			sum=sum.cong(ps[i]);
		}
		System.out.print("Tong cua mang phan so la: ");
		sum.format();
		sum.hienThi();
		PhanSo maximum = new PhanSo(-99999,1);
		for(int i=0;i<n;i++) if(ps[i].lonHon(maximum)) {
			maximum.setTu(ps[i].getTu());
			maximum.setMau(ps[i].getMau());
		}
		System.out.print("Gia tri lon nhat cua mang la: ");
		maximum.hienThi();
		for(int i=0;i<n-1;i++) for(int j=n-1;j>i;j--) {
			if(ps[j-1].lonHon(ps[j])) ps[j-1].doiCho(ps[j]);
		}
		System.out.println("Mang da sap xep la: ");
		for(PhanSo s: ps) {
			System.out.printf("%d/%d ",s.getTu(),s.getMau());
		}
		sc.close();
	}
}
