public class Besant18Frequency18 {

    public static void main(String[] args) {
        int[] arr={10,20,30,10,40, 20,50};
        int[] fr=new int[arr.length];
        int visited=-1;
        for(int i=0;i<arr.length;i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    fr[j] = visited;

                }
            }
                if (fr[i] != visited) {
                    fr[i]=count;
                }

        }
        for(int i=0;i<fr.length;i++){
           if(fr[i]!=visited) {
               System.out.println(arr[i] + "=" + fr[i]);

           }

        }

    }
}