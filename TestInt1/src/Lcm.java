public class Lcm
{
    public static void main(String[] args) {
        int max;
        int n1=54;
        int n2=4;
         max=(n1>n2)?n1:n2;
        while(true){
            if(max%n1==0 && max%n2==0)
            {

                System.out.println(max);
                break;
            }
            max++;

        }
    }
}
