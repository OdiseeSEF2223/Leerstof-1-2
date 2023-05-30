package exceptions;

public class Divider {

    public static void main(String[] args){

        //Utils.stackoverflow();
        try {
            int test = Utils.divider(5, 0);
        } catch (UserDefinedExceptionDivideByZero e) {
            System.out.println(e.getMessage());
        } catch(SmallerThanOneException e){
            System.out.println("Smaller than one");
        }
    }
}
