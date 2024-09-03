public class Besant17EndAdding
{
    public static void main(String[] args) {
//        int n=79;
//        int[] car = {10,20,30,50,65,75,76};
//        int Deer[]=new int[car.length+1];
//        for(int i=0;i<car.length;i++)
//        {
//            Deer[i]=car[i];
//
//        }
//         Deer[Deer.length-1]=n;
//        for(int i=0;i<Deer.length;i++){
//
//            System.out.print(Deer[i]+" ");
//        }


        int n=79;
        int[] car = {10,20,30,50,65,75,76};
        int Deer[]=new int[car.length+1];
        for(int i=0;i<car.length;i++)
        {
            Deer[i]=car[i];

        }
        Deer[car.length]=n;
        for(int i=0;i<Deer.length;i++){

            System.out.print(Deer[i]+" ");
        }


    }
}
