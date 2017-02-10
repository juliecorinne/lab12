import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int team;
        Spongebob spongebob = new Spongebob();
        Patrick patrick = new Patrick();
        User user = new User();

        rules();

        System.out.println("Who would you like to play against? Type 1 for Spongebob or 2 for Patrick.");
        team = scan.nextInt();
        System.out.println();

        if (team == 1) {

            user.pick();
            spongebob.pick();

            if (spongebob.pick() == user.pick()){
                System.out.println("It's a tie!");
            } else if (spongebob.pick() == "R" && user.pick() == "P"){
                System.out.println("Spongebob wins!");
            } else if (spongebob.pick() == "P" && user.pick() == "R"){
                System.out.println("You win!");
            } else if (spongebob.pick() == "S" && user.pick() == "R"){
                System.out.println("You win!");
            } else if (spongebob.pick() == "R" && user.pick() == "S"){
                System.out.println("Spongebob wins!");
            }

        } else {

            user.pick();
            patrick.pick();

        }

    }

    public static void rules() {

        System.out.println("Hello! Let's play a game of Rock, Paper, Scissors.");
        System.out.println();
        System.out.println("Rules: ");
        System.out.println();
        System.out.println("Rock crushes Scissors.");
        System.out.println("Scissors cuts Paper.");
        System.out.println("And, for whatever reason, Paper covers Rock.");
        System.out.println();
    }
}
