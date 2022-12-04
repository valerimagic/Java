import java.util.Scanner;

public class CalcDeposits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double depositSum = Double.parseDouble(input.nextLine());
        int months = Integer.parseInt(input.nextLine());
        double interest = Double.parseDouble(input.nextLine());

        double currentInterest = depositSum * (interest / 100);
        double interstPerMonth = currentInterest / 12;
        double sum = depositSum + (months * interstPerMonth);

        System.out.println(sum);

    }
}
