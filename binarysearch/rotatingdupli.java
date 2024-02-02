// package binarysearch;

// public class rotatingdupli {
//     public static void main(String[] args) {
//         int[] arr = { 4, 5, 6, 7, 2, 1, 0 };
//         System.out.println(search(arr, 0));
//     }

//     static int search(int[] arr, int target) {
//         int pivot = findpivotwithduplicate(arr);

//         // if pivot id not found just do normal binary search
//         if (pivot == -1) {
//             return binary(arr, target, 0, arr.length - 1);
//         }
//         if (arr[pivot] == target) {
//             return pivot;
//         }
//         if (target >= arr[0]) {
//             return binary(arr, target, 0, pivot - 1);
//         }

//         return binary(arr, target, pivot + 1, arr.length - 1);

//     }

//     static int findpivotwithduplicate(int[] arr) {
//         int start = 0;
//         int end = arr.length - 1;
//         while (start < end) {
//             int mid = start + (end - start) / 2;
//             // 4 cases
//             if (mid < end && arr[mid] > arr[mid + 1]) {
//                 return mid;
//             }
//             if (mid > start && arr[mid] < arr[mid - 1]) {
//                 return mid - 1;
//             }
//             if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
//                 if (arr[start] > arr[start + 1]) {
//                     return start;
//                 }
//                 start++;
//                 if (arr[end] < arr[end - 1]) {
//                     return end - 1;
//                 }
//                 end--;
//             }
//             else if(arr[start]<arr[mid] || (arr[mid]==arr[start] && )

//         }
//         return -1;
//     }

//     static int binary(int[] arr, int target, int start, int end) {

//         while (start < end) {
//             int mid = ((start + end) / 2) + 1;
//             if (target < arr[mid]) {
//                 end = mid - 1;
//             } else if (target > arr[mid]) {
//                 start = mid + 1;
//             } else {
//                 return mid;
//             }
//         }
//         return -1;

//     }
// }
