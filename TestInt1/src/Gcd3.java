public class Gcd3 {
static int gcd(int n1,int n2){
 if(n2==0)
 {
     return n1;
 }
 return gcd(n2,n1%n2);
}




    public static void main(String[] args) {
        int n1=12;
        int n2=30;
        System.out.println(gcd(n1,n2));


    }}
