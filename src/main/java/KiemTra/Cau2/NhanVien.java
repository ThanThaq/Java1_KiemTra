package KiemTra.Cau2;

public abstract class NhanVien {
    private String maNhanVien;
    private String hoTen;
    private String namSinh;

    private String address;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String hoTen) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
    }

    public NhanVien(String maNhanVien, String hoTen, String namSinh, String address) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.address = address;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract String moTaCongViec();

    @Override
    public String toString() {
        return "NhanVien[" +
                "maNhanVien='" + maNhanVien +
                ", hoTen='" + hoTen +
                ", namSinh='" + namSinh +
                ", address='" + address +
                ']';
    }
}