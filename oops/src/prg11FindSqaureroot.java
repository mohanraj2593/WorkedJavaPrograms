public class prg11FindSqaureroot
{
    public static void main(String[] args) {
        int num=5;
        double t;
        double sqrt=num/2;
        do{
            t=sqrt;
            sqrt=(t+(num/t))/2;
        }
        while ((t-sqrt)!=0);
        System.out.println(sqrt);
    }
}
