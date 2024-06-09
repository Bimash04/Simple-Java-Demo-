public class ServiceDepartment extends Department {
    int price;
    String name;
    public ServiceDepartment(){
        super.price = 10000;
        super.name = "Charger";
    }
    public void depInfo(){
        System.out.print("From SeriveDepartment\n");
        super.depInfo();
    }
    public static void main(String[] args){
        ServiceDepartment s = new ServiceDepartment();
        s.depInfo();
    }
}
