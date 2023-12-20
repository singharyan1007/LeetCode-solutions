class Solution {
    public int findMin(int[] nums) {
        // first find the pivot 
        int s=0;
        int e=nums.length-1;
        if(nums.length==1){
            return nums[0];
        }
        if(nums[s]<nums[e]){
          return nums[s];
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid<e && nums[mid]>nums[mid+1]){
                //descending part of the array
                return nums[mid+1];
            }else if(s<mid && nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            if(nums[s]>nums[mid]){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        
        return Integer.MAX_VALUE;
    }
    
    
   
}