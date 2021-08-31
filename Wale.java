package bot;

import java.util.Scanner;

public class Wale
{
    final static Scanner scanner = new Scanner(System.in); // uses only one scanner throughout code

    public static void main(String[] args) {
        greetings(); //calls greet function
        userName(); //calls username function
        guessAge();
        countNumbers();
        testUser();
    }
    public static void greetings() //function that contains greetings
        {
        System.out.println("Hello! My name is Wale.");
        System.out.println("I was created in 2021.");
        System.out.println("I would love to know your name. Would you mind telling me?");

    }

    public static void userName() //functions that stores and registers name of user
    {
        String user = scanner.nextLine();
        System.out.println("What a great name you have,"+" "+user+"!");

    }

    public static void guessAge() //function that guesses the age of user
    {
        System.out.println("Let me try to guess your age \uD83E\uDD14. This should be fun!");
        System.out.println("How about you tell me the remainders after dividing your age by 3,5, and 7");

        System.out.println("What is the remainder after dividing your age by 3?"); //prime reading
        int remainder3 = scanner.nextInt();

        System.out.println("How about 5?");
        int remainder5 = scanner.nextInt();

        System.out.println("And finally, after dividing by 7?");
        int remainder7 = scanner.nextInt();

        //math to calculate age (only works well as a from the range 1 -104)
        int userAge = ((remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105);
        System.out.println("You are"+" "+userAge+" "+"years old!\uD83D\uDE03");

        if (userAge > 100) //condition that covers when user enters age that is above 100 or 105
        {
            System.out.println("How are you more than 100 years old?\uD83D\uDE33\nThat is amazing!");
        }
    }

   public  static void countNumbers() //simple function that counts the numbers
    {
        System.out.print("Give me a simple math test. I can count from 0 to any number you tell me." +
                "\t. What number should I count to?\n");
        int numberCount = scanner.nextInt();
        for (int i = 0; i <= numberCount; i++)
        {
            System.out.println(i);
        }
        System.out.println("See, I told you that I am smart");
    }

    public static void testUser() //tests for user's knowledge about bot
    {
        System.out.println("Let's see if you have been paying attention to all I have said.");
        System.out.println("What is my name?");
        System.out.println("1. JARVIS.");
        System.out.println("2. GIDEON");
        System.out.println("3. WALE.");
        System.out.println("4. FRANK.");

        int ans = scanner.nextInt();

        if (ans == 1 || ans == 2 || ans ==4)
        {
            System.out.println("WRONG! try again");
        }
        else if (ans ==3) {
            System.out.println("Congratulations, you were right! Guess  you were paying attention have a nice day now!");
        }
        else
            System.out.println("You need to choose from the given options");
    }
}
