package com.example.employeemanagementwebapp.dto;

public class DanhSachDaXem {
    private String MaCoPhieu;
    private int DinhGia;

    public DanhSachDaXem(String maCoPhieu, int dinhGia) {
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

    public int getDinhGia() {
        return DinhGia;
    }

    public void setDinhGia(int dinhGia) {
        DinhGia = dinhGia;
    }
}
