import java.util.Scanner;

public class NestTryWithLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String array[] = {"Thread1", "Thread2", "Thread3","Thread4"};
        boolean checker = true;
        while(checker){//this loop will run untile the function is true 
            System.out.println("Enter an number for index");
            int number = sc.nextInt();
            try{//>--First try
                try{//>-- Second try is for printing array of given index and changing the value of boolean
                    System.out.println("Selected value of Array "+ array[number]);//>--if the code founds error it will move to catch part 
                    checker = false;
                }
                catch(ArrayIndexOutOfBoundsException a){
                    System.out.println("your Input is Wrong");//>--after executing this part the loop will again continue 
                }
            }
            catch(Exception e){
                System.out.println("Your Input is Wrong");
            }
        }
        System.out.println("Thanks for selecting the right index you Baka");
        sc.close();
    }
}
