package CaseStudy.FuramaResort.models;

import java.time.LocalDate;

public class booking {
    private String maBooking;
    private LocalDate begin;
    private LocalDate end;
    private String maKhachHang;
    private String tenDichvu;
    private String loaiDichVu;

    public booking(String maBooking, LocalDate begin, LocalDate end, String maKhachHang, String tenDichvu, String loaiDichVu) {
        this.maBooking = maBooking;
        this.begin = begin;
        this.end = end;
        this.maKhachHang = maKhachHang;
        this.tenDichvu = tenDichvu;
        this.loaiDichVu = loaiDichVu;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public LocalDate getBegin() {
        return begin;
    }

    public void setBegin(LocalDate begin) {
        this.begin = begin;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenDichvu() {
        return tenDichvu;
    }

    public void setTenDichvu(String tenDichvu) {
        this.tenDichvu = tenDichvu;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    @Override
    public String toString() {
        return "booking{" +
                "maBooking='" + maBooking + '\'' +
                ", begin=" + begin +
                ", end=" + end +
                ", maKhachHang='" + maKhachHang + '\'' +
                ", tenDichvu='" + tenDichvu + '\'' +
                ", loaiDichVu='" + loaiDichVu + '\'' +
                '}';
    }
}
