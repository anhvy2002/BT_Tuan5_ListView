package com.test.bt_tuan5_listview;

public class MonAn{
    private int hinh;
    private String ten;
    private String thongTin;
    private String gia;

    public MonAn(int hinh, String ten, String thongTin, String gia){
        this.hinh = hinh;
        this.ten = ten;
        this.thongTin = thongTin;
        this.gia = gia;
    }

    public int getHinh() { return hinh; }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getThongTin() {
        return thongTin;
    }

    public void setThongTin(String thongTin) {
        this.thongTin = thongTin;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
}
