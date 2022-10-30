import java.util.*;
class AsciiChars {
    public static void printNumbers() {
        System.out.print("\nValid numbers: ");
        for (int i = 25; i < 35; i++) {
            System.out.print(i + " ");
        }
    }

    public static void printLowerCase() {
        System.out.print("\nValid lowercase: ");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.printf(ch + " ");
        }
    }

    public static void printUpperCase() {
        System.out.printf("\nValid uppercase: ");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.printf(ch + " ");
        }
    }
}