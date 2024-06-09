import java.util.Scanner;
public class BankAccount {
    static int balanced;
    public int deposite(int d)
    {
         balanced+=d;
    return 0;}  
    public int withDraw(int w)
    {
        if(balanced==0){
            System.out.print("Your balance is: "+balanced);
        }
        if(balanced!=0){
            balanced+=w;
            System.out.print("Your balance is: "+balanced);
        }   
   return balanced;}
    public static void main(String[] account)
    {
        balanced = 0;
        Scanner ob= new Scanner(System.in);
        BankAccount obj1 = new BankAccount();
        System.out.print("Deposite or WithDraw");
        String type = ob.nextLine();
        System.out.print("Deposite or WithDraw");
        int inOutBalance= ob.nextInt();
        if(type == "deposite"){
            obj1.deposite(inOutBalance);
        }
        else if(type =="withdraw"){
            obj1.withDraw(inOutBalance);
        }
        ob.close();
    }
}
