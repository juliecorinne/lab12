import java.util.Scanner;

/**
 * Created by julieschneider on 2/10/17.
 */
public class User extends Player {


    @Override
    public void pick() {
        Scanner scan = new Scanner(System.in);


        System.out.println("Great! Alright, now, Rock, Paper, or Scissors? Please type R, P, or S: ");
        char pick = scan.next().charAt(0);
        System.out.println();

        if (pick == 'R') {
            System.out.println("R");
        } else if (pick == 'P') {
            System.out.println("P");
        } else {
            System.out.println("S");
        }

    }


}
