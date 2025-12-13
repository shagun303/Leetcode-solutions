class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int [] arr = new int[m+n];
        for(int i = 0;i<n;i++){
            arr[i] = nums1[i];
        }
        for(int i = 0;i < m;i++){
            arr[n+i] = nums2[i];
        }

         for(int i = 0;i<m+n-1;i++){
            for(int j = 0;j<m+n-1;j++){
            if(arr[j]> arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
         }}
      double median = 0;
      if(arr.length%2 != 0){
        median = arr[arr.length/2];
      } 
      else{
        median = (arr[arr.length/2 -1] + arr[arr.length/2])/2.0;
      }  

     return median;   
    }
}
