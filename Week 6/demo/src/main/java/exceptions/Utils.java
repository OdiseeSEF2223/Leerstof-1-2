package exceptions;

public class Utils {

    public static int divider(int deeltal, int deler) throws UserDefinedExceptionDivideByZero, SmallerThanOneException {
        if(deler == 0){
            throw new UserDefinedExceptionDivideByZero("message: divide by zero");
        }
        int result = deeltal/deler;
        if(result == 0){
            throw new SmallerThanOneException();
        }
        return deeltal / deler;
    }

    public static void stackoverflow(){
        stackoverflow();
    }
}
