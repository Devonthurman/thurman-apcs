import java.util.Scanner;

public class LoanCalculator{
    public static int mode = -1;
    public static double loanAmt = -1;
    public static int loanTerm = -1;
    public static double interestRate = -1;

    public static void main(String[] args) {
        //Read in the loan calculation mode
        Scanner scan;
        while(true) { //Loop the mode selection menu until a valid input is provided
            scan = new Scanner(System.in);
            printModeStatement(); //Call a function to print our mode selection statement
            if(scan.hasNextInt()) { //Check if input provided is a valid integer
                mode = scan.nextInt();
                if(0 < mode && mode < 4) { //Check if input provided is 1, 2, or 3
                    break; //Valid input has been provided. Break out of the while loop
                }
            }
            //If it reaches here, the input was invalid. Loop again.
        }
        System.out.println("You selected mode " + mode);

        if(mode == 1) {
            flatInterest();
        }
        else {
            System.out.println("Other modes not yet supported."); //Replace this with calls to your appropriate functions            
        }
    }

    public static void flatInterest() {
        while (true) {System.out.println("Enter Loan amount"); //Delete this once you implement the function
        //Calculate flat interest and print it out here
        Scanner scan3 = new Scanner(System.in);
        if(loanAmt(scan3)) {
             break;
            
        }
       
        else {
             System.out.println("Invalid amount, please resubmit");
            
        }}
        while (true) {System.out.println("Enter Loan term in years");
        Scanner scan2 = new Scanner(System.in);
        if(loanTerm(scan2)) {
                break;
        }
        else {
            System.out.println("Invalid amount, please resubmit");
        }
        }
        while (true){ System.out.println("Enter Loan interest (as a percentage)");
        Scanner scan4 = new Scanner(System.in);
        if(interestRate(scan4)) {
         break;
        }
        else {
            System.out.println("Invalid amount, please resubmit");
        }
    };
    System.out.println("Loan amount: "+loanAmt);
    
}

    public static void printModeStatement() {
        System.out.print(
            "Select an interest calculation mode:\n"
            + "(1) Flat Interest\n"
            + "(2) Compounding Interest Without Monthly Payments\n"
            + "(3) Compounding Interest With Monthly Payments\n"
        );
    }
     public static Boolean loanTerm(Scanner scan2) {
        try {
            int s = scan2.nextInt();
        }
        catch(Exception e) {
            return false;
        }
        return true; 
    }
     public static Boolean loanAmt(Scanner scan3) {
        try {
            double n = scan3.nextDouble();
        }
        catch(Exception e) {
            return false; 
        }
        return true; 
    }   
         public static Boolean interestRate(Scanner scan4) {
        try {
            double n = scan4.nextDouble();
        }
        catch(Exception e) {
            return false;
        }
        return true; 
    }
}
      