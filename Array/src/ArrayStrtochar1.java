public class ArrayStrtochar1
{
    public static void main(String[] args) {
        String a="Apple";
        char r1=a.charAt(0);
        System.out.println(r1);
//                String a[]={"Apple","Banana"};
//        char r=a[0].charAt(1);
//        System.out.println(r);
        String arr[]={"AIMohan","raj"};
        for(int i= 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length();j++){
                char k=arr[i].charAt(j);
                System.out.print((int)k);

            }
            System.out.println();

        }
    }
}
