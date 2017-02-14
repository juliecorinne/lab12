import java.util.Objects;
import java.util.Scanner;

/**
 * Created by julieschneider on 2/10/17.
 */
public class User extends Player {


    @Override
    public Roshambo pick() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Great! Alright, now, Rock, Paper, or Scissors? Please type R, P, or S: ");
        String pick = Validator.letterValidator();
        System.out.println();

        if (pick.equalsIgnoreCase("R"))
            return Roshambo.Rock;
        else if (pick.equalsIgnoreCase("P"))
            return Roshambo.Paper;
        else if (pick.equalsIgnoreCase("S"))
            return Roshambo.Scissors;

        return Roshambo.valueOf(pick);


//        if (Objects.equals(pick, "R")) {
//            return Roshambo.Rock;
//        } else if (Objects.equals(pick, "P")) {
//            return Roshambo.Paper;
//        } else {
//            return Roshambo.Scissors;
//        }

        //above is only able to recognize capital letters

    }


}
