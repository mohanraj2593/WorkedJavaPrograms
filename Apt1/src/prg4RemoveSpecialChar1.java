public class prg4RemoveSpecialChar1
{
    public static void main(String[] args) {
        String arr="Moahanraj abc";
        System.out.println("Before Removing Special Character:"+arr);
        String s=" ";
        int i;
        for(i=0;i<arr.length();i++){
            if(arr.charAt(i)>64&& arr.charAt(i)<=122){
                s=s+arr.charAt(i);

            }

        }
        System.out.println("After Removing Special Character "+s+" ");
    }
}
