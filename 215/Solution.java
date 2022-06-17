public class Solution {

    public int findKthLargest(int[] nums, int k) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[j - 1] < nums[j]) {
                    nums[j - 1] = nums[j - 1] ^ nums[j];
                    nums[j] = nums[j - 1] ^ nums[j];
                    nums[j - 1] = nums[j - 1] ^ nums[j];
                }
            }
        }

        return nums[k - 1];
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        Solution solution = new Solution();
        int largest = solution.findKthLargest(nums, k);
        System.out.println("largest:" + largest);
    }

}
