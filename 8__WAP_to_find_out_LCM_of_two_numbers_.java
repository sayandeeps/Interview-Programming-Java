import java.util.Scanner;

class A {
    public static int calculateLCM(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        } else {
            int gcd = calculateHCF(a, b);
            return (a * b) / gcd;
        }
    }

    public static int calculateHCF(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculateHCF(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        if (args.length == 2) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        } else {
            System.out.print("Enter two numbers: ");
            a = sc.nextInt();
            b = sc.nextInt();
        }
        System.out.println("LCM of " + a + " and " + b + " is " + calculateLCM(a, b));
        System.out.println("HCF of " + a + " and " + b + " is " + calculateHCF(a, b));

    }
}