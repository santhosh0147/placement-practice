import java.util.*;
public class MinUsingStream {
    public static void main(String[] args) {
        int [] a = {10,20,4,202,9};
        int v = Arrays.stream(a).min().getAsInt();
        System.out.println(v);
    }
}
