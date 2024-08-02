package chucknorris.encode;

import chucknorris.io.input.UserInputManager;

public class EncodeHandler {

    /**
     * Handles all the logic for encoding a string
     */
    public static void encodeHandler() {
        // Get user input
        System.out.println("Input String");
        String input = UserInputManager.getStringInput();

        // Encoded the String
        String encoded = Encode.encode(input);

        System.out.println("Encoded string:");
        System.out.println(encoded);
    }
}
