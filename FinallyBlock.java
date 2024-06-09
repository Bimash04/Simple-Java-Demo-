/*--Class to check the finally keywords-- */
class DividingNumber{
    public static int twoNumber(){
        try{
            int num_1 = 15;
            int num_2 = 3;
            int totalDivide = num_1 / num_2;
            return totalDivide;//return keywords reuturn the value request by the method and the program will stop 
    }
    catch(Exception e){
        System.out.println("Execption occur:");
    }
    finally{//finally keyword will get the code executed anyhow
        System.out.println("Checking if it will be executed or not ");
    }
    return 0;
}
}

/*--Main class-- */
public class FinallyBlock extends DividingNumber{
    public static void main(String[] args) {
        System.out.println(twoNumber());
    }
}
