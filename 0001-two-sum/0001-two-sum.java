class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if((nums[i]+nums[j]==target)&&(i!=j)){
                    int[] arr = {i,j};
                    return arr;
                }
            }
        }
       return null;  
    }
}