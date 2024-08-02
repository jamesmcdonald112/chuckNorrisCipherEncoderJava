package chucknorris.io.output;

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
}
