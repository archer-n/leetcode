public class Solution2 {

    public int findKthLargest(int[] nums, int k) {
        int d = nums.length - k;

        Integer largest = null;

        int[] tmp;
        if (d > k) {
            while (k > 0) {
                tmp = max(nums, largest);
                largest = tmp[0];
                k -= tmp[1];
            }
        } else {
            while (d >= 0) {
                tmp = min(nums, largest);
                largest = tmp[0];
                d -= tmp[1];
            }
        }
        return largest;
    }

    private int[] max(int[] nums, Integer skip) {
        Integer m = null;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {

            if (skip != null && nums[i] >= skip)
                continue;

            if (m == null) {
                m = nums[i];
                c = 1;
                continue;
            }

            if (m < nums[i]) {
                m = nums[i];
                c = 1;
            } else if (m == nums[i]) {
                c++;
            }
        }

        return new int[] { m, c };
    }

    private int[] min(int[] nums, Integer skip) {
        Integer m = null;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {

            if (skip != null && nums[i] <= skip)
                continue;

            if (m == null) {
                m = nums[i];
                c = 1;
                continue;
            }

            if (m > nums[i]) {
                m = nums[i];
                c = 1;
            } else if (m == nums[i]) {
                c++;
            }
        }

        return new int[] { m, c };
    }

    public static void main(String[] args) {
        int[] nums = { 3 };
        int k = 1;
        Solution2 solution = new Solution2();
        int largest = solution.findKthLargest(nums, k);
        System.out.println("largest:" + largest);
    }

}
