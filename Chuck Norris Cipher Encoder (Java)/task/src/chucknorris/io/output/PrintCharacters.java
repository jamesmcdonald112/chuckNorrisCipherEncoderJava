package chucknorris.io.output;

import chucknorris.binary.BinaryConversion;

public class PrintCharacters {

    /**
     * Prints characters with a space between.
     *
     * @param characters The characters to be printed.
     */
    public static void printCharacter(char[] characters) {
        for (int i = 0; i < characters.length; i++) {
            System.out.print(characters[i] + " ");
        }
    }

    /**
     * Prints the character and its binary number
     *
     * @param characters The characters to be printed.
     */
    public static void printCharactersAsBinary(char[] characters) {
        for (int i = 0; i < characters.length; i++) {
            String characterAsBinary = BinaryConversion.convertFromCharacterToBinary(characters[i]);
            System.out.println(characters[i] + " = " + characterAsBinary);
        }
    }
}
