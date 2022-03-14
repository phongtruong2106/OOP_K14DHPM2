/*
*  created date: Mar 09, 2022
*  author: cgm
*/
package k14dhpm2.tuan4.buoi8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham {

    private String maHang;
    private String tenHang;
    private double donGia;
    private  Date ngaySX;
    private Date ngayHetHan;

    public HangThucPham(String maHang){
        this.setMaHang(maHang);
    }

    /**
     * @param maHang the maHang to set
     */
    private void setMaHang(String maHang) {
        if(maHang != null){
            this.maHang = maHang;
        }else{
            System.out.println("Ma Hang khong duoc rong !!!!");
        }
    }

    /**
     * @param ngayHetHan the ngayHetHan to set
     */
    public void setNgayHetHan(Date ngayHetHan) {
        if(ngayHetHan.after(ngaySX)){
            this.ngayHetHan = ngayHetHan;
        }else{
            System.out.println("Ngay Het Han phai sau ngay Sx !!!");
        }
        
    }

    /**
     * @return the maHang
     */
    public String getMaHang() {
        return maHang;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {

        //09/03/2022 - dd/mm/yyyy
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");

        //kiem tra ngayHetHan ?null
        //ngaySX ???null

        return "HangThucPham [donGia=" + donGia + ", maHang=" + maHang + ", ngayHetHan=" + ngayVietNam.format(ngayHetHan) + ", ngaySX="
                + ngayVietNam.format(ngaySX) + ", tenHang=" + tenHang + "]";
    }

    /**
     * @param maHang
     * @param tenHang
     * @param donGia
     * @param ngaySX
     * @param ngayHetHan
     */
    public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySX, Date ngayHetHan) {

        this.setMaHang(maHang);
        this.tenHang = tenHang;//thieu rang buoc
        this.donGia = donGia;//thieu rang buoc
        this.ngaySX = ngaySX;//thieu rang buoc
        this.setNgayHetHan(ngayHetHan);
    }

    public boolean kiemTraHSD(){//boolean//interface
        return this.tinhHSD();
    }

    private boolean tinhHSD(){//implementation

        boolean isHetHan = false;//con han
        Date ngayHienTai = new Date();
        if(this.ngayHetHan.before(ngayHienTai)){
            isHetHan = true;
        }

        return isHetHan;

    }

   
   
   
   
   
   
   
   
   
   
    
    
    
    
    

    

    


    
}
