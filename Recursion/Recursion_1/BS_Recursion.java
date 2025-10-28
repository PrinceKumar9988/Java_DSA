package Recursion.Recursion_1;

public class BS_Recursion {
    public static void main(String[] args) {

        int[] arr={2,4,6,8,10,12,14,16,18};
        int target=5;
        int start=0;
        int end=arr.length-1;
        System.out.println(b_search(arr,target,start,end));
    }

    static int b_search(int[] arr,int target, int start, int end){
        if(start>end){
            return -1;
        }

        int mid=start+(end-start)/2;

        if(arr[mid]==target){
            return mid;
        }


        if(arr[mid]>target){
            return b_search(arr,target,start,mid-1);
        }

//        if(arr[mid]<target){
//            return b_search(arr,target,mid+1,end);
//        }

        // OR

        return b_search(arr,target,mid+1,end);



    }
}
