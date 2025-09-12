class Solution {
    public String longestCommonPrefix(String[] strs) {

        String str ="";
        int min = strs[0].length();

        for(int i = 1;i < strs.length;i++){
            min = Math.min(min,strs[i].length());
        }
     
      
      for (int j = 0; j < min; j++){
      char ch = strs[0].charAt(j);
         for(int i= 0 ; i < strs.length; i++){
           
            if(strs[i].charAt(j) != ch)
            {
            return str;
            }
           }
             str= str+ch ;
           

        
        }
        return str;
    }
}


