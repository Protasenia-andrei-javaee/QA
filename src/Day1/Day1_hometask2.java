package Day1;

import java.util.Scanner;

public class Day1_hometask2 {
    public static final int RAND = 100;
    public static final int MAX = 26;
    public static void main(String[] args) {
        System.out.println("Enter a natural number");
        Scanner summator = new Scanner(System.in);
        int size = summator.nextInt();
        int[] roll = new int[size];

        for (int i = 0; i < size; i++) {
            roll[i] = (int) (Math.random() * RAND);
            while(roll[i]<MAX) {
                System.out.print(roll[i] + " ");
                break;
            }
        }
    }
}

