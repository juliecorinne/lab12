import java.util.Objects;
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

            String userPick = user.pick();
            String team1 = spongebob.pick();

            System.out.println("You picked " + userPick);
            System.out.println("Spongebob picked " + team1);
            System.out.println();

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

        } else {

            String userPick = user.pick();
            String team2 = patrick.pick();

            System.out.println("You picked " + userPick);
            System.out.println("Spongebob picked " + team2);
            System.out.println();

            if (Objects.equals(userPick, team2)) {
                System.out.println("It's a tie!");
            } else if (Objects.equals(userPick, "S") && Objects.equals(team2, "R")) {
                System.out.println("Patrick wins!");
            } else if (Objects.equals(userPick, "P") && Objects.equals(team2, "R")) {
                System.out.println("You win!");
            }

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
