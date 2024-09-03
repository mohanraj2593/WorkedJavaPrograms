public class Besant17MidAdding {
    public static void main(String[] args) {
        //insert Mid Element
        int car[] = {10, 20, 25, 11, 45, 50};
        int Data[] = new int[car.length + 1];
        int value = 99;
        int index = 2;
        for (int i = car.length - 1; i >= index; i--) {
            Data[i + 1] = car[i];
        }
        for (int i = 0; i < index; i++) {
            Data[i] = car[i];

        }
        Data[index] = value;
        for (int i = 0; i < Data.length; i++) {
            System.out.print(Data[i] + " ");
        }
// Other Method-insert Mid Element
//            int i;
//            int j = 0;
//            int index = 4;
//            int arr[] = {10, 20, 30, 40, 50};
//            int brr[] = new int[arr.length + 1];
//            for (i = 0; i < brr.length; i++) {
//                if (i == index) {
//                    brr[i] = 6;
//                } else {
//                    brr[i] = arr[j];
//                    j++;
//                }
//
//            }
//            for (i = 0; i < brr.length; i++) {
//                System.out.print(brr[i] + " ");
//
//            }
        }
    }


