import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nylon = 1.50;
        double paint = 14.50;
        double thinner = 5.00;

        int needetNylon = Integer.parseInt(input.nextLine());
        int needetPaint = Integer.parseInt(input.nextLine());
        int needetThiner = Integer.parseInt(input.nextLine());
        int hoursPerWork = Integer.parseInt(input.nextLine());

        double sumNylon = (needetNylon + 2) * nylon;
        double sumPaint = (needetPaint * 1.1) * paint;
        double sumThinner = needetThiner * thinner;
        double sumBag = 0.4;

        double totalSumMaterials = sumNylon + sumPaint + sumThinner + sumBag;
        double totalSumForWorkers = (totalSumMaterials * 0.3) * hoursPerWork;

        double totalSum = totalSumMaterials + totalSumForWorkers;

        System.out.println(totalSum);

    }
}
