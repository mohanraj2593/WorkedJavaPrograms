public class java7
{
    public static void StartEnd(int n)
{
    int i,j,k;
    for(i=1;i<=n;i++)
    {
        for(j=i;j<=n;j++){
            System.out.print("- ");

        }
        for(j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }

}

    public static void main(String[] args) {
        int n=3;
        StartEnd(n);

    }
}
