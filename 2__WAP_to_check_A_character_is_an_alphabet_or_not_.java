class A {
    public static void main(String[] args) {
        if (args.length > 0) {
            char ch = args[0].charAt(0);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                System.out.println("Alphabet");
            } else {
                System.out.println("Not an alphabet");
            }
        } else {
            System.out.println("No input provided.");
        }
    }
}