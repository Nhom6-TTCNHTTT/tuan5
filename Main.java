package tuan5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Demo {
	
	public static void fakedata (List<HocVien> list) {
		//ArrayList<HocVien> dsHocVien = new ArrayList<>();
		HocVienDH  dh1 = new HocVienDH(20, 100000, "Viet","HN", 1 ,"DH" );
		HocVienDH  dh2 = new HocVienDH(30, 200000, "Viet1","HN", 2 ,"LT" );
		HocVienDH  dh3 = new HocVienDH(40, 150000, "Viet2","HN", 1 ,"DH" );
		list.add(dh1);
		list.add(dh2);
		list.add(dh3);
		/*list.add( new HocVienDH(20, 100000, "Viet","HN", 1 ,"DH" ));
		list.add( new HocVienDH(20, 100000, "Viet1","HN", 1 ,"DH" ));
		list.add( new HocVienDH(20, 100000, "Viet2","HN", 1 ,"DH" ));*/
		for(HocVien hv:list) {		
			hv.inThongTin();			
		}
		//return dsHocVien;
	}
		
	public static void xuatTieuDe() {
		System.out.printf("%15s %15s %15s %15s %15s %15s %15s\n", "Ten", "Dia Chi", "Loai UT", "Loai CT","So Buoi", "Don Gia","HocPhi" );
	}
	public static void nhap(List<HocVien> dsHocVien){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số luongj hoc vien");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Nhập thông tin hoc vien thứ " + (i+1) + ":");
            HocVienDH gv =new HocVienDH();
            gv.nhap();
            dsHocVien.add(gv);
        }
    }
	public static void sapxep(List<HocVien> dsHocVien) {
		Comparator<HocVien> c = new Comparator<HocVien>() {
			@Override
            public int compare(HocVien o1,HocVien o2) {
                return o1.getHoTen().compareToIgnoreCase(o2.getHoTen());
			}
		};
		Collections.sort(dsHocVien, c);
		System.out.println("\n Danh sách sắp xếp: ");
		xuatTieuDe();
		for(HocVien hv:dsHocVien) {
			if(hv instanceof HocVienDH) {
				hv.inThongTin();
			}
			
		}
	}
	public static void Max(List<HocVien> dsHocVien) {
		HocVien max = Collections.max(dsHocVien, new Comparator<HocVien>(){
			@Override
			public int compare(HocVien o1, HocVien o2) {
				return Double.compare(o1.hocPhi(), o2.hocPhi() );
			}
		});
		System.out.println("Max");
		max.inThongTin();
	}
	
	
	
	public static void main(String[] args) {
		//ArrayList<HocVien> dsHocVien = fakedata();
		List<HocVien> dsHocVien = new ArrayList<HocVien>();
		fakedata(dsHocVien);
		nhap(dsHocVien);
		xuatTieuDe();
		for(HocVien hv:dsHocVien) {	
			hv.inThongTin();				
		}
		/*System.out.println("Danh Sach 3 hoc vien");
		xuatTieuDe();
		for(HocVien hv:dsHocVien) {
			if(hv instanceof HocVienDH) {
				hv.inThongTin();
			}
			
		}
		nhap(dsHocVien);
		xuatTieuDe();
		for(HocVien hv:dsHocVien) {
			if(hv instanceof HocVienDH) {
				hv.inThongTin();
			}
			
		}*/
		sapxep(dsHocVien);
		Max(dsHocVien);
		/*HocVienDH  dh = new HocVienDH();
		int n ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong ");
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			dh.nhap();
			dsHocVien.add(dh);
		}
		xuatTieuDe();
		for(HocVien hv:dsHocVien) {
			if(hv instanceof HocVienDH) {
				hv.inThongTin();
			}
			
		}*/
	}

}
