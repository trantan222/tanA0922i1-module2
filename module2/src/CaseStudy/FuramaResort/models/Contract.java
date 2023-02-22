package CaseStudy.FuramaResort.models;

public class Contract {
    private int SoHopDong;
    private String maBooking;
    private int soTienCocTruoc;
    private int TongThanhToan;
    private String maKhachHang;

    public Contract(int soHopDong, String maBooking, int soTienCocTruoc, int tongThanhToan, String maKhachHang) {
        SoHopDong = soHopDong;
        this.maBooking = maBooking;
        this.soTienCocTruoc = soTienCocTruoc;
        TongThanhToan = tongThanhToan;
        this.maKhachHang = maKhachHang;
    }

    public int getSoHopDong() {
        return SoHopDong;
    }

    public void setSoHopDong(int soHopDong) {
        SoHopDong = soHopDong;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public int getSoTienCocTruoc() {
        return soTienCocTruoc;
    }

    public void setSoTienCocTruoc(int soTienCocTruoc) {
        this.soTienCocTruoc = soTienCocTruoc;
    }

    public int getTongThanhToan() {
        return TongThanhToan;
    }

    public void setTongThanhToan(int tongThanhToan) {
        TongThanhToan = tongThanhToan;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "SoHopDong=" + SoHopDong +
                ", maBooking='" + maBooking + '\'' +
                ", soTienCocTruoc=" + soTienCocTruoc +
                ", TongThanhToan=" + TongThanhToan +
                ", maKhachHang='" + maKhachHang + '\'' +
                '}';
    }
}
