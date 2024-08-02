package chucknorris.io.input;

import java.util.Scanner;

public class UserInputManager {

    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Gets the user input as a string.
     *
     * @return The user input as a string.
     */
    public static String getStringInput() {
        return SCANNER.nextLine();
    }

    /**
     * Close the scanner.
     */
    public static void closeScanner() {
        SCANNER.close();
    }
}
