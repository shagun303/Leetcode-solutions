class Solution {
    public int majorityElement(int[] nums) {
      int majorElement = nums[0];
        int count = 1;
     
        for(int i = 1;i < nums.length;i++){
            if(count == 0){
                majorElement = nums[i];
                count = 1;
            }
            else if(nums[i] == majorElement){
                count ++; 
            }
            else count--;
        }
        return majorElement;    
    }
}
