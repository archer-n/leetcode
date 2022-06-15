class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        for (int i = 1; i < length;) {
            if (nums[i - 1] == nums[i]) {
                for (int n = i, m = length - 1; n < m; n++) {
                    nums[n] = nums[n] ^ nums[n + 1];
                    nums[n + 1] = nums[n] ^ nums[n + 1];
                    nums[n] = nums[n] ^ nums[n + 1];
                }
                length--;
            } else {
                i++;
            }
        }
        return length;
    }
}
