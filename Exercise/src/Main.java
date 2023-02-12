import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        String line = scanner.nextLine();
        String [] numbersAsStrins = line.split("\\s+");

        int [] sums = new int[2];
        for (String s : numbersAsStrins) {
            int number = Integer.parseInt(s);
            sums[number%2] += number;

        }
        System.out.println(sums[0] - sums[1]);


        System.out.println(1 % 2);
        System.out.println(2 % 2);
        System.out.println(3 % 2);
        System.out.println(4 % 2);
        System.out.println(5 % 2);
        System.out.println(6 % 2);
        System.out.println(7 % 2);
        System.out.println(8 % 2);
        System.out.println(9 % 2);
        System.out.println(10 % 2);
        System.out.println(5 / 2);



    }



}