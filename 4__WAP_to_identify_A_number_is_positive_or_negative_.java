import java.util.Scanner;

class A {
    void positiveornegative(int n) {
        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else if (n == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Invalid input");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        if (args.length > 0) {
            num = Integer.parseInt(args[0]);
        } else {
            System.out.print("Enter a number: ");
            num = sc.nextInt();
        }
        A obj = new A();
        obj.positiveornegative(num);

    }
}