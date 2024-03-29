package OpinionPoll;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        List<Person> list = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine().split(" ");
            Person person = new Person(input[0], Integer.parseInt(input[1]));
            list.add(person);
        }

        for (Person person : list) {
            if(person.getAge() > 30){
                System.out.println(person.getName() + "-" + person.getAge());
            }
        }
    }
}
