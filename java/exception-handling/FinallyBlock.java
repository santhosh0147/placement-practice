public class FinallyBlock {
    public static void main(String[] args) {
        try {
            System.out.println("started");
            int i = -9/0;
        }
        catch (ArithmeticException X ){
            System.out.println("cant divide by 0");
        }
        finally {
            System.out.println("finished");
        }
    }
}
