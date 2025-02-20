package Buoi4;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien implements Comparable<SinhVien> {
    private String mssv, hoten, ten;
    private Date ngaysinh;
    private int slHocPhan;
    private ArrayList<String> nameHp;
    private ArrayList<String> diemHp;

    public SinhVien() {
        this.mssv = "";
        this.hoten = "";
        this.ten = "";
        this.ngaysinh = new Date();
        this.slHocPhan = 0;
        this.nameHp = new ArrayList<>();
        this.diemHp = new ArrayList<>();
    }

    public SinhVien(String mssv, String hoten, Date ngaysinh) {
        this.mssv = mssv;
        this.hoten = hoten;
        this.ngaysinh.copy(ngaysinh);
        int idx = this.hoten.lastIndexOf(" ");
        this.slHocPhan=0;
        this.nameHp = new ArrayList<>();
        this.diemHp = new ArrayList<>();
        this.ten = (idx == -1) ? this.hoten : this.hoten.substring(idx + 1);
    }

    public SinhVien(String mssv, String hoten, Date ngaysinh, int slHocPhan, ArrayList<String> nameHp, ArrayList<String> diemHp) {
        this.mssv = mssv;
        this.hoten = hoten;
        this.ngaysinh.copy(ngaysinh);
        this.slHocPhan = slHocPhan;
        int idx = hoten.lastIndexOf(" ");
        this.ten = (idx == -1) ? hoten : hoten.substring(idx + 1);
        this.nameHp = new ArrayList<>(nameHp);
        this.diemHp = new ArrayList<>(diemHp);
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so sinh vien: ");
        this.mssv = sc.nextLine();
        System.out.print("Nhap ho ten sinh vien: ");
        this.hoten = sc.nextLine();
        int idx = this.hoten.lastIndexOf(" ");
        this.ten = (idx == -1) ? this.hoten : this.hoten.substring(idx + 1);
        this.ngaysinh.nhapNgay();;
        System.out.print("Nhap so luong hoc phan can hoc: ");
        this.slHocPhan = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < this.slHocPhan; i++) {
            System.out.print("Nhap hoc phan hoc: ");
            String temp = sc.nextLine();
            this.nameHp.add(temp);
            System.out.println("Nhap diem: ");
            String point = sc.nextLine();
            this.diemHp.add(point.toUpperCase());
            nhapDiem(temp,point);
        }
    }

    public void nhapDiem(String mon, String diem) {
        int idx = nameHp.indexOf(mon);
        if (idx == -1) {
        	nameHp.add(mon);
        	diemHp.add(diem.toUpperCase());
        }
        else diemHp.set(idx, diem);
    }

    public float diemTrungBinh() {
        float sum = 0;
        int cnt = 0;
        for (int i = 0; i < slHocPhan; i++) {
            switch (diemHp.get(i).toUpperCase()) {
                case "A": sum += 4; break;
                case "B+": sum += 3.5f; break;
                case "B": sum += 3.0f; break;
                case "C+": sum += 2.5f; break;
                case "C": sum += 2.0f; break;
                case "D+": sum += 1.5f; break;
                case "D": sum += 1.0f; break;
                case "E": sum += 0.5f; break;
                case "F": sum+=0.f;break;
                case "@": cnt++; break;
            }
        }
        return (slHocPhan == cnt) ? 0 : sum / (slHocPhan - cnt);
    }

    public void themHocPhan(String s) {
        nameHp.add(s);
        diemHp.add("@");
    }

    public void xoaHocPhan(String s) {
        int idx = nameHp.indexOf(s);
        if (idx != -1) {
            nameHp.remove(idx);
            diemHp.remove(idx);
        }
    }
    public boolean pen() {
    	for(String s : diemHp) {
    		System.out.println(s);
    		if(s.toUpperCase().equals("F")) return true;
    	}
    	return false;
    }
    @Override
    public String toString() {
        return mssv + " - " + hoten + " - " + ngaysinh.toString();
    }

    @Override
    public int compareTo(SinhVien sv) {
        return this.ten.compareTo(sv.ten);
    }
}
