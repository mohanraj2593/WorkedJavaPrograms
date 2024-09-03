public class prg18Distinctvalues
{
    public static void main(String[] args) {
        int[] arr={1,2,3,5,1,2,3};
        int[] set=new int[arr.length];
        int bed[]=new int[arr.length];
       int setindex=0;
       int bedIndex=0;

        int i,j;


        for(i=0;i<arr.length;i++){
            int temp=0;


            for(j=i+1;j<arr.length;j++) {
                if (arr[i] == arr[j]) {
                    temp = 1;
                    break;
                }
            }
                if(temp==1){
                    set[setindex]=arr[i];
                    setindex++;





                }
                if(temp==0){
                   int t=0;
                   for (j=0;j<set.length;j++)
                   {
                       if(set[j]==arr[i]){
                           t=1;
                           break;

                       }
                   }
                   if(t==0){
                       bed[bedIndex]=arr[i];
                       bedIndex++;

                   }
                }
        }
        for(i=0;i<bedIndex;i++){
            System.out.print(bed[i]+" ");

        }
    }
}
