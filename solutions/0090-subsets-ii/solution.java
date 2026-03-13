class Solution {
    public List<List<Integer>>subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
      List<List<Integer>> ans = new ArrayList<>();
       List<Integer> temp = new ArrayList<>();
          subset(nums,temp,0,ans);
         return ans;
 }

    public void subset(int[] nums,List<Integer> temp,int i,List<List<Integer>> ans){

        if (i == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        subset(nums,temp,i+1,ans);

        temp.remove(temp.size()-1);

         int idx = i+1;
        while(idx < nums.length && nums[idx] == nums[i]){
            idx++;
        }

           subset(nums,temp,idx,ans);
        

       
        
      
    }

    }

