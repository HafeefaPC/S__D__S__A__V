//non-duplicate number will be print Input: nums = [4,1,2,1,2]
// Output: 4
//XOR operation is using to solve 

package problems;

public class notduplicate {

    public int singleNumber(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a = a ^ nums[i];
        }
        return a;
    }

}
