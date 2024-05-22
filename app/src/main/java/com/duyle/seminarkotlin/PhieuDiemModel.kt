package com.duyle.seminarkotlin

class PhieuDiemModel (var mssv: String, var diem : Float, var ngaynhap : String) {

    fun getThongTinSV () : StudentModel {
        var sinhvien = StudentModel() // goi class java tu kotlin
        sinhvien.mssv = mssv
        // query database de lay thong tin sv
        return sinhvien
    }

}