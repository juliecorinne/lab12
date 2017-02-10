import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int team;
        Spongebob spongebob = new Spongebob();
        Patrick patrick = new Patrick();
        User user = new User();

        System.out.println("Hello! Let's play a game of Rock, Paper, Scissors.");
        System.out.println();
        System.out.println("Rules: ");
        System.out.println();
        System.out.println("Rock crushes Scissors.");
        System.out.println("Scissors cuts Paper.");
        System.out.println("And, for whatever reason, Paper covers Rock.");
        System.out.println();

        System.out.println("Who would you like to play against? Type 1 for Spongebob or 2 for Patrick.");
        team = scan.nextInt();
        System.out.println();

        if (team == 1) {

            user.pick();
            spongebob.pick();

        } else {

            user.pick();
            patrick.pick();

        }

    }
}
