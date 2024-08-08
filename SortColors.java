//Time Complexity: O(n)
//Spac Complexity: O(1)
import java.util.Arrays;

public class SortColors {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0) return;
        int n = nums.length;
        int left=0;
        int mid=0;
        int right=n-1;
        while(mid<=right){
            if(nums[mid]==0){
                swap(nums, mid, left);
                left++;
                mid++;
            } else if(nums[mid]==2){
                swap(nums, mid,right);
                right--;
            } else{
                mid++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public void swap(int[] nums, int i, int j){
        if(i!=j){
            nums[i] = nums[i] + nums[j];
            nums[j] = nums[i] - nums[j];
            nums[i] = nums[i] - nums[j];
        }
    }
}
