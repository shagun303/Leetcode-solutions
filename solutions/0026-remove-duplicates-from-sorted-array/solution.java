class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        // int[] freq = new int [101];
        // for(int i = 0;i < nums.length; i++){
        //     int fCount = nums[i];
        //     freq[fCount] +=1;
        // }
        // for(int i = 0;i < nums.length;i++){
        //     if(freq[i] >=1){
        //         nums[k++] = nums[i];
        //         continue;
              
        //     }
          
        // }
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j-1]){
                nums[j]=nums[i];
                j++;
            }
        }
      return j;
    }
}
