// exception handling

public class TryCatch {
    public static void main(String[] args) {
        try {
            int a = 100/0;
            System.out.println("divided perfectly");
        }
        catch (ArithmeticException e) {
            System.out.println("can't divided by zero" +
            "\n"+"program continuous");
        }
    }
}
