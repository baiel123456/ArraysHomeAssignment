import java.util.Arrays;
import java.util.Scanner;

class task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr= new int[6];
        boolean found=false;

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        int seclargest=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest=arr[i];
            }

        }
        for (int i=0; i<arr.length; i++){

            if(arr[i]!=largest && (!found || arr[i]>seclargest)){
                seclargest=arr[i];
                found=true;

        }

            }


            if(found){
                System.out.println("Largest: "+ largest);
                System.out.println("Second largest: "+ seclargest);
            }
            else {
                System.out.println("No second largest");

    }}}
