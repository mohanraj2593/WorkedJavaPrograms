public class prg14FinPrime {
    public static void main(String[] args) {
        int n=12;
        int i;
        int count=0;
        for(i=2;i<n;i++){
            if(n%i==0){
                System.out.println(n+" Not a Prime");
                count=count+1;
                break;
            }
        }
        if(count==0){
            System.out.println(n+" Prime");


        }
        else{
            System.out.println(n+" Not a Prime");

        }
    }
}
