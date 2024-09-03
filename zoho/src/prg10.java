public class prg10 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
        int gap=3;
        int out_count=3;
        int i,j;
        if(gap<a.length){
            if(out_count<a.length){

                for(j=0;j<out_count;j++) {
                    int sum=0;
                    for (i = j; i < a.length; i = i + gap) {
                        sum = sum + a[i];
                    }
                    System.out.println(sum);
                }



            }

        }
        else{
            System.out.println("Enter the gap value less tham array length");
        }

    }
}
