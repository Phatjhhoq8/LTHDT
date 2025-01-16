package Lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai8 {
	public static int nhapsonguyen(Scanner sc) {
		int a;
		while(true) {
			try {
				System.out.println("Vui long nhap so nguyen: ");
				a=sc.nextInt();
				break;
			}catch(InputMismatchException e) {
				System.out.println("Nhap khong hop le!");
				sc.nextLine();
			}
		}
		return a;			
	}
	public static int pivot(int a[],int l,int r) {
		int key=a[l],k=l+1;
		while(k<=r&&(a[k]==key))k++;
		if(k>r) return -1;
		return (key>a[k])?l:k;
	}
	public static int partition(int a[],int l,int r,int pivot) {
		int i=l,j=r;
		while(i<=j) {
			while(i<=r&&a[i]<pivot)i++;
			while(j>=l&&a[j]>=pivot)j--;
			if(i<j) {
				a[i]^=a[j];
				a[j]^=a[i];
				a[i]^=a[j];
			}
		}
		return i;
	}
	public static void quickSort(int a[],int l,int r) {
		int idx=pivot(a,l,r);
		if(idx!=-1) {
			int k=partition(a,l,r,a[idx]);
			quickSort(a, l, k-1);
			quickSort(a, k, r);
		}
	}
	public static void main(String agrs[]) {
		Scanner sc=new Scanner(System.in);
		int n=nhapsonguyen(sc);
		System.out.println("Vui long nhap so luong phan tu cua mang: ");
		int a[] = new int[n];
		System.out.println("Vui long nhap gia tri cua mang: ");
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		System.out.println("Vui long nhap gia tri can dem: ");
		int x=sc.nextInt();
		int cnt=0;
		for(int i=0;i<n;i++) if(a[i]==x) cnt++;
		quickSort(a,0,n-1);
		System.out.println(x+" co so lan xuat hien la: "+cnt);
		System.out.println("Mang sau khi sap xep la: ");
		for(int i=0;i<n;i++) System.out.print(a[i]+" ");
		sc.close();
	}
}
