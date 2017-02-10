/**
 * Created by julieschneider on 2/10/17.
 */
// import java.util.Random;

public class Spongebob extends Player {

    @Override
    public String pick() {

        int n = (int) (Math.random() * 3 + 1);

        if (n == 1)
            return "R";
         else if (n == 2)
            return "P";
         else
            return "S";

    }

}
