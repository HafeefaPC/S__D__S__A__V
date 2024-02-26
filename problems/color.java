package problems;

//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

//We will use the integers 0,1,and 2 to represent the color red,white,and blue,respectively.
public class color {
    void sortColors(int[] nums) {
        int[] counts = new int[3];
        for (int color : nums) {
            counts[color]++;
        }

        int index = 0;

        for (int color = 0; color < counts.length; color++) {
            for (int i = 0; i < counts[color]; i++) {
                nums[index++] = color;
            }
        }
    }
}
