import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
    for(int i = 0;i<nums.length;i++){
        hs.add(nums[i]);
    }
    int mx = 0;
    int length = 1;
    for(int num : hs){
        if(!hs.contains(num-1)){
            int curr = num;
            length=1;
            while(hs.contains(curr+1)){
                curr++;
                length++;
            }
            if(mx<length){
                mx = length;
            }
        }
    }
    return mx;
    }
}