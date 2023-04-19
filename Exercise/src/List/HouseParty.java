package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCommand = Integer.parseInt(scanner.nextLine());

        ArrayList<String> list = new ArrayList<String>();
        String input = scanner.nextLine();

        for (int i = 0; i < numberOfCommand; i++) {
            String[] separated = input.split(" ");

            if (separated[2].equals("going!") && list.contains(separated[0])) {

                System.out.printf("%s is already in the list!", separated[0]);
            } else {
                list.add(separated[0]);
            }
            input = scanner.nextLine();
        }




    }

}

