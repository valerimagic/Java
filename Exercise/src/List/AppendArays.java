package List;

import java.util.*;

public class AppendArays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");

        Queue<String> list = new LinkedList<String>();
        for (int i = input.length - 1; i >= 0; i--) {
            String[] current = input[i].split("\\s+");
            for (int j = 0; j < current.length; j++) {
                if (!current[j].equals("")) {
                    list.offer(current[j]);
                }
            }
        }

        while (list.size() > 0) {
            System.out.print(list.poll() + " ");
        }
    }
}
