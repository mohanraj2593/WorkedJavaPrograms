public class prg9 {
    public static void main(String[] args) {
        int  arr[]={4,3,7,11,50,1};
        int n=6;
        int x=7;
        int y=10;
        int i;

        if(x<y){
            for(i=0;i<arr.length;i++) {
                if (arr[i]>x&arr[i]<10) {
                    System.out.print(arr[i]+" ");

                }
            }

        }
        else{
            System.out.print("Condition is Mismatch");
        }
    }
}
