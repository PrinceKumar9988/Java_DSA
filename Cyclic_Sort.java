import java.util.Arrays;

public class Cyclic_Sort {

    public static void main(String[] args) {
        // whenever you are given numbers from 1 to N then go for cyclic sort(only from 1 to N)

        int[] arr={4,3,2,7,8,2,3,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr){
        int i=0;

        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if( arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int start,int end){

        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

    }
}
