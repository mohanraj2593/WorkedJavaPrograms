public class prg14FirstNonrepeatChar
{
    public static void main(String[] args) {
        String a="window";
        int i,j;
        for(i=0;i<a.length();i++){
            char b=a.charAt(i);
            boolean repeat=false;
            for(j=i+1;j<a.length();j++){
                if(b==a.charAt(j)){
                    repeat=true;
                    break;
                }

            }
            if(repeat==false){
                System.out.println(b+" Not repeated");
                break;
            }


        }

    }
}
