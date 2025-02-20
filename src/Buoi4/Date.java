package Buoi4;

import java.util.Scanner;

public class Date {
	private int day,month,year;
	public Date(){
		day=1;
		month=1;
		year=2025;
	}
	public Date(int d,int m,int y) {
		day=d;
		month=m;
		year=y;
	}
	public void hienThi() {
		System.out.println(day+"/"+month+"/"+year);
	}
	public boolean hopLe() {
		int []dayOfMonth= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0&&year%100!=0)||(year%400==0)) dayOfMonth[2]=29;
		if(month<1||month>12||day<1||day>dayOfMonth[month]) return false;
		return true;
	}
	public void copy(Date c) {
		day=c.day;
		month=c.month;
		year=c.year;
	}
	public void nhapNgay() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Vui long nhap ngay: ");
			day=sc.nextInt();
			System.out.println("Vui long nhap thang: ");
			month=sc.nextInt();
			System.out.println("Vui long nhap nam: ");
			year=sc.nextInt();
		}while(!hopLe());
//		sc.close();
	}
	public Date ngayHomSau() {
		Date temp = new Date(day,month,year);
		temp.day++;
		if(temp.hopLe()) return temp;
		temp.day=1;
		temp.month++;
		if(temp.hopLe()) return temp;
		temp.month=1;
		temp.year++;
		return temp;
	}
	public Date congNgay(int n) {
		Date temp = new Date(day,month,year);
		for(int i=1;i<=n;i++) temp=temp.ngayHomSau();
		return temp;
	}
	@Override
	public String toString() {
		return day+"/"+month+"/"+year;
	}
	
}
