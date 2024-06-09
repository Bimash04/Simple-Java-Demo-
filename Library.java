
//import javax.swing.JFrame;

public class Library {
    int availableBooks[]=new int[15];
    int issuedBooks[]= new int[3];
    
    void addBook(int numOfAddBooks)//adds value 1 to array-availableBooks
    {
        for(int i = 0; i < numOfAddBooks; i++){
            this.availableBooks[i]=1;
        }
    }
    void issueBooks(int numOfIssueBooks)//adds value 0 to array-availableBooks and 1 to issuedBooks
    {
        for(int i = 0; i < numOfIssueBooks; i++){
           this.issuedBooks[i]=1;
            this.availableBooks[i]=0;
        }
    }
    void returnBooks(int numOfReturnBooks)//adds value 1 to array-availableBooks and 0 to issuedBooks
    {
        for(int i = 0;i < numOfReturnBooks; i++){
            this.issuedBooks[i]=0;
            this.availableBooks[i]=1;
        }
    }
    void showAvailableBooks()//method to display number of books available in library 
    {
        for(int i : availableBooks){
            System.out.println(i);
        }
    }
    //main method
    public static void main(String args[])
    {
        Library object = new Library();
        object.addBook(15);
        object.issueBooks(2);
        object.returnBooks(2);
        object.showAvailableBooks();
    }
}
