public class prg17sumofoddandeven {
    public static void main(String[] args) {
        int lower = 1;
        int upper = 11;
        int i;
        int sum = 0;
        int sum1 = 0;
        int arr[] = new int[upper];
        for (i = lower; i < upper; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }

        for (i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];

            } else {
                sum1 = sum1 + arr[i];
            }
        }
            System.out.println();
            System.out.println("Even Sum:" + sum);
            System.out.println("Odd Sum:" + sum1);

    }
}
