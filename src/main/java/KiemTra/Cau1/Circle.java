package KiemTra.Cau1;

public class Circle {
    private double radius = 1.0;

    public Circle() {
    }
    // Khai bao -> Check bán kính không hợp lệ -> RuntimeException với mesage là "Error"
    public Circle(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Error");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    // Hàm Set -> Check bán kính không hợp lệ -> RuntimeException với mesage là "Error"
    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Error");
        }
        this.radius = radius;
    }

    public double getArea() {
        return (radius * radius) * Math.PI;
    }

    public double getCircumference() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }
}
