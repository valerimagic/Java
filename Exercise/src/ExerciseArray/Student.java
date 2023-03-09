package ExerciseArray;

public class Student {
    String firsName;
    private String lastName;
    private int age;
    private String citi;

    public Student(String firsName, String lastName, int age, String citi) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.age = age;
        this.citi = citi;
    }

    public String GetFirstName() {
        return this.firsName;
    }

    public void SetFirstName(String firsName) {
        this.firsName = firstName;
    }

}
