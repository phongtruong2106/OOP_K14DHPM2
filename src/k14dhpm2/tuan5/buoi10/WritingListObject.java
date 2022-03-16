/*
*  created date: Mar 16, 2022
*  author: cgm
*/
package k14dhpm2.tuan5.buoi10;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import k14dhpm2.tuan4.buoi8.HangThucPham;

public class WritingListObject {

    public static void main(String[] args) throws IOException {

        HangThucPham hangThucPham = new HangThucPham("tp 01", "Mi Hao Hao", 3_500, new Date(), new Date());
        HangThucPham hangThucPham2 = new HangThucPham("tp 012", "Mi Gau Do", 4_500, new Date(), new Date());

        List<HangThucPham> list = new ArrayList<>();
        list.add(hangThucPham);
        list.add(hangThucPham2);
//HangThucPham hangThucPham2 = new HangThucPham(maHang, tenHang, donGia, ngaySX, ngayHetHan)
//ghi vào 1 file cụ thể
        FileOutputStream outFile = new FileOutputStream("htp.dat");
//chuyển đối tượng sang dạng trung gian
        ObjectOutputStream objOut = new ObjectOutputStream(outFile);
//tiến hành ghi
        objOut.writeObject(list);
        objOut.close();
        
    }
    
}
