class optionalloop{
    public static void main (String[] args){
        int n = 0;
       
        while (n<3,true){
            Scanner scan2 = new Scanner(System.in);
            System.out.print("Enter a Int: ");
            if(isValidInt(scan2)) {
                System.out.println("Int Success!");
            }
            else {
                System.out.println("Int Failure!");
                n++;
            }
        }   
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
}