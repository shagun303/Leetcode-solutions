class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        TreeMap <Integer,Integer> map = new TreeMap<>(Comparator.reverseOrder());
        List <Integer> ans = new ArrayList<>();
// `       int n=nums.length;
        int i = 0;
        int j = 0;
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            if(j-i+1==k){
                ans.add(map.firstKey());
                int f=map.get(nums[i]);
                if(f==1){
                    map.remove(nums[i]);
                }else{
                    map.put(nums[i],f-1);
                }
                i++;
            }

            j++;
                
            
        }
        int[] a=new int[ans.size()];
        for(int x=0;x<ans.size();x++){ a[x]=ans.get(x);}
        return a;
    }
}
