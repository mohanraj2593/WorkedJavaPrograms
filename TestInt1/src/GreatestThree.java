public class GreatestThree
{
    public static void main(String[] args) {
        int n1=10;
        int n2=3;
        int n3=5;
        if(n1>=n2 && n3>=n2){
            System.out.println(String.format("n1 is greatest number %d",n1));

        }
        if(n2>=n1 && n2>=n3)
        {
            System.out.println(String.format("n2 is greatest number %d",n2));
        }
        if(n3>=n1 && n3>=n2){
            System.out.println(String.format("n3 is Greatestnumber %d",n3));

        }
    }
}
