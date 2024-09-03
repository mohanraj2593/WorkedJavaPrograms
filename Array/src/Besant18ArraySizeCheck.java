public class Besant18ArraySizeCheck
{

    public static void main(String[] args) {
        int i;
        int count=0;
        int count1=0;
        int[] a= {10,20,30,40,50};
        int[] b={10,20,30};
        for(i=0;i<a.length;i++){
            count=count+1;
        }
        for( i=0;i<b.length;i++){
            count1=count1+1;
        }
        System.out.println(count);
        System.out.println(count1);









        //Other Method
        if(a.length==b.length){
            System.out.print(a.length+" = "+b.length);
            System.out.println("Equal");

        }
        else{
            System.out.println(a.length+" = "+b.length);
            System.out.println("Not Equal");
        }
    }
}
