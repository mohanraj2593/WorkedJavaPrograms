public class JArraySecLarge {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int i;
        int max=arr[0];
        int secMax=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];

            }
            else if(secMax<arr[i]){
                secMax=arr[i];


            }

        }
        System.out.println(max);
        System.out.println(secMax);
    }
}
