public class Besanth17SecondLarge
{
    public static void main(String[] args) {
int[] b={5,4,2,1,3};
int i;
int max=0;
int Sec=0;
for(i=0;i<b.length;i++)
{
    if(max<b[i])
    {
        Sec=max;
        max=b[i];
    }
    else if(Sec<b[i] && max>b[i] ){
        Sec=b[i];

    }
}
System.out.println(max);
System.out.println(Sec);

    }
}
