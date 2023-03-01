import java.util.*;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Double> numbers =
                Arrays.stream(scanner.nextLine().split(""))
                        .map(Double::parseDouble)
                        .collect(Collectors.toList());



        int a = 5;
        


    }
}
