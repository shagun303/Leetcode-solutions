class Solution {
    public int removeDuplicates(int[] nums) {
     HashMap <Integer,Integer> fre = new HashMap<>();

      int index = 0;
        for(int arr:nums){
      fre.put(arr,fre.getOrDefault(arr,0)+1);

      if(fre.get(arr) <= 2){
        nums[index] = arr;
        index++;
      }

        }
        
        
      
        return index;
    }
}
