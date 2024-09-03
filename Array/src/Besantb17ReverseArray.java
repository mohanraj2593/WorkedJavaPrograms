public class Besantb17ReverseArray {
    public static void main(String args[])
    {
//6.Reverse Order Using with Other Array variable
int[] arr ={1,2,3,4,5};
int[] b=new int[5];
int i;
int count=0;
int temp=0;
int j=arr.length-1;
for(i=0;i<arr.length/2;i++) {
    temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    j--;
}
for(i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}







    }
}