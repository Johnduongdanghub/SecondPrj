package iuh.fit.ktpm;

/**
 * @description: This class represent a rectangle
 * @author: Dương, Đặng Trần Dương
 * @version: 1.0
 * @created: 25/08/2024 5:45 CH
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle re1 = new Rectangle();

        re1.setWidth(2.0);
        re1.setLength(3.0);
        System.out.println("Rectangle 1: "+re1.getWidth()+" "+re1.getLength());
        System.out.println("ARea: "+re1.getArea());
        System.out.println("Perimeter: "+re1.getPerimeter());
    }
}
