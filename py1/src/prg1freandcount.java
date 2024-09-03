public class prg1freandcount
{
    public static void main(String[] args) {
        int[] arr={10, 20, 30, 40, 50, 10, 20, 30, 40, 50, 10, 20, 30, 80};
        int fr[]=new int[arr.length];
        int i,j;
        int visited=-1;
        for(i=0;i<arr.length;i++)
        {
            int count = 1;
            for (j = i + 1; j < arr.length; j++)
            {
                if (arr[i] == arr[j]) {
                    count = count + 1;
                    fr[j] = visited;
                }//if1
            }//j
                if (fr[i] != visited)
                {
                    fr[i] = count;

                }//if2


        }//j
            for(i=0;i<fr.length;i++){
                if(fr[i]!=visited){
                    System.out.println(arr[i]+" = "+fr[i]);

                }

            }
        }
    }

