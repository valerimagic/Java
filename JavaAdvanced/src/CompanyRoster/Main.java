package CompanyRoster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine().split("//S+");

            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];

            if(input.length == 5){
                if()
            }
        }

    }
}
