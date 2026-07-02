class Solution {
    public long zeroFilledSubarray(int[] nums) {
       
        long count = 0;
          int currCount = 0;

        for(int i = 0;i < nums.length ;i++){
           
            if(nums[i] == 0){
             currCount +=1;
             count += currCount;
            }
            else {
                currCount = 0;
            }
          
        }
        return count;
    }
}
