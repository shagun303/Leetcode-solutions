class Solution {
    public boolean isPalindrome(int x) {
        String str1 = Integer.toString(x);
        String str2 = "";
        for(int i = str1.length() - 1; i >= 0;i--){
            str2= str2 + str1.charAt(i);
        }

        for(int i = 0 ; i < str1.length(); i++){
            if(str2.charAt(i) != str1.charAt(i)){
                return false;
            }
            
        }  
        return true;

    }
}
