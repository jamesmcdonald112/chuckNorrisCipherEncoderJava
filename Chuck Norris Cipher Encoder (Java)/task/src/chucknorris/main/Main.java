package chucknorris;

import chucknorris.decode.Decode;
import chucknorris.encode.Encode;
import chucknorris.io.input.UserInputManager;
import chucknorris.menu.Menu;

public class Main {

    /**
     * Runs the program.
     *
     * @param args
     */
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menu();

        // Close the scanner.
        UserInputManager.closeScanner();

    }

}