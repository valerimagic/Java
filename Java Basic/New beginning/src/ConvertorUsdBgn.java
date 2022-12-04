import java.util.Scanner;

public class ConvertorUsdBgn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double usd = 1.79549;
        double bgn = Double.parseDouble(scan.nextLine());

        System.out.println(bgn*usd);
    }
}
