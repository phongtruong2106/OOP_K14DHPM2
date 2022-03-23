/*
*  created date: Mar 23, 2022
*  author: cgm
*/
package k14dhpm2.tuan6.buoi12;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DanhSachHoaDon {

    private List<HoaDon> danhSach = new ArrayList<>();
    // trang thai
    private int soLuongHDTheoGio;
    private int soLUongHDTheoNgay;

    /**
     * @return the soLUongHDTheoNgay
     */
    public int getSoLUongHDTheoNgay() {
        return soLUongHDTheoNgay;
    }

    /**
     * @return the soLuongHDTheoGio
     */
    public int getSoLuongHDTheoGio() {
        return soLuongHDTheoGio;
    }

    public void them(HoaDon hoaDon) {
        this.danhSach.add(hoaDon);
    }

    public void inDanhSach() {
        for (HoaDon hoaDon : danhSach) {
            System.out.println(hoaDon);
        }
    }

    public void tinhTongSLTungLoai() {

        for (HoaDon hoaDon : danhSach) {
            if (hoaDon instanceof HoaDonTheoGio) {
                this.soLuongHDTheoGio++;
            } else {
                this.soLUongHDTheoNgay++;
            }

        }

    }

    public double tinhTienHDT9_2013() {
        double tien = 0;
        int dem = 0;

        Calendar calendar = Calendar.getInstance();
        // Date date = calendar.getTime();

        for (HoaDon hoaDon : danhSach) {
            Date ngayHoaDon = hoaDon.getNgayHD();

            // 2022/3/23: Ngay
            calendar.setTime(ngayHoaDon);
            int month = calendar.get(Calendar.MONTH);
            int year = calendar.get(Calendar.YEAR);
            if (month == 2 && year == 2022) {
                tien += hoaDon.tinhTien();
                dem++;
            }
        }
        return (double) tien / dem;
    }

    // xoa
    public void xoaHoaDon(HoaDon hoaDon) {
        this.danhSach.remove(hoaDon);
    }

    public int timViTriHoaDon(HoaDon hoaDon){
        int viTri = -1;
        
       viTri =  this.danhSach.indexOf(hoaDon);

        return viTri;
    }

    // sua
    public void suaHoaDon(int viTri, HoaDon hoaDon) {
        this.danhSach.set(viTri, hoaDon);
    }

    // timkiem
    public HoaDon timHoaDonTheoMa(String maHD) {
        HoaDon hoaDon = null;
        for (HoaDon hd : danhSach) {
            if (hd.getNgayHD().toString().equalsIgnoreCase(maHD)) {
                hoaDon = hd;
            }
        }
        return hoaDon;
    }

    // sap xep
    // timkiem
    public HoaDonTheoNgay timHoaDonNgayTheoMa(String maHD) {
        HoaDonTheoNgay hoaDonTheoNgay = null;
        for (HoaDon hd : danhSach) {
            if (hd.getNgayHD().toString().equalsIgnoreCase(maHD) && hd instanceof HoaDonTheoNgay) {
                hoaDonTheoNgay = (HoaDonTheoNgay) hd;//ep kieu
            }
        }
        return hoaDonTheoNgay;
    }
    // sap xep

}
