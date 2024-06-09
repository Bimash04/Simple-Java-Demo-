/*--Calculator with Try Catch -- */
import java.util.Scanner;

interface Addition{ //>-- For adding two number
    default int sumNumber(int number1, int number2 )
{
    int sumNumber = number1 + number2; // sumNumber store added value
    return sumNumber;
}
}

interface Subtract{
    default int subNumber(int number1, int number2){
        if(number1 < number2){
            int subNumber = number2 - number1;
            return subNumber;
        }
        else{
            int subNumber = number1-number2;
            return subNumber;
        }
    }
}

interface Divide{
    default void divideNumber(int number1, int number2){
        // while(super.)
        try{
           double divideNumber= number1 / number2;
           System.out.println(divideNumber); 
        }
        catch(Exception e){
            System.out.println("You cannot do this reason"+ e);
        }
    }
}
public class CustomCalculator implements Addition, Subtract, Divide{
    // boolean check= true;
    
    // public void setCheck(boolean check){
    //     this.check = check;
    // }

    // public boolean getCheck(){
    //     return check;
    // }
    public static void main(String[] args) {
        //>-- Creating object 
    CustomCalculator firstCalculator = new CustomCalculator();
    Scanner sc = new Scanner(System.in);
    //>-- Reading two number given by user
    System.out.println("Enter two numbers:");
    int number1 = sc.nextInt();
    int number2 = sc.nextInt();
    System.out.println("What Arthimetic operation do you want to do");
    //>-- Reading Operator for calculation
    char operation = sc.next().charAt(0);
    // String operation = sc.nextLine(); >-- This throws some kind of error
    switch (operation){
        case '+':
                System.out.println(firstCalculator.sumNumber(number1, number2));//call function of Addition interface
                break;
        case '-':
                System.out.println(firstCalculator.subNumber(number1, number2));//call function of Substract interface
                break;
        case '/':
                firstCalculator.divideNumber(number1, number2);//call function of Divide interface
                break;    
    }
    sc.close();
}
}
