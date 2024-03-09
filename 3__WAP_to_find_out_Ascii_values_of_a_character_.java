class A {
    public static void main(String[] args) {
        if (args.length > 0) {
            char ch = args[0].charAt(0);
            System.out.println("The ASCII value of " + ch + " is " + (int) ch);
        } else {
            System.out.println("No input provided.");
        }
    }
}