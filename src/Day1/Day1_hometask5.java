package Day1;

import java.util.Scanner;

public class Day1_hometask5 {
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
            System.out.print(roll[i] + " ");
        }
        System.out.println();

        int[] newRoll = new int[size];
        System.arraycopy(roll, 0, newRoll, 2, roll.length - 2);
        System.arraycopy(roll, roll.length - 2, newRoll, 0, 2);
        System.out.println();
        System.out.println("Exchanged roll[]:");
        for (int i : newRoll) {
            System.out.print(i + " ");
        }
    }
}