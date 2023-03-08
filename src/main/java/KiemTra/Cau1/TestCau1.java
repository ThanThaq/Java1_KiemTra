package KiemTra.Cau1;

import com.sun.source.tree.ContinueTree;

public class TestCau1 {
    public static void main(String[] args) {
        // Bán Kinh = 1.0
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println("Diện Tích của hình tròn là: " + c1.getArea());
        System.out.println("Chu Vi của hình tròn là: " + c1.getCircumference());

        // Bán Kinh = 2.0
        Circle c2 = new Circle(2);
        System.out.println(c2);
        System.out.println("Diện Tích của hình tròn là: " + c2.getArea());
        System.out.println("Chu Vi của hình tròn là: " + c2.getCircumference());

        System.out.println("Test case lỗi:");
        // Nhập lỗi Bán Kính

//      Circle c3 = new Circle(-3);

        Circle c4 = new Circle(5);
        c4.setRadius(-4);
    }
}
