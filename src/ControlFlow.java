import java.util.Random;
import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
// Calling Ascii methods //
        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();
// Input scanner //
        Scanner playerData = new Scanner(System.in);
        String finalRound;
        System.out.print("Please enter your name: ");
        String userName = playerData.nextLine();
// questions //
        System.out.printf("Hello, %s \n", userName);
        System.out.println("Do you want to continue to the interactive portion? y/n: ");
        String answer = playerData.next();
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
            do {
                System.out.print("Do you own a red car?(yes/no) ");
                String redCar = playerData.next();

                System.out.print("What's the name of your favorite pet? ");
                String favoritePet = playerData.next();

                System.out.print("What is the age of your favorite pet? ");
                int petAge = playerData.nextInt();

                System.out.print("What is your lucky number? ");
                int luckyNum = playerData.nextInt();

                System.out.print("Do you have a favorite quarterback? (yes/no) ");
                answer = playerData.next();
                int jerseyNumber = 1;
                if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
                    System.out.print("What is their jersey number? ");
                    jerseyNumber = playerData.nextInt();
                } else {
                    System.out.println("Ok, let's continue...");
                }
                System.out.print("What is the two digit model year of your car?");
                int year = playerData.nextInt();

                System.out.print("What is the first name of your favorite actor/actress? ");
                String actorName = playerData.next();

                System.out.print("Choose a random number between 1 & 50: ");
                int chosenNumber = playerData.nextInt();

// generating random numbers //

                Random lottery = new Random();
                int magicBall;
                // generate 3 random numbers
                int ran1 = lottery.nextInt(50);
                int ran2 = lottery.nextInt(50);
                int ran3 = lottery.nextInt(50);

                if (jerseyNumber != 0) {
                    magicBall = jerseyNumber * ran1;
                } else {
                    magicBall = luckyNum * ran1;
                }
                // magic ball range //
                if (magicBall > 75) {
                    magicBall = magicBall - 75;
                }
// generate 5 numbers
                int num1;
                int num2;
                int num3;
                int num4;
                int num5;

                num1 = (int) (actorName.charAt(0));
                if (num1 > 65) {
                    num1 = num1 - 65;
                } else if (num1 < 1) {
                    num1 = num1 + 65;
                }

                num2 = ran2 - lottery.nextInt(50);
                if (num2 > 65)
                    num2 = num2 - 65;
                if (num2 < 1)
                    num2 = num2 - 65;

                num3 = petAge + year;
                if (num3 > 65) {
                    num3 = num3 - 65;
                } else if (num3 < 1) {
                    num3 = num3 + 65;
                }

                num4 = 42;

                num5 = (int) (favoritePet.charAt(2));
                if (num5 > 65) {
                    num5 = num5 - 65;
                } else if (num5 < 1) {
                    num5 = num5 + 65;
                }
                System.out.printf("\nLottery numbers: %d, %d, %d, %d, %d Magic ball: %d \n",
                        num1, num2, num3, num4, num5, magicBall);
                System.out.printf("Do you want to play again? Yes or No:");
                finalRound = playerData.next();

            } while (finalRound.equalsIgnoreCase("yes"));
            if (finalRound.equalsIgnoreCase("no")) {
                System.out.println("Game Over! Thanks for playing!");
            }
        } else {
            System.out.println("Please try again later.");
        }
    }
}
