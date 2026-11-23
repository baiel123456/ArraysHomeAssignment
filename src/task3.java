import java.util.Arrays;
import java.util.Scanner;

class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(n));
        System.out.println();
        System.out.print("What index should we remove?: ");
        int remove = sc.nextInt();

        for (int i = remove; i < n.length - 1; i++) {
            n[i] = n[i + 1];

        }
        System.out.println("Updated array: " );
        for(int i =0; i < n.length-1; i++) {
            System.out.print(n[i] + " ");
        }

    }}