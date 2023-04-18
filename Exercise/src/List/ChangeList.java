package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        String[] command = input.split(" ");

        while(!command.equals("end")){
            if(command[0].equals("Delete")){
                var num = Integer.parseInt(command[1]);
                for (int i = 0; i < numbers.size(); i++) {
                    if(numbers.get(i).equals(num)){
                        numbers.remove(i);
                        i--;
                    }
                }
            }
        }
    }
}
