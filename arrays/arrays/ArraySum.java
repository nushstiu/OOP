package HW.arrays;

import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma=0;

        int[] numbers = new int[5];
        System.out.println("Introduceti nr de elemente:");
        int val = scanner.nextInt();

        for (int i = 0; i < val; i++) {
            numbers[i] = scanner.nextInt();

        }
        for (int i=0; i<val; i++){
            suma += numbers[i];
        }
        System.out.println(suma);
    }
}
