import java.util.*;
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int [] a = new int[nums.length];

        int left = 1;
        for(int i =0;i<nums.length;i++){
            a[i] = left;
            left *=nums[i];
        }

        int right = 1;
        for(int i =nums.length-1;i>=0;i--){
            a[i]*=right;
            right*=nums[i];
        }
        System.out.println(Arrays.toString(a));
    }
}
