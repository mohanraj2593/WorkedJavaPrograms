public class prg2Charcont
{
    public static void main(String[] args) {
//        int arr[]={1,2,3,4,5,1,2,3,4};
        String a="Arunkumar";

        int i;
        int count=0;
        for(i=0;i<a.length();i++){
            char b=a.charAt(i);
            count=count+1;
        }
        System.out.println(count);
    }
}
