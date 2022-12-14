package com.example.employeemanagementwebapp.model;

import javax.persistence.*;

@Entity

@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    @Column(name = "MaCoPhieu" )

    private String MaCoPhieu;
    @Column(name = "DTQ1")
    private Float DTQ1;

    @Column(name = "DTQ2")
    private Float DTQ2;

    @Column(name = "DTQ3")
    private Float DTQ3;

    @Column(name = "DTQ4")
    private Float DTQ4;

    @Column(name = "DTKehoach")
    private Float DTKehoach;


    @Column(name = "LNQ1")
    private Float LNQ1;

    @Column(name = "LNQ2")
    private Float LNQ2;

    @Column(name = "LNQ3")
    private Float LNQ3;

    @Column(name = "LNQ4")
    private Float LNQ4;

    @Column(name = "LNKehoach")
    private Float LNKehoach;

    @Column(name = "EPS")
    private Float EPS;
    @Column(name = "PE")
    private Float PE;
    @Column(name = "ROE")
    private Float ROE;
    @Column(name = "VCSH")
    private Float VCSH;
    @Column(name = "SLCP")
    private Float SLCP;
    @Column(name = "Bookvalue")
    private Float Bookvalue;
    @Column(name = "PB")
    private Float PB;
    @Column(name = "ROA")
    private Float ROA;
    @Column(name = "BienLoiNhuan")
    private Float BienLoiNhuan;
    @Column(name = "CoTuc")
    private Float CoTuc;
    @Column(name = "TienMat")
    private Float TienMat;
    @Column(name = "CoPhieu")
    private Float CoPhieu;
    @Column(name = "DinhGia")
    private Float DinhGia;

    public Employee(String maCoPhieu, Float DTQ1, Float DTQ2, Float DTQ3, Float DTQ4, Float DTKehoach, Float LNQ1, Float LNQ2, Float LNQ3, Float LNQ4, Float LNKehoach, Float EPS, Float PE, Float ROE, Float VCSH, Float SLCP, Float bookvalue, Float PB, Float ROA, Float bienLoiNhuan, Float coTuc, Float tienMat, Float coPhieu, Float dinhGia) {
        MaCoPhieu = maCoPhieu;
        this.DTQ1 = DTQ1;
        this.DTQ2 = DTQ2;
        this.DTQ3 = DTQ3;
        this.DTQ4 = DTQ4;
        this.DTKehoach = DTKehoach;
        this.LNQ1 = LNQ1;
        this.LNQ2 = LNQ2;
        this.LNQ3 = LNQ3;
        this.LNQ4 = LNQ4;
        this.LNKehoach = LNKehoach;
        this.EPS = EPS;
        this.PE = PE;
        this.ROE = ROE;
        this.VCSH = VCSH;
        this.SLCP = SLCP;
        Bookvalue = bookvalue;
        this.PB = PB;
        this.ROA = ROA;
        BienLoiNhuan = bienLoiNhuan;
        CoTuc = coTuc;
        TienMat = tienMat;
        CoPhieu = coPhieu;
        DinhGia = dinhGia;
    }

    public Employee() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaCoPhieu() {
        return MaCoPhieu;
    }

    public void setMaCoPhieu(String maCoPhieu) {
        MaCoPhieu = maCoPhieu;
    }

    public Float getDTQ1() {
        return DTQ1;
    }

    public void setDTQ1(Float DTQ1) {
        this.DTQ1 = DTQ1;
    }

    public Float getDTQ2() {
        return DTQ2;
    }

    public void setDTQ2(Float DTQ2) {
        this.DTQ2 = DTQ2;
    }

    public Float getDTQ3() {
        return DTQ3;
    }

    public void setDTQ3(Float DTQ3) {
        this.DTQ3 = DTQ3;
    }

    public Float getDTQ4() {
        return DTQ4;
    }

    public void setDTQ4(Float DTQ4) {
        this.DTQ4 = DTQ4;
    }

    public Float getDTKehoach() {
        return DTKehoach;
    }

    public void setDTKehoach(Float DTKehoach) {
        this.DTKehoach = DTKehoach;
    }

    public Float getLNQ1() {
        return LNQ1;
    }

    public void setLNQ1(Float LNQ1) {
        this.LNQ1 = LNQ1;
    }

    public Float getLNQ2() {
        return LNQ2;
    }

    public void setLNQ2(Float LNQ2) {
        this.LNQ2 = LNQ2;
    }

    public Float getLNQ3() {
        return LNQ3;
    }

    public void setLNQ3(Float LNQ3) {
        this.LNQ3 = LNQ3;
    }

    public Float getLNQ4() {
        return LNQ4;
    }

    public void setLNQ4(Float LNQ4) {
        this.LNQ4 = LNQ4;
    }

    public Float getLNKehoach() {
        return LNKehoach;
    }

    public void setLNKehoach(Float LNKehoach) {
        this.LNKehoach = LNKehoach;
    }

    public Float getEPS() {
        return EPS;
    }

    public void setEPS(Float EPS) {
        this.EPS = EPS;
    }

    public Float getPE() {
        return PE;
    }

    public void setPE(Float PE) {
        this.PE = PE;
    }

    public Float getROE() {
        return ROE;
    }

    public void setROE(Float ROE) {
        this.ROE = ROE;
    }

    public Float getVCSH() {
        return VCSH;
    }

    public void setVCSH(Float VCSH) {
        this.VCSH = VCSH;
    }

    public Float getSLCP() {
        return SLCP;
    }

    public void setSLCP(Float SLCP) {
        this.SLCP = SLCP;
    }

    public Float getBookvalue() {
        return Bookvalue;
    }

    public void setBookvalue(Float bookvalue) {
        Bookvalue = bookvalue;
    }

    public Float getPB() {
        return PB;
    }

    public void setPB(Float PB) {
        this.PB = PB;
    }

    public Float getROA() {
        return ROA;
    }

    public void setROA(Float ROA) {
        this.ROA = ROA;
    }

    public Float getBienLoiNhuan() {
        return BienLoiNhuan;
    }

    public void setBienLoiNhuan(Float bienLoiNhuan) {
        BienLoiNhuan = bienLoiNhuan;
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

    public Float getDinhGia() {
        return DinhGia;
    }

    public void setDinhGia(Float dinhGia) {
        DinhGia = dinhGia;
    }
}
