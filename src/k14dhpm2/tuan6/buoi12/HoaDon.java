/*
*  created date: Mar 23, 2022
*  author: cgm
*/
package k14dhpm2.tuan6.buoi12;

import java.util.Date;

public abstract class HoaDon {
    private String maHD;
    private Date ngayHD;
    private String tenKH;
    private String maPhong;
    private double donGia;
    private static int soLuongHD;

    /**
     * @return the soLuongHD
     */
    public static int getSoLuongHD() {
        return soLuongHD;
    }
    /**
     * @param maHD
     * @param ngayHD
     * @param tenKH
     * @param maPhong
     * @param donGia
     */
    public HoaDon(String maHD, Date ngayHD, String tenKH, String maPhong, double donGia) {
        this.maHD = maHD;
        this.ngayHD = ngayHD;
        this.tenKH = tenKH;
        this.maPhong = maPhong;
        this.donGia = donGia;
        this.tangSLHD();;
    }

    private void tangSLHD(){
        soLuongHD++;
    }



    /**
     * @return the maHD
     */
    public String getMaHD() {
        return maHD;
    }


    public HoaDon(){
        this.tangSLHD();;
    }

    public abstract double tinhTien();


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "HoaDon [donGia=" + donGia + ", maHD=" + maHD + ", maPhong=" + maPhong + ", ngayHD=" + ngayHD
                + ", tenKH=" + tenKH + "]";
    }

    //setter
    //getter
    /**
     * @return the donGia
     */
    public double getDonGia() {
        return donGia;
    }

    /**
     * @return the ngayHD
     */
    public Date getNgayHD() {
        return ngayHD;
    }

    /**
     * @param donGia the donGia to set
     */
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    /**
     * @param tenKH the tenKH to set
     */
    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }



    

    

    
}
