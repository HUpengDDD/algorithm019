class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = m-1,k = n-1;
        int l = m + n -1;
        while(k >=0 && j >=0) {
            if( nums1[j] < nums2[k]) {
                nums1[l] =  nums2[k];
                k--;
                l--;
            }
            else {
                nums1[l] =  nums1[j];
                j--;
                l--;
            }
        }
        System.arraycopy(nums2, 0, nums1, 0, k + 1);
    }
}
