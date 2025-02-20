package Buoi3;

import java.util.Arrays;
import java.util.Scanner;

public class SDSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien A = new SinhVien();
        A.nhapThongTin();
        System.out.println("Thong tin sinh vien: " + A.toString());

        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        SinhVien[] ds = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new SinhVien();
            ds[i].nhapThongTin();
        }
        for (SinhVien sv : ds) {
            if ((sv.diemTrungBinh() < 2.0)||(sv.pen())) {
                System.out.println("Sinh vien bi canh cao hoc vu: " + sv.toString());
            }
        }

        SinhVien temp = ds[0];
        for (SinhVien sv : ds) {
            if (temp.diemTrungBinh() < sv.diemTrungBinh()) {
                temp = sv;
            }
        }
        System.out.println("Sinh vien co diem cao nhat: " + temp.toString() + " voi diem: " + temp.diemTrungBinh());
        System.out.println("Danh sach sinh vien theo thu tu ABC:");
        Arrays.sort(ds);
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " " + ds[i].toString());
        }

        sc.close();
    }
}
