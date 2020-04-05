package Day1;

import java.util.Scanner;

public class Day1_hometask1 {
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

        for (int i = 0; i < size; i++) {
            roll[i] = ++roll[i];//prefix increment operation
            System.out.print(roll[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            roll[i] = roll[i]++;//postfix increment operation
            System.out.print(roll[i] + " ");
        }
    }
}
