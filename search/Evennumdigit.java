package search;


public class Evennumdigit {
    public static void main(String[] args) {
    int[] nums = {18,24,1,5,7};
    System.out.println(even(nums));
    }

    // static int count(int num) {

    //     int count = 0;
        
    //     while (num > 0 || num < 0) {
             
    //         count++;
    //         num = num / 10;
    //     }

           
            
    //     return count;
    // }

        static int even(int[] arr) {
        //     int even = 0;
        //     for (int num : arr){
        //     if (count(num) % 2 == 0) {
        //         even++;
        //     }   
        // }
        // return even;
         int even=0;
        for(int num : arr){

            int a = (int) Math.log10(num) + 1;
            if(a%2==0){
               even++;
            }
        }
        return even;
    }
}