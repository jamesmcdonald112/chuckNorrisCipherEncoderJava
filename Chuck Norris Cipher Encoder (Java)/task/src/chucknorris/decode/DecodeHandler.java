package chucknorris.decode;

import chucknorris.io.input.UserInputManager;

public class DecodeHandler {

    /**
     * Handles all the logic for decoding an encoded string
     */
    public static void decodeHandler() {
        System.out.println("Input encoded string:");
        String encoded = UserInputManager.getStringInput();

        try {
            // Decode the string
            String decode = Decode.decode(encoded);

            // Output result
            System.out.println("Decoded string:");
            System.out.println(decode);
        } catch (IllegalArgumentException e) {
            System.out.println("Encoded string is not valid.");
        }

    }
}
