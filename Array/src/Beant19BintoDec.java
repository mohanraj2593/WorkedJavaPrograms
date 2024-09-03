public class Beant19BintoDec {
    public static void main(String[] args) {
        long n=1010;
        int decimal=0;
        int i=0;
        while(n!=0){
            long rem=n%10;
            decimal=decimal+(int)(rem*Math.pow(2,i));
            n=n/10;
            i++;
        }
        System.out.println(decimal);
    }
}
