package chucknorris.menu;

import chucknorris.decode.DecodeHandler;
import chucknorris.encode.EncodeHandler;
import chucknorris.io.input.UserInputManager;

public class Menu {

    /**
     * Runs a menu on a loop where the user is asked to select an option from the menu or to exit.
     */
    public void menu() {
        boolean running = true;
        while (running) {
            System.out.println("Please input operation (encode/decode/exit):");

            String userInput = UserInputManager.getStringInput();

            switch (userInput) {
                case "encode" -> {
                    EncodeHandler.encodeHandler();
                }
                case "decode" -> {
                    DecodeHandler.decodeHandler();
                }
                case "exit" -> {
                    System.out.println("Bye!");
                    running = false;
                }
                default -> System.out.println("There is no '" + userInput + "' operation");
            }
        }
    }
}