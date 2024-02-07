//find the missing elelement from the array
// Input: nums = [3,0,1]
// Output: 2
// Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
package problems;

public class missing {
    public int missingNumber(int[] nums) {
        int sum = 0, n = nums.length;
        int s = (n * (n + 1)) / 2;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
        }
        return (s - sum);
    }
}
