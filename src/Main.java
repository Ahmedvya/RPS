import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean session = true;
        while (session == true) {
            String playerA = "";
            String playerB = "";
            String playgain = "";
            boolean aTrue = false;
            boolean bTrue = false;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter R, P or S for player A");
            while (aTrue == false) {
                if (in.hasNextLine()) {
                    playerA = in.nextLine();
                    if (playerA.equalsIgnoreCase("R") || (playerA.equalsIgnoreCase("P")) || (playerA.equalsIgnoreCase("S"))) {
                        aTrue = true;
                    } else {
                        aTrue = false;
                        System.out.println("Please input a valid value ");
                    }
                }
            }
            System.out.println("Enter R, P or S for player B ");
            while (bTrue == false) {
                if (in.hasNextLine()) {
                    playerB = in.nextLine();
                    if (playerB.equalsIgnoreCase("R") || (playerB.equalsIgnoreCase("P")) || (playerB.equalsIgnoreCase("S"))) {
                        bTrue = true;
                        System.out.println("Please input a valid value");

                    }

                }
            }

            if (playerA.equalsIgnoreCase("R") && (playerB.equalsIgnoreCase("S"))) {
                System.out.println("Rock beats scissors, player a wins");
            } else if (playerA.equalsIgnoreCase("s") && playerA.equalsIgnoreCase("P")) {
                System.out.println("Scissors beats paper , player a wins ");
            } else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("r")) {
                System.out.println("Paper beats rock, player A wins");

            }
            if (playerB.equalsIgnoreCase("R") && playerA.equalsIgnoreCase("S")) {
                System.out.println("Rock beat Scissors, player b wins");
            }  if (playerB.equalsIgnoreCase("s") && playerA.equalsIgnoreCase("P")) {
                System.out.println("Scissors beats paper , player B wins ");
            }else if (playerB.equalsIgnoreCase("P") && playerA.equalsIgnoreCase("r")) {
                System.out.println("Paper beats rock, player b wins");
            }
            if (playerB.equalsIgnoreCase("P") && playerA.equalsIgnoreCase("r")) {
                System.out.println("Rock against rock, tie ");
            }else if (playerB.equalsIgnoreCase("s") && playerA.equalsIgnoreCase("s")) {
                System.out.println("Scissors against scissors, tie");
            }else if (playerB.equalsIgnoreCase("P") && playerA.equalsIgnoreCase("p")) {
                System.out.println("Paper against paper, tie");
            }
            System.out.println("Would you like to play again?");
            playgain = in.nextLine();
            if (playgain.equalsIgnoreCase("Y")) {
                System.out.println("Playing again");
            } else if (playgain.equalsIgnoreCase("n")) {
            }
            System.out.println("Ending games");
            session = false;
        }
    }
}


