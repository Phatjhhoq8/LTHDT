package Buoi4;

import java.util.Scanner;

public class SDConVat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Vui long nhap so luong con vat:");
		int n=sc.nextInt();
		ConVat ds[]=new ConVat[n];
		int choice;
		for(int i=0;i<n;i++) {
			System.out.println("Nhap 0 de nhap bo,1 de nhap heo,2 de nhap de");
			choice=sc.nextInt();
			if(choice==0) {
				ds[i]=new Bo();
				ds[i].nhap();
			}else if(choice==1) {
				ds[i]=new Heo();
				ds[i].nhap();
			}else if(choice==2) {
				ds[i]=new De();
				ds[i].nhap();
			}else {
				System.out.println("Sai cu phap!");
				i--;
			}
		}
		System.out.println("Cac con vat chuan bi keu");
		for(int i=0;i<n;i++) {
			ds[i].keu();
		}
	}
}
