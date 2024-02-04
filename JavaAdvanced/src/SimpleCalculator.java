import java.util.*;
//package com.softuni;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Scanner;



import static jdk.internal.org.jline.utils.Colors.s;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<String> numbers = new ArrayDeque<>();
        Collections.addAll(numbers, input);

        while (numbers.size()>1){
            int firstNumber = Integer.parseInt(numbers.pop());
            String operator = numbers.pop();
            int secondNumber = Integer.parseInt(numbers.pop());

            int result = 0;
            if(operator.equals("+")){
                result = firstNumber + secondNumber;
            }
            else {
                result = firstNumber - secondNumber;
            }

            numbers.push(String.valueOf(result));

        }

        System.out.println(numbers.peek());


    }
}
