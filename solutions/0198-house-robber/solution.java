class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr,-1);
       return robber(nums,0,arr);
        
        }
    
    public int robber(int[] nums,int i,int arr[]){
     if(i >= nums.length) return 0;
        if(arr[i] != -1) return arr[i];
        int steal = nums[i] +robber(nums,i+2,arr);
        int skip = robber(nums,i+1,arr);
        return arr[i] = Math.max(steal,skip);



    }
        
    

  
}
