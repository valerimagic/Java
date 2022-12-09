import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int playar1 = Integer.parseInt(input.nextLine());
        int playar2 = Integer.parseInt(input.nextLine());
        int playar3 = Integer.parseInt(input.nextLine());

        int minutes = 0;
        int sumSecond = playar1+playar2+playar3;

        minutes = sumSecond / 60;

        sumSecond = sumSecond - (minutes * 60);

        if (sumSecond < 10){
            System.out.printf("%d:0%d", minutes, sumSecond);
        }
        else{
            System.out.printf("%d:%d", minutes, sumSecond);
        }
    }
}
