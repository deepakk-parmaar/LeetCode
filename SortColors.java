class Solution {
    public void sortColors(int[] nums) {
        int count[]= new int[3];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int idx=0;
        int curr =0;
        for(int i : count){
            while(i>0){
                nums[idx++]=curr;
                i--;
            }
            curr++;
        }
    }
}