class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0,j = 0;
        int len =  0;

        HashMap<Character,Integer> map = new HashMap<>();

        while(j < s.length()){
          map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);

          while(map.size() < j-i+1){
             map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);

                if( map.get(s.charAt(i)) == 0){
                    map.remove(s.charAt(i));
                }

                i++;
            }

            if(map.size() == j-i+1){
                len = Math.max(len,j-i+1);
            }

            j++;

        }


      
      
        return len;
    }
}
