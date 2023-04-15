/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhucDinh;

import java.util.Scanner;

/**
 *
 * @author Name
 */
public class GVCoHuu extends GiangVien{
    private double luongCB;
    private int heSoLuong;
    private float thamNien;
    

    public GVCoHuu() {
        super();
    }

    public GVCoHuu(double luongCB, int heSoLuong, float thamNien) {
        this.luongCB = luongCB;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
    }

    public GVCoHuu( String hoTen, String diaChi, String loaiGV,double luongCB, float thamNien, int heSoLuong) {
        super(hoTen, diaChi, loaiGV);
        this.luongCB = luongCB;
        this.thamNien = thamNien;
        this.heSoLuong = heSoLuong;
    }
    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập lương cơ bản: ");
        luongCB=sc.nextFloat();
        System.out.println("Nhập lương hệ số lương: ");
        heSoLuong=sc.nextInt();
        System.out.print("Nhap tham nien cong tac (nam): ");
        thamNien = sc.nextFloat();
    }
    public double phuCap(){
        double phuCap;
        if(thamNien<5){
            return 0;
        }else if(thamNien==5){
            return 0.05*luongCB;
        }else{
            return 0.05*luongCB+(thamNien-5)*0.01*luongCB;
        }
    }
    @Override
    public double tinhLuong() {
        
        return luongCB*heSoLuong+phuCap();
    }

   public void xuat(){
       super.xuat();
       System.out.printf("%20s %20s %20s %20s %20s", luongCB,heSoLuong,thamNien,phuCap(),tinhLuong());
   }
    
}
