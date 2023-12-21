class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans=new ArrayList<>();
        int start=0;
        int end=arr.length-1;
        while(end-start>=k){
           if (Math.abs(arr[start] - x) > Math.abs(arr[end] - x)) {
                start++;
            } else {
                end--;
            }
        }
        for(int i=start;i<=end;i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}