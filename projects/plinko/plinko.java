import java.util.Scanner;

class plinko {
    public static final int SINGLE_DISC = 1;
    public static final int MULTI_DISC = 2;
    public static final int TERMINATE = 3;
    public static int userselectedposition=-1;
    public static int position=userselectedposition*2;
    public static int discnum=-1;

    public static final int[] VALUES = {1, 3, 2, 0, 5, 0, 2, 3, 1};
    public static int[] results={0,0,0,0,0,0,0,0,0};

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
                }
                else if(mode == MULTI_DISC) {
                    MULTI_DISC();
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
        int finalposition=(position/2);
        int v=position/2;
        System.out.println("You landed in slot "+finalposition+" and won "+VALUES[v]+" points.");
    }

    public static void MULTI_DISC(){
        while (true) {
            System.out.print("Enter number of discs: "); 
            Scanner scan3 = new Scanner(System.in);
            if(scan3.hasNextInt()) {
                discnum = scan3.nextInt();
                if(0<discnum){
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
        results[0]=0;
        results[1]=0;
        results[2]=0;
        results[3]=0;
        results[4]=0;
        results[5]=0;
        results[6]=0;
        results[7]=0;
        results[8]=0;
        runplinkomult();
        System.out.println("Scored 1 point in position 0: "+results[0]+" times.");
        System.out.println("Scored 3 point in position 1: "+results[1]+" times.");
        System.out.println("Scored 2 point in position 2: "+results[2]+" times.");
        System.out.println("Scored 0 point in position 3: "+results[3]+" times.");
        System.out.println("Scored 5 point in position 4: "+results[4]+" times.");
        System.out.println("Scored 0 point in position 5: "+results[5]+" times.");
        System.out.println("Scored 2 point in position 6: "+results[6]+" times.");
        System.out.println("Scored 3 point in position 7: "+results[7]+" times.");
        System.out.println("Scored 1 point in position 8: "+results[8]+" times.");
        System.out.println("Total points earned: "+(results[0]+(results[1]*3)+(results[2]*2)+(results[4]*5)+(results[6]*2)+(results[7]*3)+results[8]));
    }
    
    public static void runplinko(){
        int i=0;
        for(i=0;i<=11;i++){
            if(position==16){
                position--;
            }
            else if(position==0){
                position++;
            }
            else if(Math.random()>.5){
                position++;
            }
            else{
                position--;
            }
            if (isEven(i)){
                runEvenRow(position);
            }  
            else{
                runOddRow(position);
            }  
            // if (i>9){
            //     runfinalrow(position);
            // }
        }
        System.out.println("|1|3|2|0|5|0|2|3|1|");   
    }
    public static void runplinkomult(){
        int i=0;
        while(discnum>0){
            discnum--;
            position=userselectedposition*2;
            for(i=0;i<=11;i++){
                if(position==16){
                    position--;
                }
                else if(position==0){
                    position++;
                }
                else if(Math.random()>.5){
                    position++;
                }
                else{
                    position--;
                }
            }
            int k=position/2;
            results[k]++;
        }
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
        for(int i = 0; i <= 18; i++) {
            if(position == i) {
                System.out.print("☻");
            }
            else if(isEven(i)) {
                System.out.print("|");
            }
            else {
                System.out.print("_");
            }
        }
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
    public static Boolean isValidint(Scanner scan3) {
        try {
            int s = scan3.nextInt();
        }
        catch(Exception e) {
            return false;
        }
        return true; 
    }
}


