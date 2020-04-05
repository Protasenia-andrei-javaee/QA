package Day1;

import java.util.Scanner;

public class Day1_hometask4 {
    public static final int RAND = 100;
    public static void main(String[] args) {
        System.out.println("Enter a natural number");
        Scanner summator = new Scanner(System.in);
        int size = summator.nextInt();
        int[] roll = new int[size];

        for (int i = 0; i < size; i++) {
            roll[i] = (int) (Math.random() * RAND);
        }
        for (int i = 0; i < size; i++) {
            System.out.print(roll[i] + " ");}
        System.out.println();

        exchangeRoll(roll);
    }
    private static void exchangeRoll(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i += 2) {
            temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        System.out.println("New roll[]: ");
        for (int k : array) {
            System.out.print(k + " ");
        }
    }
}