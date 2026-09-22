package youtube;

//Nested Try Catch
public class ExceptionDemo3 {
    public static void main(String[] args) {
        int arr[] = new int[5];

        try{
            System.out.println("I am in First try Block....");
            try{
                arr[6] = 10; //Risky Code
            }catch (Exception e){ //in case u dont know which exception gonna come then use "Exception" Class(Parent Class)
                System.err.println(e.getMessage());
            }
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
