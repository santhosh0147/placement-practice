// ** mini calc

import java.util.Scanner;
public class MiniCalculator {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a number ");
        a = sc.nextInt();
        System.out.println("enter the operator +,-,*,/,%");
        char operator = sc.next().charAt(0);
        System.out.println(" enter another number ");
        b = sc.nextInt();
        switch (operator) {
            case ('+'):
            System.out.println(a + "+" + b + "=" + ((double)a + (double) b)); // 2.5 nu input kudutha error varum ,only mensioned integer , so we need to give doble
            break;
            case ('-'):
            System.out.println(a + "-" + b + "=" + ((double)a -(double) b));
            break;
            case ('*'):
            System.out.println(a + "*" + b + "=" + ((double)a * (double) b));
            break;
            case ('/'):
            System.out.println(a + "/" + b + "=" + ((double)a / (double) b));
            break;
            case ('%'):
            System.out.println(a + "%" + b + "=" + ((double)a % (double) b));
            break;
}}}
