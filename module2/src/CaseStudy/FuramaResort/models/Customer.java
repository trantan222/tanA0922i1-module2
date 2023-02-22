package CaseStudy.FuramaResort.models;

import java.time.LocalDate;

public class Customer extends person{

    private String loaiKhachHang;   //Loại Customer bao gồm: (Diamond, Platinium, Gold, Silver, Member).
    private String diaChi;

    public Customer(String ma, String hoTen, LocalDate date, int CMND, int soDt, String email, String loaiKhachHang, String diaChi) {
        super(ma, hoTen, date, CMND, soDt, email);
        this.loaiKhachHang = loaiKhachHang;
        this.diaChi = diaChi;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "loaiKhachHang='" + loaiKhachHang + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
