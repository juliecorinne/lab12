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

    public static String letterValidator() {

        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextLine()) {
            scan.nextLine();
            System.out.println("Please enter R, P, or S!");

        }

        return scan.nextLine();

    }

    // attempt to validate R P S

    public static String letterValidator(String r, String p, String s){
        Scanner scan = new Scanner(System.in);
        String input = " ";
        r = "r";
        p = "p";
        s = "s";

        while(!input.equalsIgnoreCase(r) || !input.equalsIgnoreCase(p) || !input.equalsIgnoreCase(s)){
            System.out.println("Please enter R, P, or S!");
            input = letterValidator();
        }

        return input;

    }



}
