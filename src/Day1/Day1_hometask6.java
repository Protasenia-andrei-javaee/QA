package Day1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Day1_hometask6 {
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

        List<Integer> rollToList = Arrays.stream(roll).boxed().collect(Collectors.toList());
        List<Integer> evenList = rollToList.stream().filter(x -> x%2!=1).collect(Collectors.toList());
        evenList.stream().filter(x -> x >= 2 && x<=20).filter(x -> x > 10).sorted().forEach(x -> System.out.print(x + " "));

        //Arrays.stream(roll).boxed().filter(x -> x >= 2 && x<=20 && x%2!=1).filter(x -> x > 10).sorted().forEach(x -> System.out.print(x + " ")); //Single line option
    }
}