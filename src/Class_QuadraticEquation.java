import java.util.Scanner;

public class Class_QuadraticEquation {
    private double a, b, c;

    public void Class_QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    public double getDiscrimiant() {
        return (b*b - (4*a*c));
    }

    public double getRoot1() {
        if (getDiscrimiant() >= 0)
            return (-b + Math.pow(getDiscrimiant(),0.5)) / (2*a);
        else return 0;
    }

    public double getRoot2() {
        if (getDiscrimiant() >= 0)
            return (-b - Math.pow(getDiscrimiant(),0.5)) / (2*a);
        else return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap c: ");
        double c = scanner.nextDouble();

        Class_QuadraticEquation quadraticEquation = new Class_QuadraticEquation();

        quadraticEquation.Class_QuadraticEquation(a,b,c);

        if (quadraticEquation.getDiscrimiant() > 0) {
            System.out.println("Root1 = " + quadraticEquation.getRoot1());
            System.out.println("Root2 = " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscrimiant() == 0) {
            System.out.println("Only Root = " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has NO Roots");
        }
    }
}
