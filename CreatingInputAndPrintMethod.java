//package YouTubeLearning;
import java.util.*;
/*-- This classs is made for using in another class to take input from user and also to print the String value typed by user--*/
public class CreatingInputAndPrintMethod  
{
    public int inputNumber()//to takes integer from user
    {
        Scanner object = new Scanner(System.in);
        int number = object.nextInt();
        object.close();
        return number;
    }
    public String inputString()// to take String from user 
    {
        Scanner object = new Scanner(System.in);
        String string = object.nextLine();
        object.close();
        return string;
    }
    public char inputChar()//to take char from user
    {
        Scanner object = new Scanner(System.in);
        char character= object.nextLine().charAt(0);
        object.close();
        return character;
    }
    public void printMethod(String text)// to print string from user 
    {
        System.out.println(text);
    }
}
