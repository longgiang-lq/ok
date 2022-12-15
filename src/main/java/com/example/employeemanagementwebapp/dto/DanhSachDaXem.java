package com.example.employeemanagementwebapp.dto;

public class DanhSachDaXem {
    private String MaCoPhieu;
    private Float DinhGia;

    public DanhSachDaXem(String maCoPhieu, Float dinhGia) {
        MaCoPhieu = maCoPhieu;
        DinhGia = dinhGia;
    }

    public DanhSachDaXem() {

    }

    public String getMaCoPhieu() {
        return MaCoPhieu;
    }

    public void setMaCoPhieu(String maCoPhieu) {
        MaCoPhieu = maCoPhieu;
    }

    public Float getDinhGia() {
        return DinhGia;
    }

    public void setDinhGia(Float dinhGia) {
        DinhGia = dinhGia;
    }
}
