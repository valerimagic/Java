package ExerciseArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    String firsName;
    private String lastName;
    private int age;
    private String citi;

    public Student(String firsName, String lastName, int age, String citi) {
        this.firsName = firsName;
        this.lastName = lastName, firstname;
        this.age = age;
        this.citi = citi;
    }

    public String GetFirstName() {

        return this.firsName;
    }
    public String GetLastName() {
        return this.lastName;
    }

    public void SetFirstName(String firsName) {
        this.firsName = firstName;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> studentList = new ArrayList<>();
        while (!input.equals("end")) {

            String[] studentsArr = input.split(" ");
            Student student = new Student(studentsArr[0], studentsArr[1], studentsArr[2], studentsArr[3]);
            studentList.add(student);

            input = scanner.nextLine();
        }

        
        for (Student item : studentList){
            if (item.getCity().equals(city)){
                System.out.println(item.getFirstName() + " " + item.getSecondName() + " is " + item.getAge() + " years old");
            }
        }
    }

}
