class Solution2 {
    public int removeDuplicates(int[] nums) {

        int length = nums.length;

        for (int i = 1, j = 1; j < nums.length; j++) {
            if (nums[i - 1] < nums[i]) {
                i++;
            } else if (nums[i - 1] == nums[j]) {
                length--;
            } else {
                nums[i] = nums[i] ^ nums[j];
                nums[j] = nums[i] ^ nums[j];
                nums[i] = nums[i] ^ nums[j];
                i++;
            }
        }

        return length;
    }
}
