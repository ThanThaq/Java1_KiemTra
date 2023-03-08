package KiemTra.Cau3;

public class TestCau3 {
    public static void main(String[] args) {
        VanBan v1 = new VanBan();
        v1.setSt("    Mình  là Thân Lê Thắng   đang  làm Bài Kiểm Tra của môn Java1   ");
        // Đếm Số từ
        System.out.println("a.Số từ của văn bản là: " + v1.demSoTu());
        // Chuyển sang văn bản chuẩn
        v1.setSt(v1.chuanHoaVanBan());
        System.out.println("b.Văn bản chuẩn hóa là: " + v1);

        // Viết hoa toàn bộ
        v1.setSt(v1.vietHoa());
        System.out.println("c.Văn bản khi viết hoa toàn bộ là: " +v1);

        // Viết thường toàn bộ
        v1.setSt(v1.vietThuong());
        System.out.println("d.Văn bản khi viết thường toàn bộ là: " + v1);

        // Viết hoa các từ đầu tiên
        v1.setSt(v1.vietHoaMoiTuDauTien());
        System.out.println("e. Viết hoa chữ cái đầu tiên của mỗi từ trong văn bản là: " + v1);
    }
}