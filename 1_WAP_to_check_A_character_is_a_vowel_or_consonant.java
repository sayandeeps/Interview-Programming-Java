//1. WAP to check A character is a vowel or consonant

import java.util.Scanner;

class A {
    void checkVowelOrConsonant(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println("Consonant");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Number");
        } else {
            System.out.println("Special Character");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        A obj = new A();
        obj.checkVowelOrConsonant(ch);
    }
}