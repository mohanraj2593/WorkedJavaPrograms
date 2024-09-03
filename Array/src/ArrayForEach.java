public class ArrayForEach
{
    public static void main(String[] args) {
        //charater Array is single Quote only use
        int[] num= {97,2,3,4,5};
        //Convert int to Char DataType
        System.out.println((char)num[0]);
        String num1[]={"Apple","Banana","car"};
        //for each method
        for(int i:num){
            System.out.print(i+" ");

        }
        System.out.println();
        for(String j:num1){

            System.out.print(j+" ");
        }





    }
}
