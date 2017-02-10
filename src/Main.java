import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int team;
        Spongebob spongebob = new Spongebob();
        Patrick patrick = new Patrick();
        User user = new User();
        String userInput;


        rules();

        System.out.println("Who would you like to play against? Type 1 for Spongebob or 2 for Patrick.");
        team = scan.nextInt();
        System.out.println();

        do {

        playGame(team, spongebob, patrick, user);

            System.out.println("Would you like to play again? y/n");
            scan.nextLine();
            userInput = scan.nextLine();

        } while (userInput.equalsIgnoreCase("y"));

        System.out.println("Thanks for playing!");

    }

    public static void playGame(int team, Spongebob spongebob, Patrick patrick, User user) {

        if (team == 1) {

            String userPick = user.pick();
            String team1 = spongebob.pick();

            System.out.println("You picked " + userPick);
            System.out.println("Spongebob picked " + team1);
            System.out.println();

            spongebobIfElse(userPick, team1);

        } else {

            String userPick = user.pick();
            String team2 = patrick.pick();

            System.out.println("You picked " + userPick);
            System.out.println("Patrick picked " + team2);
            System.out.println();

            patrickIfElse(userPick, team2);

        }
    }

    public static void patrickIfElse(String userPick, String team2) {

        if (Objects.equals(userPick, team2)) {
            System.out.println("It's a tie!");
        } else if (Objects.equals(userPick, "S") && Objects.equals(team2, "R")) {
            System.out.println("Patrick wins!");
        } else if (Objects.equals(userPick, "P") && Objects.equals(team2, "R")) {
            System.out.println("You win!");
        }
        System.out.println();
    }

    public static void spongebobIfElse(String userPick, String team1) {

        if (Objects.equals(userPick, team1)) {
            System.out.println("It's a tie!");
        } else if (Objects.equals(userPick, "R") && Objects.equals(team1, "S")) {
            System.out.println("You win!");
        } else if (Objects.equals(userPick, "S") && Objects.equals(team1, "R")) {
            System.out.println("Spongebob wins!");
        } else if (Objects.equals(userPick, "P") && Objects.equals(team1, "S")) {
            System.out.println("Spongebob wins!");
        } else if (Objects.equals(userPick, "S") && Objects.equals(team1, "P")) {
            System.out.println("You win!");
        } else if (Objects.equals(userPick, "P") && Objects.equals(team1, "R")) {
            System.out.println("You win!");
        } else if (Objects.equals(userPick, "R") && Objects.equals(team1, "P")) {
            System.out.println("Spongebob wins!");
        }
        System.out.println();
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
