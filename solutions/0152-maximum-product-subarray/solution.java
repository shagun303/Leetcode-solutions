class Solution {
    public int maxProduct(int[] nums) {

        int minEnding = nums[0];
        int maxEnding = nums[0];
        int res = nums[0];

        for(int i = 1;i < nums.length;i++){
            int v1 = minEnding * nums[i];
            int v2 = maxEnding * nums[i];
            int v3 = nums[i];

            minEnding = Math.min(v1,Math.min(v2,v3));
            maxEnding = Math.max(v1,Math.max(v2,v3));

            res = Math.max(res,Math.max(  maxEnding,  minEnding));
        }
        return res;
        
    }
}
