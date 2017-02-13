import java.util.Scanner;

/**
 * Created by julieschneider on 2/13/17.
 */
public class Validator {

    public static int rangeValidator(){
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()){
            scan.nextLine();
            System.out.println("Please enter a number!");
        }

        return scan.nextInt();

    }

    public static int rangeValidator(int min, int max){

        Scanner scan = new Scanner(System.in);

        int input = rangeValidator();

        while (input < min || input > max){
            System.out.println("Please enter a valid number!");
            input = rangeValidator();
        }

        return input;
    }

}
