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
    @Column(name = "id" )
    private long id;
    @Column(name = "ma_co_phieu" )

    private String MaCoPhieu;
    @Column(name = "dtq1")
    private Float DTQ1;

    @Column(name = "dtq12")
    private Float DTQ12;
    @Column(name = "dtq13")
    private Float DTQ13;
    @Column(name = "dtq14")
    private Float DTQ14;

    @Column(name = "dtq2")
    private Float DTQ2;
    @Column(name = "dtq22")
    private Float DTQ22;
    @Column(name = "dtq23")
    private Float DTQ23;
    @Column(name = "dtq24")
    private Float DTQ24;

    @Column(name = "dtq3")
    private Float DTQ3;
    @Column(name = "dtq32")
    private Float DTQ32;
    @Column(name = "dtq33")
    private Float DTQ33;
    @Column(name = "dtq34")
    private Float DTQ34;

    @Column(name = "dtq4")
    private Float DTQ4;
    @Column(name = "dtq42")
    private Float DTQ42;
    @Column(name = "dtq43")
    private Float DTQ43;
    @Column(name = "dtq44")
    private Float DTQ44;

    @Column(name = "dtkehoach")
    private Float DTKehoach;
    @Column(name = "dtkehoach2")
    private Float DTKehoach2;
    @Column(name = "dtkehoach3")
    private Float DTKehoach3;
    @Column(name = "dtkehoach4")
    private Float DTKehoach4;




    @Column(name = "lnq1")
    private Float LNQ1;
    @Column(name = "lnq12")
    private Float LNQ12;
    @Column(name = "lnq13")
    private Float LNQ13;
    @Column(name = "lnq14")
    private Float LNQ14;



    @Column(name = "lnq2")
    private Float LNQ2;
    @Column(name = "lnq22")
    private Float LNQ22;
    @Column(name = "lnq23")
    private Float LNQ23;
    @Column(name = "lnq24")
    private Float LNQ24;

    @Column(name = "lnq3")
    private Float LNQ3;
    @Column(name = "lnq32")
    private Float LNQ32;
    @Column(name = "lnq33")
    private Float LNQ33;
    @Column(name = "lnq34")
    private Float LNQ34;

    @Column(name = "lnq4")
    private Float LNQ4;
    @Column(name = "lnq42")
    private Float LNQ42;
    @Column(name = "lnq43")
    private Float LNQ43;
    @Column(name = "lnq44")
    private Float LNQ44;

    @Column(name = "lnkehoach")
    private Float LNKehoach;
    @Column(name = "lnkehoach2")
    private Float LNKehoach2;
    @Column(name = "lnkehoach3")
    private Float LNKehoach3;
    @Column(name = "lnkehoach4")
    private Float LNKehoach4;

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
    @Column(name = "co_tuc2")
    private Float CoTuc2;
    @Column(name = "co_tuc3")
    private Float CoTuc3;
    @Column(name = "co_tuc4")
    private Float CoTuc4;
    @Column(name = "tien_mat")
    private Float TienMat;
    @Column(name = "tien_mat2")
    private Float TienMat2;
    @Column(name = "tien_mat3")
    private Float TienMat3;
    @Column(name = "tien_mat4")
    private Float TienMat4;
    @Column(name = "co_phieu")
    private Float CoPhieu;
    @Column(name = "co_phieu2")
    private Float CoPhieu2;
    @Column(name = "co_phieu3")
    private Float CoPhieu3;
    @Column(name = "co_phieu4")
    private Float CoPhieu4;
    @Column(name = "dinh_gia")
    private Float DinhGia;

    public String getMaCoPhieu() {
        return MaCoPhieu;
    }

    public void setMaCoPhieu(String maCoPhieu) {
        MaCoPhieu = maCoPhieu;
    }

    public Float getCoPhieu() {
        return CoPhieu;
    }

    public void setCoPhieu(Float coPhieu) {
        CoPhieu = coPhieu;
    }

    public Float getCoPhieu2() {
        return CoPhieu2;
    }

    public void setCoPhieu2(Float coPhieu2) {
        CoPhieu2 = coPhieu2;
    }

    public Float getCoPhieu3() {
        return CoPhieu3;
    }

    public void setCoPhieu3(Float coPhieu3) {
        CoPhieu3 = coPhieu3;
    }

    public Float getDTQ1() {
        return DTQ1;
    }

    public void setDTQ1(Float DTQ1) {
        this.DTQ1 = DTQ1;
    }

    public Float getDTQ12() {
        return DTQ12;
    }

    public void setDTQ12(Float DTQ12) {
        this.DTQ12 = DTQ12;
    }

    public Float getDTQ13() {
        return DTQ13;
    }

    public void setDTQ13(Float DTQ13) {
        this.DTQ13 = DTQ13;
    }

    public Float getDTQ14() {
        return DTQ14;
    }

    public void setDTQ14(Float DTQ14) {
        this.DTQ14 = DTQ14;
    }

    public Float getDTQ2() {
        return DTQ2;
    }

    public void setDTQ2(Float DTQ2) {
        this.DTQ2 = DTQ2;
    }

    public Float getDTQ22() {
        return DTQ22;
    }

    public void setDTQ22(Float DTQ22) {
        this.DTQ22 = DTQ22;
    }

    public Float getDTQ23() {
        return DTQ23;
    }

    public void setDTQ23(Float DTQ23) {
        this.DTQ23 = DTQ23;
    }

    public Float getDTQ24() {
        return DTQ24;
    }

    public void setDTQ24(Float DTQ24) {
        this.DTQ24 = DTQ24;
    }

    public Float getDTQ3() {
        return DTQ3;
    }

    public void setDTQ3(Float DTQ3) {
        this.DTQ3 = DTQ3;
    }

    public Float getDTQ32() {
        return DTQ32;
    }

    public void setDTQ32(Float DTQ32) {
        this.DTQ32 = DTQ32;
    }

    public Float getDTQ33() {
        return DTQ33;
    }

    public void setDTQ33(Float DTQ33) {
        this.DTQ33 = DTQ33;
    }

    public Float getDTQ34() {
        return DTQ34;
    }

    public void setDTQ34(Float DTQ34) {
        this.DTQ34 = DTQ34;
    }

    public Float getDTQ4() {
        return DTQ4;
    }

    public void setDTQ4(Float DTQ4) {
        this.DTQ4 = DTQ4;
    }

    public Float getDTQ42() {
        return DTQ42;
    }

    public void setDTQ42(Float DTQ42) {
        this.DTQ42 = DTQ42;
    }

    public Float getDTQ43() {
        return DTQ43;
    }

    public void setDTQ43(Float DTQ43) {
        this.DTQ43 = DTQ43;
    }

    public Float getDTQ44() {
        return DTQ44;
    }

    public void setDTQ44(Float DTQ44) {
        this.DTQ44 = DTQ44;
    }

    public Float getDTKehoach() {
        return DTKehoach;
    }

    public void setDTKehoach(Float DTKehoach) {
        this.DTKehoach = DTKehoach;
    }

    public Float getDTKehoach2() {
        return DTKehoach2;
    }

    public void setDTKehoach2(Float DTKehoach2) {
        this.DTKehoach2 = DTKehoach2;
    }

    public Float getDTKehoach3() {
        return DTKehoach3;
    }

    public void setDTKehoach3(Float DTKehoach3) {
        this.DTKehoach3 = DTKehoach3;
    }

    public Float getDTKehoach4() {
        return DTKehoach4;
    }

    public void setDTKehoach4(Float DTKehoach4) {
        this.DTKehoach4 = DTKehoach4;
    }

    public Float getLNQ1() {
        return LNQ1;
    }

    public void setLNQ1(Float LNQ1) {
        this.LNQ1 = LNQ1;
    }

    public Float getLNQ12() {
        return LNQ12;
    }

    public void setLNQ12(Float LNQ12) {
        this.LNQ12 = LNQ12;
    }

    public Float getLNQ13() {
        return LNQ13;
    }

    public void setLNQ13(Float LNQ13) {
        this.LNQ13 = LNQ13;
    }

    public Float getLNQ14() {
        return LNQ14;
    }

    public void setLNQ14(Float LNQ14) {
        this.LNQ14 = LNQ14;
    }

    public Float getLNQ2() {
        return LNQ2;
    }

    public void setLNQ2(Float LNQ2) {
        this.LNQ2 = LNQ2;
    }

    public Float getLNQ22() {
        return LNQ22;
    }

    public void setLNQ22(Float LNQ22) {
        this.LNQ22 = LNQ22;
    }

    public Float getLNQ23() {
        return LNQ23;
    }

    public void setLNQ23(Float LNQ23) {
        this.LNQ23 = LNQ23;
    }

    public Float getLNQ24() {
        return LNQ24;
    }

    public void setLNQ24(Float LNQ24) {
        this.LNQ24 = LNQ24;
    }

    public Float getLNQ3() {
        return LNQ3;
    }

    public void setLNQ3(Float LNQ3) {
        this.LNQ3 = LNQ3;
    }

    public Float getLNQ32() {
        return LNQ32;
    }

    public void setLNQ32(Float LNQ32) {
        this.LNQ32 = LNQ32;
    }

    public Float getLNQ33() {
        return LNQ33;
    }

    public void setLNQ33(Float LNQ33) {
        this.LNQ33 = LNQ33;
    }

    public Float getLNQ34() {
        return LNQ34;
    }

    public void setLNQ34(Float LNQ34) {
        this.LNQ34 = LNQ34;
    }

    public Float getLNQ4() {
        return LNQ4;
    }

    public void setLNQ4(Float LNQ4) {
        this.LNQ4 = LNQ4;
    }

    public Float getLNQ42() {
        return LNQ42;
    }

    public void setLNQ42(Float LNQ42) {
        this.LNQ42 = LNQ42;
    }

    public Float getLNQ43() {
        return LNQ43;
    }

    public void setLNQ43(Float LNQ43) {
        this.LNQ43 = LNQ43;
    }

    public Float getLNQ44() {
        return LNQ44;
    }

    public void setLNQ44(Float LNQ44) {
        this.LNQ44 = LNQ44;
    }

    public Float getLNKehoach() {
        return LNKehoach;
    }

    public void setLNKehoach(Float LNKehoach) {
        this.LNKehoach = LNKehoach;
    }

    public Float getLNKehoach2() {
        return LNKehoach2;
    }

    public void setLNKehoach2(Float LNKehoach2) {
        this.LNKehoach2 = LNKehoach2;
    }

    public Float getLNKehoach3() {
        return LNKehoach3;
    }

    public void setLNKehoach3(Float LNKehoach3) {
        this.LNKehoach3 = LNKehoach3;
    }

    public Float getLNKehoach4() {
        return LNKehoach4;
    }

    public void setLNKehoach4(Float LNKehoach4) {
        this.LNKehoach4 = LNKehoach4;
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

    public Float getCoTuc2() {
        return CoTuc2;
    }

    public void setCoTuc2(Float coTuc2) {
        CoTuc2 = coTuc2;
    }

    public Float getCoTuc3() {
        return CoTuc3;
    }

    public void setCoTuc3(Float coTuc3) {
        CoTuc3 = coTuc3;
    }

    public Float getCoTuc4() {
        return CoTuc4;
    }

    public void setCoTuc4(Float coTuc4) {
        CoTuc4 = coTuc4;
    }

    public Float getTienMat() {
        return TienMat;
    }

    public void setTienMat(Float tienMat) {
        TienMat = tienMat;
    }

    public Float getTienMat2() {
        return TienMat2;
    }

    public void setTienMat2(Float tienMat2) {
        TienMat2 = tienMat2;
    }

    public Float getTienMat3() {
        return TienMat3;
    }

    public void setTienMat3(Float tienMat3) {
        TienMat3 = tienMat3;
    }

    public Float getTienMat4() {
        return TienMat4;
    }

    public void setTienMat4(Float tienMat4) {
        TienMat4 = tienMat4;
    }

    public Float getCoPhieu4() {
        return CoPhieu4;
    }

    public void setCoPhieu4(Float coPhieu4) {
        CoPhieu4 = coPhieu4;
    }

    public Float getDinhGia() {
        return DinhGia;
    }

    public void setDinhGia(Float dinhGia) {
        DinhGia = dinhGia;
    }
}
