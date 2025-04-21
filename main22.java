interface Main1{
double getPerimeter( );
}
 class Rectangle implements Main1 {

     private double length;
    private  double width;
 Rectangle(double length, double width){
    this.length = length;
    this.width = width;
 }
   public double getPerimeter() {
    return 2 * (length + width);
   }
 }
 class Circle implements Main1 {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
 }
  class Triangle implements Main1 {
    private double side1, side2, side3;
    Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
  }public class main22{
    public static void main(String[] args) {
      System.out.println("NAME: P SAI LIKHITH ROLL NO: 24306 SEC: CSE-A");
        Main1 rectangle = new Rectangle(3,4);
        Main1 circle = new Circle(5);
        Main1 triangle = new Triangle(2,5,6);
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
    }
  }