import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pagesCurrentBook = Integer.parseInt(input.nextLine());
        int pagesForHour = Integer.parseInt(input.nextLine());
        int days = Integer.parseInt(input.nextLine());

        int tyme = pagesCurrentBook / pagesForHour;
        int hours = tyme / days;

        System.out.println(hours);
    }
}
