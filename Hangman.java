import java.util.*;
public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String player = "messi";
        boolean buli = false;
        Integer cycle = 3;
        Integer guess = 0;
        char[] player1 = new char[player.length()];
        player1[0] = '_';
        player1[1] = '_';
        player1[2] = '_';
        player1[3] = '_';
        player1[4] = '_';

        System.out.println("You have 3 chances for wrong letter");
        System.out.println("Guess the player: _____");

            while(new String(player1).contains("_") && cycle > 0 ) {
                System.out.println("Guess the letter: ");
                char input = scanner.nextLine().charAt(0);
                buli = false;
                for (int i = 0; i < player.length() ; i++) {
                    if (player.charAt(i) == input) {
                        player1[i] = input;
                        buli = true;
                    }
                }
                if (buli == false) {
                    System.out.printf("Wrong guess, you have left %d\n", cycle-1);
                    cycle--;
                }
                System.out.println(player1);
            }
    }
}
