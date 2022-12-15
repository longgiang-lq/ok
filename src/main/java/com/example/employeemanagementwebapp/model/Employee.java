package com.example.employeemanagementwebapp.model;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(EmployeeKey.class)
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "employees")
public class Employee implements Serializable {

    @Id
    @Column(name = "ma_co_phieu" )

    private String MaCoPhieu;
    @Column(name = "dtq1")
    private Float DTQ1;

    @Column(name = "dtq2")
    private Float DTQ2;

    @Column(name = "dtq3")
    private Float DTQ3;

    @Column(name = "dtq4")
    private Float DTQ4;

    @Column(name = "dtkehoach")
    private Float DTKehoach;


    @Column(name = "lnq1")
    private Float LNQ1;

    @Column(name = "lnq2")
    private Float LNQ2;

    @Column(name = "lnq3")
    private Float LNQ3;

    @Column(name = "lnq4")
    private Float LNQ4;

    @Column(name = "lnkehoach")
    private Float LNKehoach;

    @Column(name = "eps")
    private Float EPS;
    @Column(name = "pe")
    private Float PE;
    @Column(name = "roe")
    private Float ROE;
    @Column(name = "vcsh")
    private Float VCSH;
    @Column(name = "slcp")
    private Float SLCP;
    @Column(name = "bookvalue")
    private Float Bookvalue;
    @Column(name = "pb")
    private Float PB;
    @Column(name = "roa")
    private Float ROA;
    @Column(name = "bien_loi_nhuan")
    private Float BienLoiNhuan;
    @Column(name = "co_tuc")
    private Float CoTuc;
    @Column(name = "tien_mat")
    private Float TienMat;
    @Column(name = "co_phieu")
    private Float CoPhieu;
    @Column(name = "dinh_gia")
    private Float DinhGia;


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
