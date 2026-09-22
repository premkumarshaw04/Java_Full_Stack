package youtube;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        try {
            int x = 10/0;
        }
        //This should not be the flow to write--------------------------------
//        catch (Exception e){
//            System.err.println(e.getMessage());
//        }
//        catch (ArithmeticException e){
//            System.err.println(e.getMessage());
//        }
        //---------------------------------------------------------------------

        //child class Exception needs to be written first
        catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
