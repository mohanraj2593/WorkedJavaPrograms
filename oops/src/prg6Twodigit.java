public class prg6Twodigit {
    static int digit(int n){
        int t=n;
        int count=0;
        while(t>0){
            t=t/10;
            count=count+1;


        }
        return count;


    }
    public static void main(String[] args) {
       int b=digit(111);
       boolean a=false;
       if (b==2){
           a=true;

        }
        System.out.println(a);


    }
}
