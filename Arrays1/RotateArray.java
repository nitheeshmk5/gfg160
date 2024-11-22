package Arrays1;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d = 0;
        int n = arr.length;

        d = d % n;

        reverse(arr,0, d - 1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[] arr,int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
