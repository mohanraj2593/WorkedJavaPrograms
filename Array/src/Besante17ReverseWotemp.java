public class Besante17ReverseWotemp
{
    public static void main(String[] args) {
        int i;
        int[] Rev={10,20,55,65,89};
        int[] Div = new int[Rev.length];
        int count=0;
        for( i=Rev.length-1;i>=0;i--){
            Div[i]=Rev[count];
            count++;

        } for(i=0;i<Div.length;i++){
            System.out.print(Div[i]+" ");

        }




        int[] arr ={1,2,3,4,5};
        int[] b=new int[arr.length];


        for(i=arr.length-1;i>=0;i--)
        {
            b[i]=arr[count];
            count=count+1;
        }
        System.out.println();
        for(i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
























//        System.out.println();
//        for(i=Rev.length-1;i>=0;i--)
//        {
//            System.out.print(Rev[i]+" ");
//            count++;
//        }
//        System.out.println();
//        System.out.println("Count of Reverse Order:"+count);

    }
}
