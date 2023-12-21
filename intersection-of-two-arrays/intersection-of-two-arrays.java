class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         ArrayList<Integer> alist=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && !alist.contains(nums1[i])){
                    alist.add(nums2[j]);
                }
            }
        }
        int[] arr=new int[alist.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=alist.get(i);
        }

        return arr;
    }
}