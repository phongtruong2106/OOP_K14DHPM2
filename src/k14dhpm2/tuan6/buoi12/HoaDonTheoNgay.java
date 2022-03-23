/*
*  created date: Mar 23, 2022
*  author: cgm
*/
package k14dhpm2.tuan6.buoi12;

import java.util.Date;

public class HoaDonTheoNgay extends HoaDon{
    private float soNgayThue;

    

    /**
     * @param maHD
     * @param ngayHD
     * @param tenKH
     * @param maPhong
     * @param donGia
     * @param soNgayThue
     */
    public HoaDonTheoNgay(String maHD, Date ngayHD, String tenKH, String maPhong, double donGia, float soNgayThue) {
        super(maHD, ngayHD, tenKH, maPhong, donGia);
        this.soNgayThue = soNgayThue;
    }



    @Override
    public double tinhTien() {
        double tien = 0;
        if(this.soNgayThue > 7){
            tien = 7 * this.getDonGia() + (this.soNgayThue - 7) * this.getDonGia() * 0.8;
        }else{
            tien = this.soNgayThue * this.getDonGia();
        }
        return tien;
    }



    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "HoaDonTheoNgay [soNgayThue=" + soNgayThue + "]" + super.toString();
    }

    
    
}
