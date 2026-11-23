import java.util.Scanner;

 class task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }


        System.out.println();

        int[] duplicates = new int[arr.length];
        int dupCount = 0;

        for (int i = 0; i < arr.length; i++) {

            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }

            if (count > 1) {

                boolean alreadyAdded = false;
                for (int k = 0; k < dupCount; k++) {
                    if (duplicates[k] == arr[i]) {
                        alreadyAdded = true;
                        break;
                    }
                }
                if (!alreadyAdded) {
                    duplicates[dupCount++] = arr[i];
                }
            }
        }

        if (dupCount > 0) {
            System.out.print("Duplicate numbers: ");
            for (int i = 0; i < dupCount; i++) {
                System.out.print(duplicates[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("No duplicates found.");
        }


    }
}