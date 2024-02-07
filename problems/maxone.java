//find the maximum number of ones Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
package problems;

public class maxone {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0, sume = 0, i = 0;
        while (i <= nums.length - 1) {
            if (nums[i] == 1) {
                sum += 1;
                i++;
            } else {
                if (sum > sume) {
                    sume = sum;
                }
                sum = 0;
                i++;
            }

        }
        if (sum > sume) {
            sume = sum;
        }
        return sume;
    }
}
