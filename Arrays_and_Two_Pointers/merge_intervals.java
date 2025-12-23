import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        for (int i = 0; i <intervals.length - 1; i++) {
            for (int j = i + 1; j <intervals.length; j++) {
                if (intervals[i][0] >intervals[j][0]) {
                    int[] temp =intervals[i];
                   intervals[i] =intervals[j];
                   intervals[j] = temp;
                }
            }
        }
        int[] current = intervals[0];
        List<int[]> arrlist = new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            int[] next = intervals[i];
            if(current[1]>=next[0]){
                if(current[1]<=next[1]){
                    current[1] = next[1];
                }
            }else{
                arrlist.add(current);
                current = next;
            }
        }
        arrlist.add(current);
    return arrlist.toArray(new int[arrlist.size()][]);        
    }
}