public class DateOfJavaTillNow{
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        try {
            Long number= Long.MAX_VALUE;
            System.out.println(number);

        } catch (Exception e) {
        
            System.out.println("");
        }
    }
}