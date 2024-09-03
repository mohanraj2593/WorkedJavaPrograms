import java.lang.reflect.Array;
import java.util.Arrays;

public class prg8Anagramornot
{
    public static void main(String[] args) {
        String a="earth";
        String b="heart";

        int i,j;
      if(a.length()==b.length()){
          char[] c=a.toCharArray();
          char[] d=b.toCharArray();
          for(i=0;i<c.length;i++){
              for(j=0;j<c.length;j++){
                  if(c[i]>c[j]){
                      char temp=c[i];
                      c[i]=c[j];
                      c[j]=temp;

                  }
              }

          }for(i=0;i<c.length;i++){
              System.out.print(c[i]+" ");
          }System.out.println();
          for(i=0;i<d.length;i++){
              for(j=0;j<d.length;j++){
                  if(d[i]>d[j]){
                      char temp=d[i];
                      d[i]=d[j];
                      d[j]=temp;

                  }
              }

          }for(i=0;i<d.length;i++){
              System.out.print(d[i]+" ");
          }System.out.println();
          if(Arrays.equals(c,d)){
              System.out.println("Both Strings are Anagram");

          }
          else {
              System.out.println("Both String Are Not Anagram");

          }

      }

      else{
          System.out.println("Both Strings are not Anagram");
      }

    }
}
