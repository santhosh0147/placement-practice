public class MultipleCatch {
    public static void main(String[] args) {
        try{
            System.out.println("start");
            int arr[] ={50,60,4,4,4};
            int a[] =new int[arr.length];
            a[0]=arr[arr.length+1];
        }
        catch (ArithmeticException x){
            System.out.println("cant devide by zero");
        }
        catch (ArrayIndexOutOfBoundsException Y){
            System.out.println("array index error");
        }
    }
}
