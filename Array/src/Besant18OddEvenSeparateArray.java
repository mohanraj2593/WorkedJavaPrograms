public class Besant18OddEvenSeparateArray
{
    public static void main(String[] args) {
        int i;
        int index=0;
        int index1=0;
        int[] a={10,11,12,13,14};
        for(i=0;i<a.length;i++){
            if(a[i]%2==0)
            {
                index+=1;
            }
            else{
                index1+=1;
            }

        }
        System.out.println(index);
        System.out.println(index1);
       int[] even=new int[index];
       int[] odd=new int[index1];
       int c=0;
       int d=0;
       for(i=0;i<a.length;i++)
       {
           if(a[i]%2==0)
           {
               even[c]=a[i];
               c++;

           }
           else{
               odd[d]=a[i];
               d++;
           }

       }
       for(i=0;i<even.length;i++) {
           System.out.print(even[i]+" ");
       }
        System.out.println();
       for(i=0;i<odd.length;i++){
           System.out.print(odd[i]+" ");

       }


    }
}
