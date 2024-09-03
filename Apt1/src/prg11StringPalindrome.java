public class prg11StringPalindrome
{
    public static void main(String[] args) {
        String a="1214";
        int i;
        int left=0;
        int temp=0;
        int right=a.length()-1;
        for(i=0;i<a.length()/2;i++) {
            if(a.charAt(left)!=a.charAt(right)){
                temp=1;
                break;

            }
            left=left+1;
            right=right-1;
        }
        if(temp==0){
            System.out.println("Given String is Palindrome");

        }
        else{
            System.out.println("Given String is Not A Palindrom");
        }

    }
}
//int i;
//        for(i=0;i<a.length();i++){
//b=a.charAt(i)+b;
//
//        }
//                System.out.println(b);
//        if(a.equals(b)){
//        System.out.println(b+" Given String is Palindrom");
//
//        }
//                else{
//                System.out.println(b+" Given String is Not a Palindrome");
//        }
