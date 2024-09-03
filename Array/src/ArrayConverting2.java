public class ArrayConverting2
{
    public static void main(String[] args) {
        String a="Mohan";
        char k[] = a.toCharArray();
        //only char is printing without forloop
        System.out.println(k);

//other method
        for(int i=0;i<k.length;i++) {
            System.out.print(k[i]+" ");
        }
        System.out.println();
        System.out.println("character k array is:"+k.length);
        System.out.println("String a length is:"+a.length());
        //other method


        for(char j:k){
            System.out.println(j);
        }

        }

    }

