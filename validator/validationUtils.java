import java.util.Scanner;

class ValidationUtils {
    public static void main(String args[]) {
        System.out.print("Enter a string: ");
        Scanner scan = new Scanner(System.in);
        if(isValidString(scan)) {
            System.out.println("String Success!");
        }
        else {
            System.out.println("String Failure!");
        }
       
        System.out.print("Enter a Int: ");
        Scanner scan2 = new Scanner(System.in);
        if(isValidInt(scan2)) {
            System.out.println("Int Success!");
        }
        else {
            System.out.println("Int Failure!");
        }
        
        System.out.print("Enter a Double: ");
        Scanner scan3 = new Scanner(System.in);
        if(isValidDouble(scan3)) {
            System.out.println("Double Success!");
        }
        else {
            System.out.println("Double Failure!");
        }
        
        System.out.print("Enter a Boolean: ");
        Scanner scan4 = new Scanner(System.in);
        if(isValidBoolean(scan4)) {
            System.out.println("Boolean Success!");
        }
        else {
            System.out.println("Boolean Failure!");
        }
      
       
    }

    public static Boolean isValidString(Scanner scan) {
        try {
            String s = scan.nextLine();
        }
        catch(Exception e) {
            return false; //An error was raised. The user input could not be read as a String.
        }
        return true; //No error was raised. The scanner read it successfully as a String.
    }

    public static Boolean isValidInt(Scanner scan2) {
        try {
            int s = scan2.nextInt();
        }
        catch(Exception e) {
            return false;
        }
        return true; 
    }

    public static Boolean isValidDouble(Scanner scan3) {
        try {
            double n = scan3.nextDouble();
        }
        catch(Exception e) {
            return false;
        }
        return true; 
    }
    
    public static Boolean isValidBoolean(Scanner scan4) {
            String s = scan4.nextLine();
           return (
                s.toLowerCase().equals("f")||
                s.toLowerCase().equals("false")||
                s.toLowerCase().equals("t")||
                s.toLowerCase().equals("true")
           );

        
        }
}
    
        