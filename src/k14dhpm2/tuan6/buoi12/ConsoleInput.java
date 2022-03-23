/*
*  created date: Mar 23, 2022
*  author: cgm
*/
package k14dhpm2.tuan6.buoi12;

import java.util.Date;
import java.util.Scanner;


public class ConsoleInput {

    public static Scanner input = new Scanner(System.in);

    public HoaDon inputHoaDon(){
        HoaDon hoaDon = null;

        System.out.print("Nhap Ma HD>>");
        String maHD = input.nextLine();
        //nhap nhuwng cai thay chua lam thi may dua lam nhen!!!!
        System.out.print("Nhap don gia>>");
        double donGia = input.nextDouble();

        //NHap cua con
        //2 loai TheoNgay-1; Theo Gio - 2
        System.out.print("Ban nhap loai nao? Ngay -1, Gio - 2>>");
        int loai = input.nextInt();
        input.nextLine();//dua nao hori cho nay tao dap chet
        if(loai == 1){
            System.out.print("So Ngay Theu>>");
            float soNgayThue = input.nextFloat();
            input.nextLine();

            hoaDon  = new HoaDonTheoNgay(maHD, new Date(), "tenKH", "P001", donGia, soNgayThue);
        }else{
            System.out.print("So Gio Thue>>");
            float soGioThue = input.nextFloat();
            input.nextLine();
            hoaDon = new HoaDonTheoGio(maHD, new Date(), "TEn KH", "maPhong", donGia, soGioThue);
        }


        return hoaDon;
    }
    
}
