import java.util.Scanner;

class plinko {
    public static final int SINGLE_DISC = 1;
    public static final int MULTI_DISC = 2;
    public static final int TERMINATE = 3;
    public static int userselectedposition=-1;
    public static int position=userselectedposition*2;

    public static final int[] VALUES = {1, 3, 2, 0, 5, 0, 2, 3, 1};

    public static int mode = -1;

    public static void main(String[] args) {
        Scanner scan;
        while(true) {
            //Loop to select mode.
            //This loop is infinite until the user selects the "Quit" option (3)
            scan = new Scanner(System.in);
            printModeStatement();
            if(scan.hasNextInt()) {
                mode = scan.nextInt();
                if(mode == SINGLE_DISC) {
                    SINGLE_DISC();
                    break;
                }
                else if(mode == MULTI_DISC) {
                    System.out.println("Mode not yet implemented");
                }
                else if(mode == TERMINATE) {
                    System.out.println("Goodbye");
                    break;
                } else {
                    continue;
                }
            }
        }
    }
    public static void SINGLE_DISC(){
        
         while (true) {
            System.out.print("enter starting position from 0-8: "); 
            Scanner scan2 = new Scanner(System.in);
            if(scan2.hasNextInt()) {
                userselectedposition = scan2.nextInt();
                if(0<= userselectedposition && userselectedposition <= 8){
                    break;
                }
                else{
                System.out.println("Please resubmit a valid position");
                }
            }
            else{
                System.out.println("Please resubmit a valid position");
            }
        }
        position=userselectedposition*2;
        runOddRow(position);
        runplinko();
        

    }

    public static void runplinko(){
        int i=0;
        for(i=0;i<=10;i++){
            if(Math.random()>0.5){
                position--;
            }
            else if(position>16){
                position--;
            }
            else if(position<0){
                position++;
            }
            else{
                position++;
            }
            if (isEven(i)){
                runEvenRow(position);
            }  
            else if(i<=9){
                runOddRow(position);
            }  
            if (i>9){
                runfinalrow(position);
            }
        } 
        System.out.println("|1|3|2|0|5|0|2|3|1|");   
    }

    public static int runOddRow(int position) {
        System.out.print("|");
        for(int i = 0; i <= 16; i++) {
        if(position == i) {
            System.out.print("☻");
        }
        else if(isEven(i)) {
            System.out.print(" ");
        }
        else {
            System.out.print(".");
        }
    }
    System.out.print("|");
    System.out.print("\n");
        //Modify the position.
        //Print the visualization of the row if it's single disc mode.

        return position;
    }

    public static int runEvenRow(int position) {
        System.out.print("|");
        for(int i = 0; i <= 16; i++) {
        if(position == i) {
            System.out.print("☻");
        }
        else if(isEven(i)) {
            System.out.print(".");
        }
        else {
            System.out.print(" ");
        }
    }
    System.out.print("|");
    System.out.print("\n");
        //Modify the position.
        //Print the visualization of the row if it's single disc mode.

        return position;
    }
    public static int runfinalrow(int position){
        System.out.print("|");
        for(int i = 0; i <= 16; i++) {
        if(position == i) {
            System.out.print("☻");
        }
        else if(isEven(i)) {
            System.out.print("_");
        }
        else {
            System.out.print("|");
        }
    }
    System.out.print("|");
    System.out.print("\n");
        //Modify the position.
        //Print the visualization of the row if it's single disc mode.

        return position;
    }

    public static Boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static void printModeStatement() {
        System.out.print(
            "Select a mode:\n"
            + "\t(1) Single disc\n"
            + "\t(2) Multiple discs\n"
            + "\t(3) Quit\n"
        );
    }

    public static Boolean isValidslot(Scanner scan2) {
        try {
            int s = scan2.nextInt();
        }
        catch(Exception e) {
            return false;
        }
        return true; 
        }
}

