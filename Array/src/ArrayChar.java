public class ArrayChar
{
    public static void main(String[] args) {
        char arr[]={'a','b','c'};
        //Only character rray printing without forloop
        System.out.println(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        for(char j:arr)
        {
            System.out.print(j+" ");

        }
        //for Each Method Char to Integer
        System.out.println();
        for(int k:arr){
            System.out.print(k+" ");

        }

    }
}
