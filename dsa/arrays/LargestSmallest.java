// find largest and small value in a array

public class LargestSmallest {
    public static void main(String[] args) {
        int[] arr =  {5,80,4,10,25};
        int large = arr[0];
        int small = arr[0];
        for(int i =0;i<arr.length;i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
            for(int j =0;j<arr.length;j++){
                if (arr[j]<small){
                    small=arr[j];
                }
        }}
        System.out.println("large : "+large);
        System.out.println("small : "+small);
}}
