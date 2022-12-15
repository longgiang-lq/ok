package com.example.employeemanagementwebapp.dto;

public class DoanhThu {
    private Float DTQ1;
    private Float DTQ2;
    private Float DTQ3;
    private Float DTQ4;
    private Float DTKehoach;

    public DoanhThu(Float DTQ1, Float DTQ2, Float DTQ3, Float DTQ4, Float DTKehoach) {
        this.DTQ1 = DTQ1;
        this.DTQ2 = DTQ2;
        this.DTQ3 = DTQ3;
        this.DTQ4 = DTQ4;
        this.DTKehoach = DTKehoach;
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
}
