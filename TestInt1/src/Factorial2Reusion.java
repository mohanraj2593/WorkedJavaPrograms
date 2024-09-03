public class Factorial2Reusion {
   static long fact(long num){
       if(num==0)
       {
           return 1;
       }
       else{
           return (num*fact(num-1));
       }
   }




    public static void main(String[] args) {
        long num=5;
        System.out.println(fact(num));
    }
}
