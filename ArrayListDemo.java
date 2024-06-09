import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        // ArrayList<> numberSyore = new <>ArrayList();
        ArrayList<Integer> numberContainer = new ArrayList<>();
        numberContainer.add(11);
        numberContainer.add(20);
        numberContainer.add(39);
        //>- Display the elements contain in the arraylist
        System.out.println(numberContainer);
        //>--Display the size of the array
        System.out.println(numberContainer.size());
        //return true if the elements is in the arraylist
        System.out.println(numberContainer.contains(11));
        //Update the elements of arraylist
        numberContainer.set(0, 6);
        //Display after updating the value of arraylist
        System.out.println(numberContainer);
    }
}
