class Solution {
    public void sortColors(int[] nums) {
            int zcount=0 , ocount=0 , tcount=0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                zcount++;
            }else if(nums[i]==1){
                ocount++;
            }else{
                tcount++;
            }
        }
        int i = 0 , j = 0;
        for(i = 0;i<zcount;i++){
            nums[i] = 0;
        }
        for(j = i;j<zcount+ocount;j++){
            nums[j] = 1;
        }
        for(int k = j;k<zcount+ocount+tcount;k++){
            nums[k] = 2;
        }
    }
}