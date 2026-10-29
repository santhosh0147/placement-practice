import java.util.*;
public class SumOfDigitsScanner {
    public static void main(String[] args) {
        System.out.println("enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();;
        int sum = 0;
        while (n>0){
            int m = n%10;
            sum+=m;
            n = n/10;
        }
        System.out.println(sum);
    }
}
