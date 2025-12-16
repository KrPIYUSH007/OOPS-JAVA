import java.util.Scanner;
import java.lang.Math;
public class QuadraticEquationRoots {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter coefficient a:");
        double a = input.nextDouble();
        System.out.println("Enter coefficient b:");
        double b = input.nextDouble();
        System.out.println("Enter coefficient c:");
        double c = input.nextDouble();
        double d = (b * b) - (4 * a * c);
        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The roots are real and distinct");
            System.out.println("1st root = " + r1);
            System.out.println("2nd root = " + r2);
        }
        else if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("Roots are equal and real, which is " + r);
        }
        else { 
            double realpart = -b / (2 * a);
            double imagpart = Math.sqrt(-d) / (2 * a);
            System.out.println("The roots are complex:");
            System.out.println("root1 = " + realpart + " + " + imagpart + "i");
            System.out.println("root2 = " + realpart + " - " + imagpart + "i");
        }
    }
}
