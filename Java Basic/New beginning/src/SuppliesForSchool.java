import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pen = Integer.parseInt(scanner.nextLine());
        int marker = Integer.parseInt(scanner.nextLine());
        int preparate = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double sumPen = pen * 5.8;
        double sumMarker = marker * 7.2;
        double sumPreparate = preparate * 1.2;

        double sumBeforDiscount = sumPen + sumMarker + sumPreparate;
        double sumAfterDiscount = sumBeforDiscount - (sumBeforDiscount * (discount / 100.0));

        System.out.println(sumAfterDiscount);
    }
}
