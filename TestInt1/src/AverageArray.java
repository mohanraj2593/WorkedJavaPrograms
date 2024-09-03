public class AverageArray
{
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<num.length;i++){
             sum=sum+num[i];
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        int average=sum/num.length;
        System.out.println(sum);
        System.out.println(String.format("The Array is %d",average));
    }
}
