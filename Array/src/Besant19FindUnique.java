public class Besant19FindUnique
{
    public static void main(String[] args) {
        int[] num={1,2,3,4,3,2,1};
        int[] brr=new int[num.length];
        int index=0;
        int i;
        for(i=0;i<num.length;i++){
            int temp=0;
            for(int j=0;j<i;j++){
                if(num[i]==num[j]) {
                    temp = 1;
                    break;
                }
            }
            if(temp==0){

                brr[index]=num[i];
                index++;
            }


        }
        for(i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");

        }
    }
}
