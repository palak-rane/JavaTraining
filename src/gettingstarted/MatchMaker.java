package gettingstarted;

import java.util.Scanner;

public class MatchMaker {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("*************************************************************");
        System.out.println("Welcome to Matchmakers");
        System.out.println("*************************************************************");
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        //System.out.println("Hi " + scanner + "Let me find best match for you. Please be patient..");
        System.out.print("Your wait time is in seconds: ");
        for (int i=5; i>0; i--) {
            System.out.print(i + " ");
            Thread.sleep(1000);
        }
        System.out.print("\n\nCongratulations Khushbooji");
        System.out.println("\n The best match for you is ....❤️SHUBHAM ❤️");
        System.out.println("\nThank you giving us an opportunity to find your partner. Cheers!");
    }
}

