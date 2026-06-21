class Solution {
    public int maxAbsoluteSum(int[] nums) {
  int mnsum = nums[0];
        int mxsum = nums[0];
        int bestendingmax = nums[0];
        int bestendingmin = nums[0];
        int res1 = nums[0];
         int res2 = nums[0];

         int ans = Math.abs(nums[0]);

        for(int i = 1;i < nums.length;i++){

            bestendingmax = Math.max(bestendingmax + nums[i],nums[i]);
               mxsum = bestendingmax;
            res1 = Math.max(res1,mxsum);
            int absmax = Math.abs(res1);


             bestendingmin = Math.min(bestendingmin + nums[i],nums[i]);
             mnsum = bestendingmin;
            res2 = Math.min(res2,mnsum);
                 int absmin = Math.abs(res2);

                 ans = Math.max(ans,Math.max(absmax,absmin));
        }
        return ans;
        
    }
}
