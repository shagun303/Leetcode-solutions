class Solution {
    public int missingNumber(int[] nums) {

        int sum = 0;
        int csum = 0;
        for(int i = 0 ;i < nums.length;i++){
            csum += nums[i];
        }

        for(int i = 0;i <= nums.length;i++){
            sum += i;
        }

        int res = sum - csum;
        return res;
    }
}
