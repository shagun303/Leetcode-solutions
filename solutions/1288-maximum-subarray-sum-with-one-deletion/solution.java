class Solution {
    public int maximumSum(int[] arr) {

        int nodelete = arr[0];
        int onedelete = Integer.MIN_VALUE;

        int res = arr[0];

        for(int i = 1;i < arr.length;i++){
            int prenodelete = nodelete;
            int preonedelete = onedelete;

            nodelete = Math.max(nodelete + arr[i] ,arr[i]);
             int v2;

             if(preonedelete == Integer.MIN_VALUE){
                 v2 = arr[i];
             }
             else {
                v2 = preonedelete + arr[i];
             }

             onedelete = Math.max(v2,prenodelete);
             res = Math.max(res,Math.max(nodelete,onedelete));
        }
        return res;
    }
}
