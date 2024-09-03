public class Besant18ArrayValueCheck
{
    public static void main(String[] args) {
        int i;
        int index=0;
        int[] arr={10,20,30,40,18};
        int[] brr={10,20,30,40,50};
        for(i=0;i<arr.length;i++){
            if(arr[i]==brr[i])
            {
                index++;
            }

        }
        if(index==arr.length)
        {
            System.out.println("Equal");
        }
        else{
            System.out.println("not Equal");
        }
    }
}
