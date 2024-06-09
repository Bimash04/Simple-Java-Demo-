import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        int array[] = {10,8,3,4};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter for selecting the index");
        int index = sc.nextInt();
        try{  
            System.out.println("value of Selected Array: "+ array[index]);
        }
        catch(Exception e){ //>-- if the index of array is not valid 
            System.out.println("Your input was incorrect because of this error:");
            System.out.println("Enter the proper number from 0 - 3 ");
            int index2 = sc.nextInt(); //>-- if the index is error then request for reentering
            try{
                System.out.println(" value of Selected array: "+ array[index2]);
                System.out.println("Thanks for Entering the right number of index");
            }
            catch(ArrayIndexOutOfBoundsException a){
                System.out.println("Your are Idot or what ??");
            }
        }
        sc.close();
    }
}
