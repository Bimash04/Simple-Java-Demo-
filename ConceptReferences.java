

public class ConceptReferences extends Child_3 implements Child_2, Child_1{
    public void display(int num)//using abstract method of interface class child_2 
    {
        System.out.println("Using child_2 abstract method: display");
        super.display();//calls abstract class display method and we can treat abstract class as super  
    }
    public void display()//creating method from interface class child_1
    {
        System.out.println("number of child "+ numOfChild);
    }
   public static void main(String[] args)//main method
   {
        // Child_1 object = new ConceptReferences();
        Child_2 object2 = new ConceptReferences();//allowed to take reference of interface class
        ConceptReferences object3 = new ConceptReferences();
        // object.display();
        // object2.display();
        object3.display();//directly calls abstract method
        object2.display(3);
   }
}
//super class
interface Child_1
{
    public void display();
} 
//interface class
interface Child_2
{
    void display(int num);//abstract method public access modifier is not mandatory
    default void childName(String childName)
    {
        System.out.println(childName);
    }
}
//abstract class
abstract class Child_3
{
    int numOfChild = 2;
    void display(){
        System.out.println(numOfChild+"still it works");
    }
}
//class to try implementaion from another file privateClassConcept
class Concept implements PrivateClassConcept{
    @Override
    public void privateConcept(int argumentNum[]) {
        // int argumentNum_1[]=argumentNum;
       System.out.println(num);
       
    }
}