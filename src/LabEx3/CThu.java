package LabEx3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CThu extends CNguoi {
	private int so;
	private String vtri,mua,clbo;
	private long bthang;
	public CThu() {
		so=-1;
		vtri=new String();
		mua=new String();
		clbo=new String();
		bthang=0;
	}
	public CThu(CThu a) {
		so=a.so;
		vtri=new String(a.vtri);
		mua=new String(a.mua);
		clbo=new String(a.clbo);
		bthang=a.bthang;
	}
	public long tinhLuong() {
		long temp=7000000;
		switch(vtri) {
		case "tm":
			temp+=3000000;
			break;
		case "hv":
			temp+=4000000;
			break;
		case "trv":
			temp+=4500000;
			break;
		case "tiv":
			temp+=5000000;
			break;
		case "td":
			temp+=7000000;
			break;
		default:
			break;
		}
		return (long)((temp+bthang*500000)*0.9);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Vui long nhap so ao dau: ");
		so=sc.nextInt();
		sc.nextLine();
		System.out.println("Vui long nhap vi tri:(tm-tu mon,hv-hau ve,trv-trung ve,tiv-tien ve,td-tien dao)");
		vtri=sc.nextLine();
		System.out.println("Vui long nhap so ban thang cua cau thu: ");
		bthang=sc.nextLong();
		sc.nextLine();
		System.out.println("Vui long nhap mua giai cau thu thi dau: ");
		mua=sc.nextLine();
		System.out.println("Vui long nhap cau lac bo cua cau thu: ");
		clbo=sc.nextLine();
	}
	public void in() {
		super.in();
		System.out.println("So ao dau: "+so);
		System.out.println("Vi tri: "+vtri);
		System.out.println("So ban thang cua cau thu: "+bthang);
		System.out.println("Mua giai cau thu thi dau: "+mua);
		System.out.println("Cau lac bo cua cau thu: "+clbo);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long nhap so luong cau thu: ");
		int n=sc.nextInt();
		CThu []ds = new CThu[n];
		HashMap<String, ArrayList<String>> mp = new HashMap<String,ArrayList<String>>();
		for(int i=0;i<n;i++) {
			System.out.println("Vui long nhap cau thu thu "+(i+1)+": ");
			ds[i] = new CThu();
			ds[i].nhap();
			if(mp.get(ds[i].mua)==null) mp.put(ds[i].mua,new ArrayList<String>());
			mp.get(ds[i].mua).add(ds[i].clbo);
		}
		System.out.println("------------------------------------------");
		for(int i=0;i<n;i++) {
			System.out.println("Thong tin cau thu thu "+(i+1)+": ");
			ds[i].in();
		}
		System.out.println("------------------------------------------");
		for(int i=0;i<n;i++) {
			System.out.println("Tien luong cua "+ds[i].getName()+" la: "+ds[i].tinhLuong());
		}
		System.out.println("------------------------------------------");
		for(String mua: mp.keySet()) {
			System.out.println("--------So ban thang trong mua giai "+ mua+"-----");
			for(String clbo:mp.get(mua)) {
				long a=0,b=0,c=0;
				for(int i=0;i<n;i++) if(ds[i].mua.equals(mua)&&ds[i].clbo.equals(clbo)) {
					if(ds[i].getAge()>=18 && ds[i].getAge()<=24) a+=ds[i].bthang;
					else if(ds[i].getAge()>=25&&ds[i].getAge()<=28)b+=ds[i].bthang;
					else if(ds[i].getAge()>28) c+=ds[i].bthang;
				}
				System.out.println("Cau lac bo: "+clbo);
				System.out.println("Do tuoi 18-24: "+a);
				System.out.println("Do tuoi 25-28: "+b);
				System.out.println("Do tuoi > 28: "+c);
			}
			
		}
	}
}
