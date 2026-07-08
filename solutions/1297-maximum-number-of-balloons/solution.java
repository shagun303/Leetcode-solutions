class Solution {
    public int maxNumberOfBalloons(String text) {

        String s = "balloon";

        HashMap<Character,Integer> map1 = new HashMap<>();
         HashMap<Character,Integer> map2 = new HashMap<>();

         for(int i = 0;i < s.length();i++){
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
         }

          for(int i = 0;i < text.length();i++){
            map2.put(text.charAt(i),map2.getOrDefault(text.charAt(i),0)+1);
         }

         return maxBalloon(map1,map2);
        
    }

    public int maxBalloon(HashMap<Character,Integer> map1,HashMap<Character,Integer> map2){
        int res = Integer.MAX_VALUE;

        for(Character ch : map1.keySet()){
            if(!map2.containsKey(ch))return 0;
            else{
                res = Math.min(res,map2.get(ch) / map1.get(ch));
              
            }
        }
        return res;
    }
}
