package GH2;

interface Shape {
    void calculateArea(int a);
    void calculatePerimeter(int r);
}

class Circle implements Shape {
    public void calculateArea(int r) {
    double area;
    area = 3.1415 * r * r;
    System.out.println("Circle area: " + area);
    }
    public void calculatePerimeter(int r) {
    double peri;
    peri = 3.1415 * 2 * r;
    System.out.println("Circle perimeter: " + peri);
    }
}
class Square implements Shape {
    public void calculateArea(int a) {
        int area = a * a;
        System.out.println("Square area = " + area);
    }
    public void calculatePerimeter(int a) {

        int peri = 4 * a;
        System.out.println("Square perimeter = " + peri);
    }
}


public class SAP {
    public static void main (String[] args){

        Circle one = new Circle();
        Square two = new Square();

        one.calculateArea(3);
        one.calculatePerimeter(10);

        two.calculateArea(5);
        two.calculatePerimeter(15);


    }

}
