import java.util.*;
class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j = nums.length-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            int temp = nums[i];
            nums[i]= nums[j];
            nums[j] = temp;
        }

        int p1 = i+1 , p2 = nums.length-1;
        while(p1<p2){
            int temp = nums[p2];
            nums[p2] = nums[p1];
            nums[p1] = temp;
            p1++;
            p2--;
        }

    }
}