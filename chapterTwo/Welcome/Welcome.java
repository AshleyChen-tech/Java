package Welcome;


/**
 * This program displays a greeting for the reader.
 * @version 23.0.1 2025.1.9
 * @author Ashley Chen
 */
public class Welcome {
    public static void main(String[] args) {
        String greeting = "Welcome to Core Java!";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++) {
            System.out.println("=");
        System.err.println();
        }
    }
}
