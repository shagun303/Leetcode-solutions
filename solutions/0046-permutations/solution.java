class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        getPermutation(0,nums,list);
        return list;

        
    }

    
  

    public static void getPermutation(int idx ,int []nums,List<List<Integer>> list){
        if(idx == nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int num: nums)
            {
                temp.add(num);
            }
            list.add(temp);
            return ;
        }

        for(int i = idx; i < nums.length;i++){
            swap(nums,i,idx);
            getPermutation(idx+1, nums, list);
            swap(nums,i,idx);
            

        }


    }

    public static void swap(int [] nums,int i,int j){

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
    }

