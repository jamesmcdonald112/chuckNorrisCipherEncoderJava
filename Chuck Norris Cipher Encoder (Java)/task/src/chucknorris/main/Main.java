package chucknorris;

import chucknorris.binary.BinaryConversion;
import chucknorris.binary.ChuckNorrisTechnique;
import chucknorris.io.input.UserInputManager;
import chucknorris.io.output.PrintCharacters;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Get user input
        System.out.println("Input String");
        String input = UserInputManager.getStringInput();

        // Concatenate binary sequence of all characters
        StringBuilder binarySequence = new StringBuilder();
        for (char character : input.toCharArray()) {
            binarySequence.append(BinaryConversion.convertFromCharacterToBinary(character));
        }

        // Convert the binary sequence to Chuck Norris style encoding
        String chuckNorisEncoded =
                ChuckNorrisTechnique.convertBinaryStringToChuckNoris(binarySequence.toString());

        // Print the characters to the console.
        System.out.println("The result:");
        System.out.println(chuckNorisEncoded);

        // Close the scanner.
        UserInputManager.closeScanner();



    }
}