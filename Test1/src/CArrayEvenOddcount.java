public class CArrayEvenOddcount
{
    public static void main(String[] args) {
        int[] car={10,11,12,13,14};
        int count=0;
        int count1=0;
        for(int i=0;i<car.length;i++){
            if(car[i]%2==0){
                count++;


            }
            else{
                count1++;
            }

        }
        System.out.println("Even Numbers Count:"+count);
        System.out.println("Odd Numbers Count"+count1);
    }

}
