import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int wins = 0;
        int losses = 0;
        while(i < 1) {
            String[] moves = {"rock","paper","scissors"};
            Random randmove = new Random();
            var Rand_item = randmove.nextInt(moves.length);
            var opponentmove = moves[Rand_item];
            Scanner input = new Scanner(System.in);
            System.out.print("Your Move: ");
            String inputstring = input.nextLine();
            if(inputstring.equalsIgnoreCase(opponentmove)) {
                System.out.println("Opponent's Move: "+opponentmove);
                System.out.println("You Tied. Try Again...");
                System.out.println("SCORE: "+wins+"/"+losses);
            }
            else if (opponentmove.equalsIgnoreCase("Rock") && (inputstring.equalsIgnoreCase("scissors"))) {
                System.out.println("Opponent's Move: "+opponentmove);
                losses += 1;
                Scanner response = new Scanner(System.in);
                System.out.println("SCORE: "+wins+"/"+losses);
                System.out.println("You Lost! Want to play again? Yes or No ");
                String responsestring = response.nextLine();
                if (responsestring.toLowerCase().contains("no")) {
                    i += 1;
                }
            }
            else if(opponentmove.equalsIgnoreCase("Paper") && (inputstring.equalsIgnoreCase("Rock"))) {
                System.out.println("Opponent's Move: "+opponentmove);
                losses += 1;
                Scanner response = new Scanner(System.in);
                System.out.println("SCORE: "+wins+"/"+losses);
                System.out.println("You Lost! Want to play again? Yes or No ");
                String responsestring = response.nextLine();
                if (responsestring.toLowerCase().contains("no")) {
                    i += 1;
                }
            }
            else if(opponentmove.equalsIgnoreCase("scissors") && (inputstring.equalsIgnoreCase("Paper"))) {
                System.out.println("Opponent's Move: "+opponentmove);
                losses += 1;
                Scanner response = new Scanner(System.in);
                System.out.println("SCORE: "+wins+"/"+losses);
                System.out.println("You Lost! Want to play again? Yes or No ");
                String responsestring = response.nextLine();
                if (responsestring.toLowerCase().contains("no")) {
                    i += 1;
                }
            }
            else if(opponentmove.equalsIgnoreCase("scissors") && (inputstring.equalsIgnoreCase("Rock"))) {
                System.out.println("Opponent's Move: "+opponentmove);
                wins += 1;
                Scanner response = new Scanner(System.in);
                System.out.println("SCORE: "+wins+"/"+losses);
                System.out.println("You Won! Want to play again? Yes or No ");
                String responsestring = response.nextLine();
                if (responsestring.toLowerCase().contains("no")) {
                    i += 1;
                }
            }
            else if(opponentmove.equalsIgnoreCase("Paper") && (inputstring.equalsIgnoreCase("scissors"))) {
                System.out.println("Opponent's Move: "+opponentmove);
                wins += 1;
                Scanner response = new Scanner(System.in);
                System.out.println("SCORE: "+wins+"/"+losses);
                System.out.println("You Won! Want to play again? Yes or No ");
                String responsestring = response.nextLine();
                if (responsestring.toLowerCase().contains("no")) {
                    i += 1;
                }
            }
            else if (opponentmove.equalsIgnoreCase("Rock") && (inputstring.equalsIgnoreCase("Paper"))) {
                System.out.println("Opponent's Move: "+opponentmove);
                wins += 1;
                Scanner response = new Scanner(System.in);
                System.out.println("SCORE: "+wins+"/"+losses);
                System.out.println("You Won! Want to play again? Yes or No ");
                String responsestring = response.nextLine();
                if (responsestring.toLowerCase().contains("no")) {
                    i += 1;
                }
    }}}}