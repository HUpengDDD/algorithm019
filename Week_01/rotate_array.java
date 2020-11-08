class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;//整圈的移动直接不做
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    private void reverse(int [] nums,int start,int end) {
        for (;start < end;) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}


/*暴力求解
class Solution {
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k;i++) {
           one_rote (nums);
        }

    }
    private void one_rote(int [] nums) {
        int data = nums[nums.length-1];
        for (int i = nums.length-1; i > 0;i--) {
            nums[i] = nums[i-1];
        }
        nums[0] = data;
    }
}

*/