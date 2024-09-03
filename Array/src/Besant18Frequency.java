public class Besant18Frequency {
    public static void main(String args[]) {
        int[] arr = {10, 20, 30, 40, 50, 10, 20, 30, 40, 50, 10, 20, 30, 80};
        int[] fre = new int[arr.length];
        int i;


        int visited = -1;
        for(i=0;i<arr.length;i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] == arr[i]) {
                    count = count + 1;
                    arr[j] = visited;
                }
            }


            if (fre[i] != visited) {
                fre[i] = count;
            }


        }



        System.out.print("------------------");
        System.out.print("Element | Frequency");
        System.out.print("------------------");
        for (i = 0; i < fre.length; i++) {
            if (arr[i] != visited) {
                System.out.println(" " + arr[i] + " | " + fre[i]);
            }
        }
    }
}





