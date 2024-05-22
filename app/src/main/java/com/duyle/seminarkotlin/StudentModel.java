package com.duyle.seminarkotlin;

public class StudentModel {

    private String mssv;
    private String hoten;
    private float diemTB;
    private boolean daRaTruong;

    public StudentModel() {

    }

    public PhieuDiemModel getPhieuDiem () {
        PhieuDiemModel phieuDiemModel = new PhieuDiemModel(mssv, 8.5f, "22/5/2024"); // goi ma kotlin tu java
        return phieuDiemModel;
    }

    public StudentModel(String mssv, String hoten, float diemTB, boolean daRaTruong) {
        this.mssv = mssv;
        this.hoten = hoten;
        this.diemTB = diemTB;
        this.daRaTruong = daRaTruong;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public boolean isDaRaTruong() {
        return daRaTruong;
    }

    public void setDaRaTruong(boolean daRaTruong) {
        this.daRaTruong = daRaTruong;
    }
}
