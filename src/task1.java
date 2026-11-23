import java.util.Arrays;
import java.util.Scanner;

class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr =
            {5, -3, 8, -1, 0, 12, -7, 4, 9, -2};

        int replace=0;
        System.out.println("Original: "+ Arrays.toString(arr)+" ");
        System.out.print("Replaced: ");



        for(int i=0; i<arr.length; i++){

            if(arr[i]<0){
                arr[i]=0;
                replace++;

            }

            System.out.print(arr[i]+" ");




        }
        System.out.println();
        System.out.println("Replacements: "+ replace);




    }}