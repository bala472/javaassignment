
abstract public class Shape{
    double a;
    double b;
    double area;
    public Shape(double a,double b){
        this.a=a;
        this.b=b;
    }
    public Shape(double a){
        this.a=a;
    }
    abstract public void area();
    public void display(){
        System.out.println("The area is "+area);
    }
}
class Rectangle extends Shape{
   Rectangle(int a,int b){
       super(a,b);
    }
    public void area(){
     area =  a*b;
    }
}
class Triangle extends Shape{
    public Triangle (int a,int b){
        super(a,b);
    }
    public void area(){
        area=a*b*0.5;
    }
}
class Circle extends  Shape{
    public Circle(double a){
        super(a);
    }
    public void area(){
        area = a * a * Math.PI;
    }
}
class Print {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,5);
        rectangle.area();
        rectangle.display();
        Shape triangle = new Triangle(10,10);
        triangle.area();
        triangle.display();
        Shape circle = new Circle(5);
        circle.area();
        circle.display();
    }
}