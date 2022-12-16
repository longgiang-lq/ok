package com.example.employeemanagementwebapp.dto;

public class VonHoa {
    private Float EPS;
    private Float PE;
    private String ROE;
    private Float VCSH;
    private Float SLCP;
    private Float Bookvalue;
    private Float PB;
    private String ROA;
    private String BienLoiNhuan;

    public VonHoa(Float EPS, Float PE, String ROE, Float VCSH, Float SLCP, Float bookvalue, Float PB, String ROA, String bienLoiNhuan) {
        this.EPS = EPS;
        this.PE = PE;
        this.ROE = ROE;
        this.VCSH = VCSH;
        this.SLCP = SLCP;
        Bookvalue = bookvalue;
        this.PB = PB;
        this.ROA = ROA;
        BienLoiNhuan = bienLoiNhuan;
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

    public String getROE() {
        return ROE;
    }

    public void setROE(String ROE) {
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

    public String getROA() {
        return ROA;
    }

    public void setROA(String ROA) {
        this.ROA = ROA;
    }

    public String getBienLoiNhuan() {
        return BienLoiNhuan;
    }

    public void setBienLoiNhuan(String bienLoiNhuan) {
        BienLoiNhuan = bienLoiNhuan;
    }
}
