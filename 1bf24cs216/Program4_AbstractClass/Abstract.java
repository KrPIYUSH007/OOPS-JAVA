import java.util.*;
import java.util.Scanner;
abstract class Shape {
    int a,b;
    Shape(int a, int b){
        this.a=a;
        this.b=b;
    }
    abstract void PrintArea();
}
class Rectangle extends Shape{
    Rectangle (int length, int width){
        super(length, width);
    }
public void PrintArea(){
    System.out.println("Area of the rectangle: "+ (a*b));
}
}
class Triangle extends Shape{
    Triangle (int height, int base){
        super(height, base);
    }
public void PrintArea(){
    System.out.println("Area of the triangle: "+ 0.5*(a*b));
}
}
class Circle extends Shape{
   Circle (int radius){
        super(radius,0);
    }
public void PrintArea(){
    System.out.println("Area of the circle: "+ 3.14*a*a);
}
}
 public class abs_demo{
        public static void main(String [] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter length and width of rectangle");
            int l=sc.nextInt();
            int w=sc.nextInt();
            Rectangle r2= new Rectangle(l,w);
            r2.PrintArea();
             System.out.println("Enter height and base of triangle");
            int h=sc.nextInt();
            int b=sc.nextInt();
            Triangle t2= new Triangle(h,b);
            t2.PrintArea();
             System.out.println("Enter radius of circle");
            int rad=sc.nextInt();
            Circle c2= new Circle(rad);
            c2.PrintArea();
        }
     }                                                                                                         
