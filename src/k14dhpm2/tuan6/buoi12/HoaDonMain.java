/*
*  created date: Mar 23, 2022
*  author: cgm
*/
package k14dhpm2.tuan6.buoi12;

public class HoaDonMain {
    public static void main(String[] args) {
        DanhSachHoaDon danhSachHoaDon = new DanhSachHoaDon();
        String nhapTiep = null;

        // Nhap
        ConsoleInput consoleInput = new ConsoleInput();

        do {
            HoaDon hoaDon = consoleInput.inputHoaDon();
            danhSachHoaDon.them(hoaDon);
            System.out.print("May co muon nhap tiep hay khong Y/N");
            nhapTiep = consoleInput.input.nextLine();

        } while (nhapTiep.equalsIgnoreCase("Y"));

        danhSachHoaDon.inDanhSach();

        double tienT3_2022 = danhSachHoaDon.tinhTienHDT9_2013();
        System.out.println("tien T 3 2022: " + tienT3_2022);

        // xoa HD
        // NHap Ma
        String maHD = "HD001";
        HoaDon hoaDon =  danhSachHoaDon.timHoaDonTheoMa(maHD);

       // HoaDonTheoNgay hoaDonTheoNgay = danhSachHoaDon.timHoaDonNgayTheoMa(maHD);

        //danhSachHoaDon.xoaHoaDon(hoaDonTheoNgay);

        //danhSachHoaDon.xoaHoaDon(hoaDon);

        int viTri = danhSachHoaDon.timViTriHoaDon(hoaDon);

        //Nhap tu ban phim
        hoaDon.setDonGia(2_000_000);
        hoaDon.setTenKH("AAAAA");
        
        danhSachHoaDon.suaHoaDon(viTri, hoaDon);

    }

}
