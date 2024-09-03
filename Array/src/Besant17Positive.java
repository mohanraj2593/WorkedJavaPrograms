public class Besant17Positive {
    public static void main(String args[]) {
        int arr[] = {-10, -20, -30, 40, 50};
        int i;
        int count = 0;
        int count1 = 0;
        System.out.print("Even Numbers are:" + " ");
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        System.out.println("Positive Number Count:" + count);
        System.out.println("Negative Number Count" + count1);
        System.out.println();
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}