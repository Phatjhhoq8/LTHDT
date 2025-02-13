package Buoi2;

import java.util.Scanner;

public class PhanSo {
	private int tu;
	private int mau;
	public PhanSo() {
		tu=0;
		mau=1;
	}
	public PhanSo(int _tu,int _mau) {
		tu=_tu;
		mau=_mau;
		if(_mau==0) {
			System.out.println("Phan so khong hop le!Tu dong khoi tao ham mac dinh!");
			mau=1;
		}
	}
	public int getTu() {
		return tu;
	}
	public void setTu(int tu) {
		this.tu = tu;
	}
	public int getMau() {
		return mau;
	}
	public void setMau(int mau) {
		this.mau = mau;
	}
	public void nhapPhanSo() {
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Vui long nhap tu so: ");
			tu=sc.nextInt();
			System.out.println("Vui long nhap mau so: ");
			mau=sc.nextInt();
		}while(mau==0);
//		sc.close();
	}
	public void hienThi() {
		if(tu==0||mau==1) System.out.println(tu);
		else if(mau<0) System.out.println((-tu)+"/"+(-mau));
		else System.out.println(tu+"/"+mau);
	}
	public void nghichDao() {
		if(tu==0) return;
		else {
			tu^=mau;
			mau^=tu;
			tu^=mau;
		}
	}
	public PhanSo giaTriNghichDao() {
		if(tu==0) return new PhanSo(tu,mau);
		return new PhanSo(mau,tu);
	}
	public float giaTriThuc() {
		return (float)tu/mau;
	}
	public boolean lonHon(PhanSo a) {
		if(tu*a.mau>a.tu*mau) return true;
		return false;
	}
	public int gcd(int a,int b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}
	public void format() {
		int g=gcd(tu,mau);
		tu/=g;
		mau/=g;
	}
	public PhanSo cong(PhanSo a) {
		PhanSo temp = new PhanSo(tu*a.mau+a.tu*mau,mau*a.mau);
		temp.format();
		return temp;
	}
	public PhanSo tru(PhanSo a) {
		PhanSo temp = new PhanSo(tu*a.mau-a.tu*mau,mau*a.mau);
		temp.format();
		return temp;
	}
	public PhanSo nhan(PhanSo a) {
		PhanSo temp = new PhanSo(tu*a.tu,mau*a.mau);
		temp.format();
		return temp;
	}
	public PhanSo chia(PhanSo a) {
		PhanSo temp = new PhanSo(tu*a.mau,mau*a.tu);
		temp.format();
		return temp;
	}
	public PhanSo cong(int a) {
		PhanSo temp = new PhanSo(tu+a*mau,mau);
		temp.format();
		return temp;
	}
	public PhanSo tru(int a) {
		PhanSo temp = new PhanSo(tu-a*mau,mau);
		temp.format();
		return temp;
	}
	public PhanSo nhan(int a) {
		PhanSo temp = new PhanSo(tu*a,mau);
		temp.format();
		return temp;
	}
	public PhanSo chia(int a) {
		PhanSo temp = new PhanSo(tu,mau*a);
		temp.format();
		return temp;
	}
	public void doiCho(PhanSo a) {
		tu^=a.getTu();
		a.setTu(a.getTu()^tu);
		tu^=a.getTu();
		mau^=a.getMau();
		a.setMau(a.getMau()^mau);
		mau^=a.getMau();
	}
}
