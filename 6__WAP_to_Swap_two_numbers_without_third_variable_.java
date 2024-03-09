import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
        // Initial values:

        // a = 5 (binary: 0101)
        // b = 3 (binary: 0011)
        // After a = a ^ b;:

        // a = 5 ^ 3 = 6 (binary: 0110)
        // b = 3 (unchanged)
        // After b = a ^ b;:

        // a = 6 (unchanged)
        // b = 6 ^ 3 = 5 (binary: 0101)
        // After a = a ^ b;:

        // a = 6 ^ 5 = 3 (binary: 0011)
        // b = 5 (unchanged)
        // Final values:

        // a = 3
        // b = 5
        // 5 is 0101 in binary.
        // 3 is 0011 in binary.
        // Performing XOR on each pair of corresponding bits: 0101 ^ 0011 = 0110 (which
        // is 6 in decimal).
    }
}