package OpinionPoll;

import java.sql.PseudoColumnUsage;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            Person person = new Person(input[0], Integer.parseInt(input[1]));
            personList.add(person);


        }
        personList = personList.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());
        personList.sort(Comparator.comparing(person -> person.getName()));
        personList.forEach(item->System.out.printf("%s - %d%n", item.getName(), item.getAge() ));
    }
}