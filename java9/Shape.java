abstract public class Shape {
    double a;
    double b;
    double area;
    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public Shape(double a) {
        this.a = a;
    }
    abstract public void area();
    abstract public void perimeter();
    public void display() {
        System.out.println("The area is " + area);
    }
}

class Rectangle extends Shape {
    Rectangle(int a, int b) {
        super(a, b);
    }
    public void area() {
        area = a * b;
    }
    public void perimeter() {
        double perimeter = 2 * (a + b);
        System.out.println("The perimeter is " + perimeter);
    }
}

class Triangle extends Shape {
    public Triangle(int a, int b) {
        super(a, b);
    }
    public void area() {
        area = a * b * 0.5;
    }
    public void perimeter() {
        double c = Math.sqrt(a * a + b * b);
        double perimeter = a + b + c;
        System.out.println("The perimeter is " + perimeter);
    }
}
class Circle extends Shape {
    public Circle(double a) {
        super(a);
    }
    public void area() {
        area = a * a * Math.PI;
    }
    public void perimeter() {
        double perimeter = 2 * Math.PI * a;
        System.out.println("The perimeter is " + perimeter);
    }
}

class Print {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 5);
        rectangle.area();
        rectangle.display();
        rectangle.perimeter();
        Shape triangle = new Triangle(10, 10);
        triangle.area();
        triangle.display();
        triangle.perimeter();
        Shape circle = new Circle(5);
        circle.area();
        circle.display();
        circle.perimeter();
    }
}

