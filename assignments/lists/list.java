import java.util.*;
class list{
    public static ArrayList<String> todolist = new ArrayList<String>(); 
    public static int indexnum=-1;
    public static String todoitem="-1";
    public static void main(String[] args){
        for(int i=0;i<todolist.size();i++){
            System.out.println(todolist.get(i));
        }
        // viewindex();
        for(int i=0; i<10; i++){
           addindex();
           System.out.println(todolist.get(i));
           }
        
    }
    public static void addindex(){
        while (true) {
            System.out.print("Enter ToDo item: ");
            Scanner scan = new Scanner(System.in);
            if(scan.hasNextLine()) {
                todoitem = scan.nextLine();
                todolist.add(todoitem);
                 break;
            }
        }

    }

    // public static void viewindex(){
    // Scanner scan4 = new Scanner(System.in);
    //      while (true) {System.out.print("Would you like to add or delete an index? ");  
    //     if(isValidBoolean(scan4)) {
    //         break;
    //         }
    //         else {
    //             System.out.println("Invalid input!");
    //         } 
    //     }
    // }
    // public static Boolean isValidBoolean(Scanner scan4) {
    //         String s = scan4.nextLine();
    //        return (
    //             s.toLowerCase().equals("add")||
    //             s.toLowerCase().equals("delete")||
    //             s.toLowerCase().equals("+")||
    //             s.toLowerCase().equals("-")
    //        );
    // }       

    // public static Boolean isValidInt(Scanner scan) {
    //     try {
    //         int s = scan2.nextInt();
    //     }
    //     catch(Exception e) {
    //         return false;
    //     }
    //     return true; 
    // }
    public static Boolean isValidString(Scanner scan) {
        try {
            String s = scan.nextLine();
        }
        catch(Exception e) {
            return false;
        }
        return true; 
    }
}