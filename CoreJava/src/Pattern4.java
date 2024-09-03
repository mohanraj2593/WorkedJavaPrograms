public class Pattern4
    //Hallow Square
{
    public static void Hallow(int n){
    int i,j;
    for(i=1;i<=n;i++){
        for(j=1;j<=n;j++){
            if(i==1 || j==1 || i==n || j==n)
            {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }


        }
        System.out.println();
    }

}
    public static void main(String[] args) {
    int n=5;
    Hallow(n);

    }
}
