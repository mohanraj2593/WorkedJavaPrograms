









public class prg10Sorting {
    public static void main(String[] args) {
        // Sample string array
        String[] words = {"apple", "orange", "banana", "grape", "pineapple"};

        // Sorting the array in ascending order using bubble sort
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (words[j].compareTo(words[j]) > 0) {
                    // Swap words[j] and words[j + 1]
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        // Printing the sorted array
        System.out.println("Sorted array in ascending order:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}


//import java.util.Arrays;
//
//public class prg10Sorting
//{
//    public static void main(String[] args) {
//        String a1[]={"Friends","Enemy","Family"};
//        int i,j;
//        for(i=0;i<a1.length;i++){
//            for(j=i+1;j<a1.length;j++){
//                if(a1[i].compareTo(a1[j])){
//                    String temp=a1[i];
//                    a1[i]=a1[j];
//                    a1[j]=temp;
//
//
//
//
//                }
//
//            }
//        }
//    }
//    }

