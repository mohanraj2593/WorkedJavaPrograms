public class prg8Choco {
    public static void main(String[] args) {
        int choco_in_hand=2;
        int cover_in_hand=choco_in_hand;
        int remaining_cover=cover_in_hand%3;
        int total_cover=choco_in_hand;
        while(cover_in_hand>2){
            choco_in_hand=cover_in_hand/3;
            cover_in_hand=choco_in_hand+remaining_cover;
            remaining_cover=cover_in_hand%3;
            total_cover=total_cover+choco_in_hand;
        }
        System.out.println(total_cover);
    }
}
