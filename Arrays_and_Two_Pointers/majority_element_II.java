import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> result = new ArrayList<>();
        
        if(nums.length==1){
            result.add(nums[0]);
            return result;
        }
        if(nums.length==2){
            result.add(nums[0]);
            if(nums[1]!=nums[0]){
                result.add(nums[1]);
            }
            return result;
        }
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int num : hm.keySet()){
            if(hm.get(num)>nums.length/3){
                result.add(num);
            }
        }
        return result;
    }
}