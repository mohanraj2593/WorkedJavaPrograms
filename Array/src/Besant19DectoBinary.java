import java.io.*;
public class Besant19DectoBinary
{
    public static void main(String[] args) {
        int n=10;
        int[] num=new int[1000];
        int i=0;

        while(n!=0) {
            num[i]=n%2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
                System.out.print(num[j]);

        }
    }
}
