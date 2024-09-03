public class DArrayNegativeCount
{
    public static void main(String[] args) {
        int i;
        int count=0;
        int[] arr={-1,-2,3,-4,-5};
        for(i=0;i<arr.length;i++){
            if(arr[i]<0){
                count++;

            }
        }
        System.out.println("Negative Number Count:"+count);
    }
}
