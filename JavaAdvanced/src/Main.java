import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        List<Car> carCollection = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            String[] cars = scanner.nextLine().split("\\s+");
            String brand = cars[0];
            String model = cars[1];
            int horsePower = Integer.parseInt(cars[2]);

            Car car = new Car(brand, model, horsePower);

            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(horsePower);

            carCollection.add(car);
        }

       carCollection.forEach(item -> System.out.printf("The car is: %s %s - %d HP.%n", item.getBrand(), item.getModel(), item.getHorsePower()));



        //System.out.println(String.format("The car is: %S %s - %d HP", car.getBrand(), car.getModel(), car.getHorsePower()));
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

        //for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            //System.out.println("i = " + i);
        }
    }
