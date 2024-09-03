public class Besantaa17EvenorOdd
{
    public static void main(String[] args) {
        int[] arr ={10,11,12,13,14,15};
        int count=0;
        int count1=0;
        int i=0;
        System.out.print("even"+" ");
        for(i=0;i<arr.length;i++) {

            if (arr[i] % 2 == 0) {

                System.out.print(arr[i]+" , ");

                count++;

            }



        }
        System.out.println();
        System.out.print("odd"+" ");
        for(i=0;i<arr.length;i++) {

            if (arr[i] % 2 != 0) {

                System.out.print(arr[i] + " , ");

                count1++;

            }
        }
        System.out.println();
        System.out.println("Length of Array:"+arr.length);
        System.out.println("Even no count:"+count);
        System.out.println("Odd Number Count:"+count1);
    }
}
