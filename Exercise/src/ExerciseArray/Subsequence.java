package ExerciseArray;

import java.util.Scanner;

public class Subsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var numbers = new int[]{1, 1, 1, 2, 3, 1, 1, 1, 2, 1, 1, 2, 3, 4, 1, 1, 2};

        int longestLength = 0;
        int currentLength = 1;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                currentLength++;
            } else {
                if (currentLength > longestLength) {
                    longestLength = currentLength;
                }
                currentLength = 1;
            }
        }
        System.out.println(longestLength);

        int [] array = new int[] {42};

        incrementIndex(array, 0);
        System.out.println(array[0]);

    }

    int x = getMax(5, 10);
    private string getMax(string i, int i1) {
        
    }

    public static void incrementIndex(int[] array, int index){
        array[index]++;
        array = new int[]{69};
        System.out.println(array[0]);
    }
}
