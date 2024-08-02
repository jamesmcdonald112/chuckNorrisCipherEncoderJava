package chucknorris;

import chucknorris.decode.Decode;
import chucknorris.encode.Encode;
import chucknorris.io.input.UserInputManager;

public class Main {
//    public static void main(String[] args) {
//        // Get user input
//        System.out.println("Input String");
////        String input = UserInputManager.getStringInput();
//        String input = "CC";
//
//        // Encoded the String
//        String encoded = Encode.encode(input);
//
//        // Decode the string
//        String decode = Decode.decode(encoded);
//
//        // Output result
//        System.out.println(decode);
//
//        // Close the scanner.
//        UserInputManager.closeScanner();
//
//    }

    public static void main(String[] args) {
        System.out.println("Input encoded string:");
        String input = UserInputManager.getStringInput();

        System.out.println("The result:");
        System.out.println(Decode.decode(input));
    }
}