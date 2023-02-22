package CaseStudy.FuramaResort.models;

import java.time.LocalDate;

public class person {
    private String ma;
    private String hoTen;
    private LocalDate date;
    private int CMND;
    private int soDt;
    private String email;

    public person(String ma, String hoTen, LocalDate date, int CMND, int soDt, String email) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.date = date;
        this.CMND = CMND;
        this.soDt = soDt;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public int getSoDt() {
        return soDt;
    }

    public void setSoDt(int soDt) {
        this.soDt = soDt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "person{" +
                "ma='" + ma + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", date=" + date +
                ", CMND=" + CMND +
                ", soDt=" + soDt +
                ", email='" + email + '\'' +
                '}';
    }
}
