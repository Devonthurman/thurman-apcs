class operators {
    public static void main(String args[]) {
        // String name = "devon";
        // System.out.println(name);
         String firstName = "devon";
        String lastName = "thurman";
        String fullName = firstName + " " + lastName;
        System.out.println(firstName);
        System.out.println("firstName");
        System.out.println(lastName);
        System.out.println("lastName");
        System.out.println(fullName);
        System.out.println("fullName");
        int currentYear = 2018;
        int yearsUntilGraduation = 1;
        int myGradYear = currentYear + yearsUntilGraduation;

        System.out.println(myGradYear);
        System.out.println("myGradYear");
         int currentAge = 18;
        int nextAge = currentAge + 1;
        System.out.println(currentAge);
        System.out.println(nextAge);

        int halfCurrentAge = currentAge / 3;
        int halfNextAge = nextAge / 3;
        System.out.println(halfCurrentAge);
        System.out.println(halfNextAge);

        //"Modulo" is the name of the '%' operator. Can you figure out what the modulo operator is doing?
        int moduloCurrentAge = currentAge % 100;
        int moduloNextAge = nextAge % 100;
        System.out.println(moduloCurrentAge);
        System.out.println(moduloNextAge); 
        double bitcoinsOwned = 1000000000;
        double bcsCoinsOwned = 200;

        double bitcoinValue =  1000000000;
        double bcsCoinValue = 0;

        double bitcoinsWorth = bitcoinsOwned * bitcoinValue;
        double bcsCoinsWorth = bcsCoinsOwned * bcsCoinValue;
        System.out.println("My current bitcoins are worth $" + bitcoinsWorth);
        System.out.println("My current BCSCoins are worth $" + bcsCoinsWorth);

        //Let's assume I can get it so you can redeem 25 BCSCoins for a $5 giftcard.
        double reward = 5;
        double amtToRedeem = 25;
        bcsCoinValue = reward / amtToRedeem; //Reassign bcsCoinValue to the potential
        System.out.println("One BCSCoin might be worth $" + bcsCoinValue + " later. If so...");

        bcsCoinsWorth = bcsCoinsOwned * bcsCoinValue; //This is the exact same calculation we used earlier, but we updated bcsCoinValue, so let's calculate it again.
        System.out.println("My current BCSCoins could eventually be worth $" + bcsCoinsWorth);
         Boolean haveJob = false;
        Boolean lookingForWork = true;
        Boolean canProgram = false;
        int currentSavings = 500;

        //There are some print statements below. Can you guess which ones will print?
        if(!haveJob) {
            if(lookingForWork && canProgram) {
                System.out.println("Your chances as getting a job go up!");
            }
            else {
                System.out.println("You might need to gain more skills before you can get a job.");
            }
        }
        if(currentSavings < 500) {
            System.out.println("You should be saving more money.");
        }
        else {
            System.out.println("Do you need to save more money, still?");
        }
    }
}
