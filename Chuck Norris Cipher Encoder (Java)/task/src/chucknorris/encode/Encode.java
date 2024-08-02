package chucknorris.encode;

import chucknorris.binary.BinaryConversion;
import chucknorris.binary.ChuckNorrisTechnique;

public class Encode {

    /**
     * Takes in a string, converts each character to binary and then further encodes to Chuck
     * Noris technique.
     *
     * @param input The input to be encoded.
     * @return The encode input as a string.
     */
    public static String encode(String input) {
        // Concatenate binary sequence of all characters
        StringBuilder binarySequence = new StringBuilder();
        for (char character : input.toCharArray()) {
            binarySequence.append(BinaryConversion.convertFromCharacterToBinary(character));
        }

        // Convert the binary sequence to Chuck Norris style encoding
        String chuckNorisEncoded =
                ChuckNorrisTechnique.convertBinaryStringToChuckNoris(binarySequence.toString());

        return chuckNorisEncoded.toString();
    }
}
