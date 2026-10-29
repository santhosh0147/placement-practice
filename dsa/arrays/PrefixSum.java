// Dsa
import java.util.*;
public class PrefixSum {
    public static void main(String[] args) {

        int[] arr = {10,60,90,70,15};
        int [] a = new int[arr.length];
        int total = 0;
        for(int i =0;i<arr.length;i++) {
            total += arr[i];
            a[i]=total;
        }
        System.out.println(Arrays.toString(a));
    }
}
