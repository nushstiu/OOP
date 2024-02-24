package HW.arrays;

import java.util.Scanner;
public class FindLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] letters = new char[10];

        System.out.println("Introdu literele");
        for (int i = 0; i < letters.length; i++) {
            letters[i] = scanner.next().charAt(0);
        }

        for (int i = 0; i < letters.length; i++) {
            char currentChar = letters[i];

            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u' || currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U') {
                System.out.println(currentChar + " is a vowel");
            } else {
                System.out.println(currentChar + " is a consonant");
            }
        }

    }
}
