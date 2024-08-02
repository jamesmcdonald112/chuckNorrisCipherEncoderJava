package chucknorris;

import chucknorris.io.input.UserInputManager;
import chucknorris.io.output.PrintCharacters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Get user input
        System.out.println("Input String");
        String input = UserInputManager.getStringInput();

        // Convert user input to array of characters.
        char[] characters = input.toCharArray();

        // Print the characters to the console.
        System.out.println("The result");
        PrintCharacters.printCharactersAsBinary(characters);

        // Close the scanner.
        UserInputManager.closeScanner();

    }
}