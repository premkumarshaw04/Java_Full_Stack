package youtube;

//Multiple catch Block
public class ExceptionDemo2a {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try{
            arr[6] = 10/0;
//            arr[6]; //Array Index Out Of Bound Exception
//            10/0 //Arithmetic Exception
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }
    }
}
