import java.util.Scanner;

public class ConverterRadToGrad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double radian = Double.parseDouble(scan.nextLine());
        double grad = (radian * 180) / Math.PI;

        System.out.println(grad);
    }
}
