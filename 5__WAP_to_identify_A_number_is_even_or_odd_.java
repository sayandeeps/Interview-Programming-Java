import java.util.Scanner;

class NotANumberException extends Exception {
    public NotANumberException(String message) {
        super(message);
    }
}

class A {
    static void evenorodd(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        if (args.length > 0) {
            try {
                num = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
                return;
            }
        } else {
            System.out.print("Enter a number: ");
            try {
                num = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input");
                return;
            }
        }
        evenorodd(num);
    }
}