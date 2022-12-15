package com.example.employeemanagementwebapp.dto;

public class TongHop {
    private Float CoTuc;
    private Float TienMat;
    private Float CoPhieu;

    public TongHop(Float coTuc, Float tienMat, Float coPhieu) {
        CoTuc = coTuc;
        TienMat = tienMat;
        CoPhieu = coPhieu;
    }

    public Float getCoTuc() {
        return CoTuc;
    }

    public void setCoTuc(Float coTuc) {
        CoTuc = coTuc;
    }

    public Float getTienMat() {
        return TienMat;
    }

    public void setTienMat(Float tienMat) {
        TienMat = tienMat;
    }

    public Float getCoPhieu() {
        return CoPhieu;
    }

    public void setCoPhieu(Float coPhieu) {
        CoPhieu = coPhieu;
    }
}
