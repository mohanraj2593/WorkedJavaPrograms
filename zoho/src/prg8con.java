public class prg8con {
    public static void main(String[] args) {
        int a[]={0,5,6,0,9,1,4};
        //find continuos sum and big
        int i;
        int j=1;
        int sum=0;
        int big=0;
        for(i=0;i<a.length-1;i++){
            sum=a[i]+a[j];
            if(big<sum){
                big=sum;
//                System.out.println(big);
            }
            j=j+1;

        }
        System.out.println(big);
    }
}
