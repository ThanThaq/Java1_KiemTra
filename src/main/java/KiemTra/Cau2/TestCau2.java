package KiemTra.Cau2;

import java.util.Scanner;

public class TestCau2 {
    public static void main(String[] args) {
        // Thông tin Nhân viên tạo sẵn
        NhanVien kt1 = new KyThuat("KT1","Than Le Thang", "27/01/2000","HN", "BA");

        // Nhập dữ liệu từ bàn phím
        Scanner in = new Scanner(System.in);
        System.out.print("\nNhập Mã Nhân Viên: ");
        String maNhanVien = in.nextLine();
        System.out.print("Nhập Họ và Tên: ");
        String hoTen = in.nextLine();
        System.out.print("Nhập Năm Sinh: ");
        String namSinh = in.nextLine();
        System.out.print("Nhập Địa Chỉ: ");
        String diaChi = in.nextLine();
        System.out.print("Nhập Chuyên Nghành: ");
        String chuyenNghanh = in.nextLine();

        // In ra thông tin 2 đối tượng
        System.out.println(kt1);
        System.out.println("Nhân Viên trên thuộc lĩnh vực: " + kt1.moTaCongViec());

        NhanVien kt2 = new KyThuat(maNhanVien,hoTen, namSinh, diaChi, chuyenNghanh);
        System.out.println(kt2);
        System.out.println("Nhân Viên trên thuộc lĩnh vực: " + kt2.moTaCongViec());

    }
}