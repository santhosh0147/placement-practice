public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int current = 20;
        for(int i =0;i<a.length;i++){
            if(current == a[i]){
                System.out.println("found at index "+i);
            }
        }
    }
}
