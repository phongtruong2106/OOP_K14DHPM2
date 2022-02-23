/*
*  created date: Feb 23, 2022
*  author: cgm
*/
package k14dhpm2.tuan3.buoi6;

public class HinhChuaNhat {

    //implementation
    private float chieuDai;
    private float chieuRong;

    //interface

    /**
     * @param chieuDai the chieuDai to set
     */
    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    /**
     * @param chieuRong the chieuRong to set
     */
    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }

    public float tinhDienTich(){
        return this.chieuDai * this.chieuRong;
    }


    public float tinhChuVi(){
        return (this.chieuDai + this.chieuRong) * 2;
    }

    public String toString(){
        String str = "Chieu dai : " + this.chieuDai + " chieu rong: " + this.chieuRong;
        str += " dien tich: " + this.tinhDienTich() + ", chu vi " + this.tinhChuVi();
        
        return str;
    }




    
}
