public class ifelseif
{
    public static void main(String[] args) {
        int mark=65;
        if(mark<50){
            System.out.println("mark is less than 50");
        }
        else if(mark>50&&mark<60){
            System.out.println("Mark is between 50-60");

        }
        else if(mark>60&&mark<70){
            System.out.println("mark is Between 60-70");
        }
        else{
            System.out.println("mark is above 70");
        }
    }
}
