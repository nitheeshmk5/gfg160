package Arrays1;
import java.util.Arrays;
public class MoveZeroEnd {
    static void moveToEnd(int[] arr){
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] != 0){
//                arr[count] = arr[i];
//                count += 1;
//            }
//        }
//        while (count < arr.length){
//            arr[count] = 0;
//            count += 1;
//        }
//        System.out.println(count);
//        System.out.println(Arrays.toString(arr));

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " " );
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,9,9,1,0,2,3,0};
        moveToEnd(arr);
    }
}
