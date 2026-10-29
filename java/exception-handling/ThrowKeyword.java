public class ThrowKeyword {  // throw
    public static void main(String[] args) {
        try{ int age = 15;
            if(age < 18 ){
                throw new ArithmeticException ("fail");
            }
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
}}
