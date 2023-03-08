package KiemTra.Cau1;

public class TestCau1 {
    public static void main(String[] args) {
        // Circle[r = 1]
        Circle c1 = new Circle();
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
        System.out.println(c1);

        // Circle[r = 2]
        Circle c2 = new Circle(2);
        System.out.println(c2.getArea());
        System.out.println(c2.getCircumference());
        System.out.println(c2);

        // Test Error
        try{
            Circle c3 = new Circle(-3);
        }
        catch (Exception e){
            System.out.println(e);
        }

        try{
            Circle c4 = new Circle(5);
            c4.setRadius(-4);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
