package Day1;

import java.util.Scanner;

public class Day1_hometask3 {
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
            if (roll[i] >= 2 && roll[i] <= 20 && roll[i] % 2 != 1) {
                System.out.print(roll[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (roll[i] >= 10) {
                System.out.print(roll[i] + " ");
            }
        }
    }
}

