class validatorTest{
    public static void main(String[] args) {

        //introducing scanner to pick up login info
        Scanner login = new Scanner(System.in);

        // setting boolean to true, while this is true the user will be prompted to log in with correct credentials
        boolean isUserVerified = true;

        //Number of tries/guesses it took for the user to log in to the system.
        int loginAttempts = 0;


        //this while loop will loop until " DarkKnight is entered into the terminal ending the program
        while (isUserVerified){
            System.out.println("Enter Recognized Verification Key: ");

            // Declaring the user input as a string for java to compare to match the correct input to complete the program
            String loginAttempt = login.next();
            loginAttempts++;


            // an if statement to state that if "DarkKnight" is passed the terminal will alert the user of the amount of attempts.
            if (loginAttempt.equals("DarkKnight")){

                isUserVerified = false;

                System.out.println("This Attempt Was Clocked at " + loginAttempts + " Attempts");

            }else{
                // while "DarkKnight is not passed the user will continuously be prompted to enter verification key
                System.out.println("Failed");

            }

        }


    }
}
