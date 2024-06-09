/*-- main class-- */ 
public class ThreadingClass implements ThirdClass{
    public static void main(String[] args) {
        /*--Code by creating object of two different class-- */
            FirstClass java1 = new FirstClass();
            SecondClass util2 = new SecondClass();
            java1.start();//start method of thread class that will execute the run method
            util2.start();        
        /*--code by implementation of interface-- */
        
            ThirdClass bullet = new ThreadingClass();//creating object of threadingclass which take reference of thirdClass

            /*Like putting the bullet on gun. it is important to pass object of class or interface which implements the
            * Runnable interface, while creating an object of Thread class. */
            Thread gun = new Thread(bullet);
            // gun.setPriority(Thread.MAX_PRIORITY); --> Maximum priority 
            // gun.setPriority(Thread.MIN_PRIORITY); --> Minmum priority 
            // gun.setPriority(Thread.NORM_PRIORITY); --> Normal priority 
            gun.setName("Thread Gun");//sets the name of Thread
            gun.start();//Makes the Thread runnable/ Running
            System.out.println("Name of the Thread "+ gun.getName());//.getName method shows the name of thread
            
    }
}
/*--First class that inheritade .thread class-- */
class FirstClass extends Thread{
    @Override
    public void run(){  //override method of thread class
        int i = 0;
        while(i < 50){ //while loop for printing 10 times
            System.out.println("Printing from FirstClass");
            i++; //increase the value of i by 1 
        }
    }
}
/*--Scond class that also inheritade .thread class-- */
class SecondClass extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i < 50){
            System.out.println("hello i am threading 2");
            i++;
        }
    }
}
/*--Creating an interface which extends runnnable-- */
interface ThirdClass extends Runnable{ 
    @Override
    default void run() {
        int i =0;
        while(i <20){
            System.out.println("Printing from interface ThirdClass");
            i++;
        }
    }
}