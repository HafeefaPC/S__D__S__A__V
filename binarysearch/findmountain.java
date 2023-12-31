package binarysearch;

public class findmountain {
    public static void main(String[] args){
    int[] arr= {1,2,5,18,12,10};  
    int target =5;
    int peak = peak(arr);
    int firsttry = binary(arr,target,0,peak);
    if(firsttry!= -1){
        System.out.println(firsttry);
    }
    else{
        System.out.print(binary(arr,target,peak+1,arr.length));
    }
    }
    static int peak(int[] arr ){
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = ((start + end) / 2) + 1;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
    static int binary(int[] arr ,int target,int start,int end ){

        while (start < end) {
            int mid = ((start + end) / 2) + 1;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
        
    }
}
