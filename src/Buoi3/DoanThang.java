package Buoi3;

public class DoanThang {
	private Diem d1,d2;
	public DoanThang() {
		d1=new Diem();
		d2=new Diem();
	}
	public DoanThang(Diem a,Diem b) {
		d1=new Diem(a);
		d2=new Diem(b);
	}
	public DoanThang(int ax,int ay,int bx,int by) {
		d1=new Diem(ax,ay);
		d2=new Diem(bx,by);
	}
	public void nhap() {
		Diem t1=new Diem();
		t1.nhapDiem();
		Diem t2=new Diem();
		t2.nhapDiem();
		d1.thayGiaTriX(t1.giaTriX());
		d1.thayGiaTriY(t1.giaTriY());
		d2.thayGiaTriX(t2.giaTriX());
		d2.thayGiaTriY(t2.giaTriY());
	}
	public void hienThi() {
		System.out.printf("Dinh dau: (%d,%d)\nDinh cuoi: (%d,%d)\n",d1.giaTriX(),d1.giaTriY(),d2.giaTriX(),d2.giaTriY());
	}
	public void doiDiem(int x,int y) {
		d1.thayGiaTriX(d1.giaTriX()+x);
		d1.thayGiaTriY(d1.giaTriY()+y);
		d2.thayGiaTriX(d2.giaTriX()+x);
		d2.thayGiaTriY(d2.giaTriY()+y);
	}
	public float doDaiDoanThang() {
		return (float)Math.sqrt((d2.giaTriX()-d1.giaTriX())*(d2.giaTriX()-d1.giaTriX())+(d2.giaTriY()-d1.giaTriY())*(d2.giaTriY()-d1.giaTriY()));
	}
}
