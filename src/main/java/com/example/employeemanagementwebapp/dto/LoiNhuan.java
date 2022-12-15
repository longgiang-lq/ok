package com.example.employeemanagementwebapp.dto;

public class LoiNhuan {
    private Float LNQ1;
    private Float LNQ2;
    private Float LNQ3;
    private Float LNQ4;
    private Float LNKehoach;

    public LoiNhuan(Float LNQ1, Float LNQ2, Float LNQ3, Float LNQ4, Float LNKehoach) {
        this.LNQ1 = LNQ1;
        this.LNQ2 = LNQ2;
        this.LNQ3 = LNQ3;
        this.LNQ4 = LNQ4;
        this.LNKehoach = LNKehoach;
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
}
