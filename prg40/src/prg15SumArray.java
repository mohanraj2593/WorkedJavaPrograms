public class prg15SumArray
{
    public static void main(String[] args) {
        int[] arr={10,11,12,13,14};
        int i;
        int count=0;
        int sum=0;
        for(i=0;i<arr.length;i++){
            sum=sum+arr[i];
            count=count+1;

        }
        System.out.println("Sum:"+sum);
        System.out.println("Avg:"+sum/count);


    }
}
