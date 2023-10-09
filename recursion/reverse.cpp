//reverse of an vector using palindrome

void reverse(int i, int n, std::vector<int> &nums) {
    if (i >= n / 2) {
        return;
    }
    
    std::swap(nums[i], nums[n - i - 1]);
    reverse(i + 1, n, nums);
}

vector<int> reverseArray(int n, std::vector<int> &nums) {
    reverse(0, n, nums);
    return nums;
}