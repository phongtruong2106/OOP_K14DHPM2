/*
*  created date: Mar 09, 2022
*  author: cgm
*/
package k14dhpm2.tuan4.buoi8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPhamTestDrive {

    public static void main(String[] args) throws ParseException {
        HangThucPham htp = new HangThucPham("TP01");
        //htp.setMaHang(1);
        // System.out.println(htp);
        Date ngayHienTai = new 
        Date();
        System.out.println(ngayHienTai);

        String ngaySX = "01/03/2022";
        String ngayHetHan = "08/03/2022";

        SimpleDateFormat ngayVietNam = new
        SimpleDateFormat("dd/MM/yyyy");
        HangThucPham htp2 = new HangThucPham("TP02", "Mi Hao Hao Chua Cay", 3_500, ngayVietNam.parse(ngaySX), ngayVietNam.parse(ngayHetHan));

        System.out.println(htp2);

        if(htp2.kiemTraHSD()){
            System.out.println("Het hang roi ! dung co an no!!!");
        }else{
            System.out.println("Con han nen an di !!!!");
        }

    }
    
}
