public class prg3Vowelspresent {
    public static void main(String[] args) {
        String a="hello world";
        int count=0;
        int temp=0;
        for(int i=0;i<a.length();i++){
            char b=a.charAt(i);
            if(b=='a'|| b=='e'||b=='i'||b=='o'||b=='u'){
                count=count+1;
                temp=1;
                break;


        }

        }
        if(temp>0) {
            System.out.println(temp);
        }
        System.out.println(count);
    }
}
