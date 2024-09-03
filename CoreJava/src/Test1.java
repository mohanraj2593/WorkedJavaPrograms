public class Test1{
    public static void main(String args[])
    {
        int i,j;
        int n=5;
        int num1=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++)
            {
                System.out.print(num1+"");
                num1=num1+1;
            }
            System.out.println();
        }

    }
}