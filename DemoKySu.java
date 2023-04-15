/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX1_Test1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author Dell Pc
 */
public class DemoKySu {
    public static ArrayList<NguoiLaoDong> fakeKySu() {
        ArrayList<NguoiLaoDong> dsNguoiLD = new ArrayList();
        KySu ks1 = new KySu("Dang Quoc Viet", "Ha Noi", "Ki su", 15, 15, 15 );
        KySu ks2 = new KySu("Vuong Tuan Chinh", "Ha Noi", "lao dong pho thong", 9, 9, 9 );
        KySu ks3 = new KySu("Uong Van Nhat", "Ha Noi", "Ki su", 26, 26, 26 );
        dsNguoiLD.add(ks1);
        dsNguoiLD.add(ks2);
        dsNguoiLD.add(ks3);
        return dsNguoiLD;
    }
    
    public static void Nhap(ArrayList<NguoiLaoDong> dsNguoiLD) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nh?p s? lý?ng ngý?i lao ð?ng: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++) {
            System.out.println("Nh?p thông tin c?a ngý?i lao ð?ng th? " + (i+1) + ": ");
            KySu ks = new KySu();
            ks.Nhap();
            dsNguoiLD.add(ks);
        }
      
    }
    
    public static void Xuat(ArrayList<NguoiLaoDong> dsNguoiLD) {
        
        System.out.println("Danh sách các k? sý là: ");
        System.out.printf("%20s %20s %20s %20s %20s %20s %20s", "H? tên", "Ð?a ch?", "Lo?i lao ð?ng", "S? ngày công", "Lýõng cõ b?n", "H? s? lýõng", "Lýõng tháng" );
        for(NguoiLaoDong ks:dsNguoiLD) {
            System.out.println("\n");
            ks.Xuat();
        }
    }
    
    
    public static void sapXep(ArrayList<NguoiLaoDong> dsNguoiLD) {
        Comparator<NguoiLaoDong> c = new Comparator<NguoiLaoDong>(){
            @Override
            public int compare(NguoiLaoDong o1, NguoiLaoDong o2) {
                return o1.getHoTen().compareToIgnoreCase(o2.getHoTen());
            }
        };
        Collections.sort(dsNguoiLD, c);
        System.out.println("Danh sach sau khi sap xep: ");
        System.out.printf("%20s %20s %20s %20s %20s %20s %20s", "H? tên", "Ð?a ch?", "Lo?i lao ð?ng", "S? ngày công", "Lýõng cõ b?n", "H? s? lýõng", "Lýõng tháng" );
        for(NguoiLaoDong ks:dsNguoiLD) {
            System.out.println("\n");
            ks.Xuat();
        }
    }
    
    public static void Min(ArrayList<NguoiLaoDong> dsNguoiLD) {
        NguoiLaoDong min = Collections.min(dsNguoiLD, new Comparator<NguoiLaoDong>() {
            @Override
            public int compare(NguoiLaoDong o1, NguoiLaoDong o2) {
                return Double.compare(o1.tinhLuong(), o2.tinhLuong());
            }
        });
        System.out.println("\nNguoi lao dong co luong thang nho nhat la: " + min.getHoTen());
        System.out.printf("%20s %20s %20s %20s %20s %20s %20s", "H? tên", "Ð?a ch?", "Lo?i lao ð?ng", "S? ngày công", "Lýõng cõ b?n", "H? s? lýõng", "Lýõng tháng" );
        min.Xuat();
    }
    
    public static void main(String[] args) {
        ArrayList<NguoiLaoDong> dsNguoiLD = fakeKySu();
        Nhap(dsNguoiLD);
        Xuat(dsNguoiLD);
        sapXep(dsNguoiLD);
        Min(dsNguoiLD);
    }
}
