import java.util.Scanner;

public class App {

    public static void main (String[] args) {
        String result;
        Scanner scan = new Scanner(System.in);
        System.out.println ("Please enter the test who to have replaced: ");
        String text = scan.nextLine();
        System.out.println ("Would you like to replace some text? y/n ");
        String replace = scan.nextLine();
        if (replace.equals("y")) {
            System.out.println ("What character would you like to replace? ");
            char aChar = scan.next().charAt(0);
            System.out.println ("What would you like " + text + " to be replaced with? ");
            char anotherChar = scan.next().charAt(0);
            result = Replacer.aParser().with(text).replaces(aChar).by(anotherChar);

        } else {
            result = Surrounder.aParser().with(text).replaces('[').by(']');
        }
        System.out.println(result);
    }
}
