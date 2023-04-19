package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCommand = Integer.parseInt(scanner.nextLine());

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < numberOfCommand; i++) {
            String[] separated = scanner.nextLine().split(" ");

            if (separated[2].equals("going!") && list.contains(separated[0])) {

                System.out.printf("%s is already in the list!%n", separated[0]);
            }
            else if (separated[2].equals("not")) {
                if (list.contains(separated[0])) {
                    list.remove(separated[0]);
                } else {
                    System.out.printf("%s is not in the list!%n", separated[0]);
                }
            } else {
                list.add(separated[0]);
            }
        }

        for (String s : list) {
            System.out.printf("%s%n", s);
        }
    }
}

