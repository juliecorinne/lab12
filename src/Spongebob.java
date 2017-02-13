/**
 * Created by julieschneider on 2/10/17.
 */
// import java.util.Random;

public class Spongebob extends Player {

    @Override
    public Roshambo pick() {

        int n = (int) (Math.random() * 3 + 1);

        if (n == 1)
            return Roshambo.Rock;
         else if (n == 2)
            return Roshambo.Paper;
         else
            return Roshambo.Scissors;

    }

}
