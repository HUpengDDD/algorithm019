class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0 ;
        int len =1;
        for(int i = 1; i<nums.length;i++){
            if(nums[len-1]!=nums[i]){
                nums[len]= nums[i];
                len++;
            }
        }
        return len;
    }
}


/* 第二次
if(nums.length == 0){
            return   0;//空数组，返回0
        }
       int outnum=nums[0];
       int len=1;
        for(int i=1;i<nums.length;i++){
            if(outnum !=nums[i]){
                nums[len]=nums[i];
                outnum = nums[i];
                len++;
            }
        }
        return len;
*/
/* 第一次
 if (nums.length == 0) return 0 ;
       int len =1;
       for(int i = 1; i<nums.length;i++){
           if(nums[len-1]!=nums[i]){
               nums[len]= nums[i];
               len++;
           }
       }
        return len;
*/