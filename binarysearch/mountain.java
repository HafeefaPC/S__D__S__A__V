package binarysearch;

public class mountain {
    public static void main(String[] args) {
     int[] arr= {1,2,5,18,12,10};
     System.out.println(mount(arr));
    }

    static int mount(int[] arr) {
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
}
