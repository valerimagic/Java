package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scaner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int wagonCapacity = Integer.parseInt(scaner.nextLine());
        String command = scaner.nextLine();

        while (!command.equals("end")){
            String[] currentCommand = command.split(" ");
            if(currentCommand[0].equals("Add")){
                int addNewWagonWithPassengers = Integer.parseInt(currentCommand[1]);
                train.add(addNewWagonWithPassengers);
            } else {
                int addNewWagonWithPassengers = Integer.parseInt(command);
                for (int i = 0; i < train.size(); i++) {
                    if(addNewWagonWithPassengers + train.get(i) <= wagonCapacity){
                        //train.set(train.get(i), addNewWagonWithPassengers + train.get(i));


                    }

                }
            }
            command = scaner.nextLine();

        }


    }
}
