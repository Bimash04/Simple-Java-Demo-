import java.io.PrintStream;

public class TryCatch {
    static int number1 = 10;
    public static void main(String[] args) {
        int number = 0;
        try{ //>--Try the code either it is valid or not 
            int totalNum = number1 / number;
            System.out.println(totalNum);
        }
        catch(Exception e){//>--if not valid, expected error 
            System.out.println("Cannot divide your number because: "+e );
        }//>- program will continue if try and catch is used
        System.out.println("Program continues ");
        /*--program will stop herer--*/
        int error = number1 / number;
        System.out.println("Program does not goes continues " +error);//>-- this will not get executed 
    }
}
class ExceptionClass extends Exception{
    @Override
    public void printStackTrace(PrintStream s) {
        //TODO Auto-generated method stub
        super.printStackTrace(s);
    }
}