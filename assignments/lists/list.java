import java.util.*;
import java.util.Scanner;
class list{
    public static int indexnum=-1;
    public static void main(String[] args){
        ArrayList<String> todolist = new ArrayList<String>(); 
        for(int i=0;i<todolist.size();i++){
            System.out.println(todolist.get(i));
        }
        while (true) {
            System.out.print("Enter and index number to view: ");
            Scanner scan = new Scanner(System.in);
            if(scan.hasNextInt()) {
                indexnum = scan.nextInt();
                break;
            }
            else {
                System.out.println("Invalid amount, please resubmit");
            }
        }
        viewindex();
        System.out.println(indexnum);
    }
    public static void viewindex(){
         Scanner scan4 = new Scanner(System.in);
         while (true) {System.out.print("Would you like to add or delete an index? ");  
        if(isValidBoolean(scan4)) {
            break;
            }
            else {
                System.out.println("Invalid input!");
            } 
        }
    }
    public static Boolean isValidBoolean(Scanner scan4) {
            String s = scan4.nextLine();
           return (
                s.toLowerCase().equals("add")||
                s.toLowerCase().equals("delete")||
                s.toLowerCase().equals("+")||
                s.toLowerCase().equals("-")
           );
    }       

    public static Boolean isValidInt(Scanner scan) {
        try {
            int s = scan.nextInt();
        }
        catch(Exception e) {
            return false;
        }
        return true; 
    }
}