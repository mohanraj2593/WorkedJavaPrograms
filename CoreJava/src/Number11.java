public class Number11
{
    public static void main(String[] args) {
//        String num="ABCDE";
//        int n=num.length();
//        for(int i=0;i<n;i++){
//            for(int j=i;j<n;j++){
//                System.out.print(num.charAt(j));
//            }
//            System.out.println();
//        }
        //chatGPT Code
//        String input = "ABCDE";
//        int length = input.length();
//
//        for (int i = 0; i < length; i++) {
//            for (int j = i; j < length; j++) {
//                System.out.print(input.charAt(j));
//            }
//            System.out.println();
//        }
        int n = 5; // Number of rows for the pattern
       char startChar = 'A'; // Starting character for the pattern

         //Outer loop for rows
        for (int i = 0; i < n; i++) {
            // Inner loop for printing characters
            for (int j = i; j < n; j++) {
                System.out.print((char) (startChar+j));
            }
            System.out.println(); // Move to the next line after each row
        }
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing characters
            for (int j = i; j <= n; j++) {
                System.out.print((char) (j+64));
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
