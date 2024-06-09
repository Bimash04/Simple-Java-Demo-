

interface Wifi{
    void wifi(); 
}
interface Gps{
    void gps();
}

interface Camera extends Gps{ //--> can inheritance interface with interface
    void cameraGps();
}
/*  interface laptopDemo implements Wifi{ -->Not allowed to implement interface with interface 

 }   */
/*class SmartPhone extends Wifi{--> class cannot inherite interface

} */ 

class Laptop implements Camera, Wifi{//--> one class can implement more than one interface
    public void cameraGps(){
        System.out.println("Laptop can Act as Camera with Gps available");
    }
    public void gps(){
        System.out.println("Laptop has Gps available");
    }
    public void wifi(){
        System.out.println("Laptop has Wifi available ");
    }
}
class SmartPhone extends Laptop {
        // public void wifi(){
        //     System.out.println("phone has also wifi available");
        // }
        // public void gps(){
        //     System.out.println("Phones also have Gps");
        // }
        public void SmartPhoneFeature(){
            System.out.println("Easy to carry");
        }
}
public class Polymorphism extends SmartPhone{
    public static void main(String[] args){
        Laptop dell = new Polymorphism();//creating object of polymorphism class but taking reference of Laptop class
        //dell.SmartPhoneFeature(); --> Not allowed because methods of laptop class only come on iphone object
        dell.cameraGps();
        SmartPhone iphone = new Polymorphism();//creating object of polymorphism class but taking reference of smartphone class
        iphone.cameraGps();// this is allowded because smartphone is child class of laptop
    }
}
