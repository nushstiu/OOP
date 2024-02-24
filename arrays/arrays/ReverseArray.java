package HW.arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma=0;

        int[] numbers = new int[5];
        System.out.println("Introduceti nr de elemente:");
        int val = scanner.nextInt();

        for (int i = 0; i < val; i++) {
            numbers[i] = scanner.nextInt();

        }

        for (int i = 0; i < numbers.length/2; i++) {
            int temp = numbers[i];
            numbers[i] =numbers[numbers.length -1 -i];
            numbers[numbers.length - 1 - i] =temp;
        }

        for(int num: numbers){
            System.out.println(num + "");
        }
    }
}
