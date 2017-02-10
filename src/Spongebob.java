/**
 * Created by julieschneider on 2/10/17.
 */
// import java.util.Random;

public class Spongebob extends Player {

    @Override
    public void pick() {

        int n = (int) (Math.random() * 3 + 1);

        if (n == 1) {
            System.out.println("R");
        } else if (n == 2) {
            System.out.println("P");
        } else {
            System.out.println("S");
        }

    }

}
