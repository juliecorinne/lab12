import java.util.Objects;
import java.util.Scanner;

/**
 * Created by julieschneider on 2/10/17.
 */
public class User extends Player {


    @Override
    public String pick() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Great! Alright, now, Rock, Paper, or Scissors? Please type R, P, or S: ");
        String pick = scan.nextLine();
        System.out.println();

        if (Objects.equals(pick, "R")) {
            return "R";
        } else if (Objects.equals(pick, "P")) {
            return "P";
        } else {
            return "S";
        }

    }


}
