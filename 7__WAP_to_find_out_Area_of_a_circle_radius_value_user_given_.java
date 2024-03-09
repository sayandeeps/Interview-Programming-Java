import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        if (args.length > 0) {
            radius = Double.parseDouble(args[0]);
        } else {
            System.out.print("Enter the radius of the circle: ");
            radius = sc.nextDouble();
        }
        System.out.println("Area of the circle: " + (3.14 * radius * radius));
    }
}