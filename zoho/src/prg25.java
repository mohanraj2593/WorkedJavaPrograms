public class prg25 {
    public static void main(String[] args) {
        int arr[] = {2,1,0,-8,-9};
        int i;
        double count=0;
        double count1=0;
        double count3=0;
        double count4=0;
        for(i=0;i<arr.length;i++){
            count4=count4+1;
            if(arr[i]<0){
                count=count+1;
            }
            else if(arr[i]>0){
                count1=count1+1;

            }
            else{
                count3=count3+1;
            }


        }
        System.out.println("Positive:"+count1/count4+" Negative:"+count/count4+" Neutral:"+count3/count4);
    }
}
