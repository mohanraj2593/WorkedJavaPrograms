import java.util.Scanner;
public class LargeNumVar {
    //Find Largest number in Variable for Loop
    public static void main(String[] args)
    {
        int i,n;
        int g=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            int temp;

            System.out.println("Enter the Number");
           temp=sc.nextInt();
           if(temp>g)
           {
               g=temp;
           }
           else{
               g=g;
           }

        }

        System.out.println(g);
    }




}
