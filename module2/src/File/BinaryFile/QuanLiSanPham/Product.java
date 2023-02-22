package File.BinaryFile.QuanLiSanPham;

import java.io.Serializable;

public class Product implements Serializable {
    private String maSP;
    private String name;
    private String HangSX;
    private double gia;
    private String decribse;

    public Product(String maSP, String name, String hangSX, double gia, String decribse) {
        this.maSP = maSP;
        this.name = name;
        HangSX = hangSX;
        this.gia = gia;
        this.decribse = decribse;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHangSX() {
        return HangSX;
    }

    public void setHangSX(String hangSX) {
        HangSX = hangSX;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getDecribse() {
        return decribse;
    }

    public void setDecribse(String decribse) {
        this.decribse = decribse;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maSP='" + maSP + '\'' +
                ", name='" + name + '\'' +
                ", HangSX='" + HangSX + '\'' +
                ", gia=" + gia +
                ", decribse='" + decribse + '\'' +
                '}';
    }
}
