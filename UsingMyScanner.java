
/*--Due to error using inheritance-- */
//import YoutTubeLearning.*;
public class UsingMyScanner extends CreatingInputAndPrintMethod{
    public static void main(String[] args)
    {
        // Object of UsingScanner class but which takes references of CreatingInputAndPrintMethod only
        CreatingInputAndPrintMethod java = new UsingMyScanner();
        //Scanning input with my own method
        // int num = java.inputNumber();
        String text = java.inputString();
        // char character = java.inputChar();
        //printing with my own print method
        java.printMethod("Printing with my Own print method which i have created");
        //printing with Jdk method
        // System.out.println("Input number taken as "+num);
        // System.out.println("Input taken as character "+ character);
        System.out.println("Input taken as "+ text);
    }
}
