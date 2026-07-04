class Solution {
    public String removeDuplicates(String s) {
        String res ="";
        Stack<Character> st = new Stack<>();

        for(int i = 0;i < s.length();i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
                continue;

            }
            else if(st.peek() == s.charAt(i)){
                st.pop();
                continue;
            }
            st.push(s.charAt(i));

        }

        while(!st.isEmpty()){
            res+= st.peek();
            st.pop();
        }
        return reverse(res);
        
        
    }
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
