package HW.arrays;

import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduceti nr de elemente");
        int val = scanner.nextInt();
        int [] numbers = new int[val];

        System.out.println("Introduceti cele " + val + " elemente");
        for (int i = 0; i < val; i++) {
            numbers[i] = scanner.nextInt();
        }

            int max = numbers[0];
            int min = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }

                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }

            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
    }

}
