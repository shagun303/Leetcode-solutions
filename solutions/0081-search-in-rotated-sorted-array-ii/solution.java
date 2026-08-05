class Solution {
    public boolean search(int[] nums, int target) {

      boolean idx = false;
   for(int i = 0; i < nums.length; i++){
    if(nums[i] == target){
        idx = true;

    }
   }
   return idx;
}
}
