import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Revers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            ArrayDeque<String> numbers = new ArrayDeque<>();
            Arrays.stream(input.split(" "))
                    .forEach(numbers::push);

            for (String string : numbers)
                System.out.print(numbers.pop() + " ");
        }
}