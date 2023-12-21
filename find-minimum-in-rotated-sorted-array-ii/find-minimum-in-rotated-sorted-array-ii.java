class Solution {
    public int findMin(int[] nums) {
       int start=0;
        int end=nums.length-1;
         if(nums[start]<nums[end]){
                return nums[start];
            }
        while(start<end){
            int mid=start+(end-start)/2;
           
            //condition arises nums[start]==nums[mid]==nums[end]
           
            if(nums[end]>nums[mid]){
                //
                end=mid;
            }else if(nums[mid]>nums[end]){
                start=mid+1;
            }else{
                end--;
            }

        }
        return nums[end];
    }
}