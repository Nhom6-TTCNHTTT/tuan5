/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PhucDinh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Name
 */
public class GV{

    public static ArrayList<GiangVien> Fakedata(){
        ArrayList<GiangVien> dsGiangVien=new ArrayList();
         GVCoHuu GV1 = new GVCoHuu("E", "Hà nam", "Giảng viên cơ hữu", 10000000, 3, 2);
         GVCoHuu GV2 = new GVCoHuu("B", "i", "Giảng viên cơ hữu", 15000000, 6, 1);
          GVCoHuu GV3 = new GVCoHuu("A", "f", "Giảng viên cơ hữu", 12000000, 8, 3);
          dsGiangVien.add(GV3);
          dsGiangVien.add(GV2);
          dsGiangVien.add(GV1);
          return dsGiangVien;
    }
    public static void nhap(ArrayList<GiangVien> dsGiangVien){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số luongj giảng viên");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Nhập thông tin giảng viên thứ " + (i+1) + ":");
            GVCoHuu gv=new GVCoHuu();
            gv.nhap();
            dsGiangVien.add(gv);
        }
    }
    public static void xuat(ArrayList<GiangVien> dsGiangVien){
        System.out.println("Danh sách giảng viên cơ hữu là: ");
        System.out.printf("%20s %20s %20s %20s %20s %20s %20s %20s","Họ tên","Địa chỉ","Loại giảng viên","Lương cơ bản","hệ số lương","thâm niên","phụ cấp","Lương tháng");
        for(GiangVien gv:dsGiangVien){
            System.out.println("\n");
            gv.xuat();
        }
    }
    public static void sapxep(ArrayList<GiangVien> dsGiangVien){
        Comparator<GiangVien> c=new Comparator<GiangVien>() {
            @Override
            public int compare(GiangVien o1,GiangVien o2) {
                return o1.getHoTen().compareToIgnoreCase(o2.getHoTen());
        }
        };
        Collections.sort(dsGiangVien, c);
        System.out.println("\nDanh sách giảng viên sau sắp xếp là: ");
        System.out.printf("%20s %20s %20s %20s %20s %20s %20s %20s","Họ tên","Địa chỉ","Loại giảng viên","Lương cơ bản","hệ số lương","thâm niên","phụ cấp","Lương tháng");
        for(GiangVien gv:dsGiangVien){
            System.out.println("\n");
            gv.xuat();
        }
    }
    public static void sapxepLuong(ArrayList<GiangVien> dsGiangVien){
        Comparator<GiangVien> c=new Comparator<GiangVien>() {
            @Override
            public int compare(GiangVien o1,GiangVien o2) {
                return Double.compare(o1.tinhLuong(), o2.tinhLuong());
        }
        };
        //GiangVien[] gv1= dsGiangVien.toArray(new GiangVien[dsGiangVien.size()]);
        Collections.sort(dsGiangVien, c);
        //Arrays.sort(gv1, c);
        System.out.println("\nDanh sách giảng viên sau sắp xếp là: ");
        System.out.printf("%20s %20s %20s %20s %20s %20s %20s %20s","Họ tên","Địa chỉ","Loại giảng viên","Lương cơ bản","hệ số lương","thâm niên","phụ cấp","Lương tháng");
        for(GiangVien gv:dsGiangVien){
            System.out.println("\n");
            gv.xuat();
        }
    }
    public static void Max(ArrayList<GiangVien> dsGiangVien){
        GiangVien max= Collections.max(dsGiangVien, new Comparator<GiangVien>(){
             @Override
            public int compare(GiangVien o1,GiangVien o2) {
                return Double.compare(o1.tinhLuong(), o2.tinhLuong());
        }
        });
        System.out.println("\n Giảng viên có lương cao nhất là: "+max.getHoTen());
        max.xuat();
    }
    public static void xoa(ArrayList<GiangVien> dsGiangVien){
    
    for(int i=0;i<dsGiangVien.size();i++){
        if(dsGiangVien.get(i).getDiaChi().equalsIgnoreCase("Hà Nam")){
            dsGiangVien.remove(i);
            System.out.println("Xóa giảng viên " + dsGiangVien.get(i).getHoTen() + " thành công");
        }
    }
    System.out.println("\nDanh sách sau khi xóa: ");
    System.out.printf("%20s %20s %20s %20s %20s %20s %20s %20s","Họ tên","Địa chỉ","Loại giảng viên","Lương cơ bản","hệ số lương","thâm niên","phụ cấp","Lương tháng");
    for(GiangVien sv:dsGiangVien){
        System.out.println("\n");
        sv.xuat();
    }
}


    public static void main(String[] args) {
       ArrayList<GiangVien> dsGiangVien= Fakedata();
       nhap(dsGiangVien);
       xuat(dsGiangVien);
       sapxep(dsGiangVien);
       sapxepLuong(dsGiangVien);
       Max(dsGiangVien);
       xoa(dsGiangVien);
    }
    
}
