package binarysearch;

public class Basic {
public static void main(String[] args) {
   int[] arr ={10,13,18,25,40,99,100,115,225,275,284,400} ;
   int target=25;
   System.out.println(binary(arr, target));
}
static int binary(int[] arr,int target){
    int s=0;
    int e=arr.length-1;
    while(s<=e){
        int mid=(s+e)/2;
        if(target<arr[mid]){
            e=mid;
        }
        else if(target>arr[mid]){
            s=mid+1;
        }
        else{
            return mid;
        }
    }
    return -1;
}
}
