package CompanyRoster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        //List<Employee> employeeList = new ArrayList<>();
        //List<Deparment> deparmentList = new ArrayList<>();

        for (int i = 0; i < number; i++) {

            String[] input = scanner.nextLine().split("\\s+");


            String name = input[0];
            int salary = Integer.parseInt(input[1]);
            String position = input[2];
            String department = input[3];

            Employee current = new Employee();

            if(input.length == 6){
                String email = input[4];
                int age = Integer.parseInt(input[5]);
                current = new Employee(name, salary, position, department, email, age);
            } else if (input.length == 5){
                if(input[4].contains("@")){
                    String email = input[4];
                    current = new Employee(name, salary, position, department, email);
                } else {
                    int age = Integer.parseInt(input[4]);
                    current = new Employee(name, salary, position, department, age);
                }
            }
            else {
                current = new Employee(name, salary, position, department);
            }
//            employeeList.add(current);
//
//            if(!deparmentList.stream().anyMatch(deparment -> deparment.getName().equals(department))){
//                Deparment newDeparment = new Deparment(department);
//                deparmentList.add(newDeparment);
//                   }
//
//            Deparment currentDep = deparmentList.stream()
//                    .filter(d->d.getName().equals(department))
//                    .findFirst().get();
//
//            currentDep.addEmloyee(current);



        }

    }
}
