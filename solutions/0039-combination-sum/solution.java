class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(0,list,new ArrayList<>(),candidates,target);
        return list;
    }

    public void backtrack(int idx,List<List<Integer>> list,List<Integer> temp,int []candidates,int target){
        if(target == 0){
            list.add(new ArrayList<>(temp));
            return ;
        }
        
       if(target < 0) return;
      
        for(int i = idx;i < candidates.length;i++){
            temp.add(candidates[i]);
            backtrack(i,list,temp,candidates,target - candidates[i]);
            temp.remove(temp.size()-1);


        
       }
    }
}
