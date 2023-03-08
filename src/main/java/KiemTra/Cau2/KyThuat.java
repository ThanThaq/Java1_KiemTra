package KiemTra.Cau2;

public class KyThuat extends NhanVien{

    private String chuyenNghanh;

    public KyThuat() {
    }

    public KyThuat(String maNhanVien, String hoTen) {
        super(maNhanVien, hoTen);
    }

    public KyThuat(String maNhanVien, String hoTen, String namSinh, String address, String chuyenNghanh) {
        super(maNhanVien, hoTen, namSinh, address);
        this.chuyenNghanh = chuyenNghanh;
    }

    public String getChuyenNghanh() {
        return chuyenNghanh;
    }

    public void setChuyenNghanh(String chuyenNghanh) {
        this.chuyenNghanh = chuyenNghanh;
    }

    @Override
    public String moTaCongViec() {
        return "Kỹ thuật";
    }

    @Override
    public String toString() {
        return "KyThuat[" + super.toString() +
                "\n, chuyenNghanh='" + chuyenNghanh +
                ']';
    }
}
