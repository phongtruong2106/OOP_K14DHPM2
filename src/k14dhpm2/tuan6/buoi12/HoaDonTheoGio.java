/*
*  created date: Mar 23, 2022
*  author: cgm
*/
package k14dhpm2.tuan6.buoi12;

import java.util.Date;

public class HoaDonTheoGio extends HoaDon {
    private float soGioThue;


    //setter
    //getter

    @Override
    public double tinhTien() {
        double tien = 0;
        if(this.soGioThue <= 24){
            tien = this.getDonGia() * this.soGioThue;
        }else if(this.soGioThue > 24 && this.soGioThue < 30){

            tien = this.getDonGia() * 24;
        }else{
            System.out.println("HD se duoc tinh theo ngay!!!");
        }
        return tien;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    /**
     * @param maHD
     * @param ngayHD
     * @param tenKH
     * @param maPhong
     * @param donGia
     * @param soGioThue
     */
    public HoaDonTheoGio(String maHD, Date ngayHD, String tenKH, String maPhong, double donGia, float soGioThue) {
        super(maHD, ngayHD, tenKH, maPhong, donGia);
        this.soGioThue = soGioThue;
    }


    @Override
    public String toString() {
        return "HoaDonTheoGio [soGioThue=" + soGioThue + "]" + super.toString();
    }
    
}
