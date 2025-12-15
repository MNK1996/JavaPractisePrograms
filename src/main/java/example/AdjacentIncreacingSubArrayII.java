package example;

import java.util.List;

public class AdjacentIncreacingSubArrayII {
    public static void main(String[] args) {
        System.out.println(maxIncreasingSubarrays(List.of(1,2,3,4,4,4,4,5,6)));
        System.out.println(maxIncreasingSubarrays(List.of(2,5,7,8,9,2,3,4,1,5,4)));

    }

    public static int maxIncreasingSubarrays(List<Integer> nums) {
        int pre = 0, suff = 1, ans = 0;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > nums.get(i-1)){
                suff++;
            }
            else {
                pre = suff;
                suff = 1;
            }
            ans = Math.max(ans, Math.max(suff / 2, Math.min(pre, suff)));
        }
        return ans;


    }

}