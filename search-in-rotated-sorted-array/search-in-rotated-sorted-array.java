class Solution {
    public int search(int[] nums, int target) {
     //find if there is a pivot or not
        int pivot=fPivot(nums);
        if(pivot==-1){
            return search(nums, target, 0, nums.length-1);
        }else if(target>=nums[0]){
            return search(nums, target, 0, pivot);
        }
        return search(nums, target, pivot+1, nums.length-1);
    }

    public int fPivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }else if(start<mid && nums[mid]<nums[mid-1]){
                return mid-1;
            }

            if(nums[start]>nums[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

            return -1;
        }

         int search(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target==arr[mid])
            return mid;
            else if(target<arr[mid]){
                end=mid-1;

            }else if(target>arr[mid])
            start=mid+1;

        }
        return -1;
    
    }
}