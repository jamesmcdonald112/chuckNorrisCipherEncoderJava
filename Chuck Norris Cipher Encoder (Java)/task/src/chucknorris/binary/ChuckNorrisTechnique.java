package chucknorris.binary;

public class ChuckNorrisTechnique {

    /**
     * Converts the binary string to an encoded Chuck Noris string. The binary sequence is looped
     * through and each character is further encoded.
     *
     * @param binarySequence The binary sequence to encode as a String.
     * @return The encoded binary sequence as a string.
     */
    public static String convertBinaryStringToChuckNoris(String binarySequence) {
        StringBuilder chuckNoris = new StringBuilder();

        // Start with a character to reference
        char previousChar = binarySequence.charAt(0);

        // Keep track of the amount of 1s or 0s in a row
        int count = 0;


        for (int i = 0; i < binarySequence.length(); i++) {
            char currentChar = binarySequence.charAt(i);
            if (currentChar == previousChar) {
                count++;
            } else {
                appendChuckNorrisBlock(chuckNoris, previousChar, count);
                previousChar = currentChar;
                count = 1;
            }

        }

        appendChuckNorrisBlock(chuckNoris, previousChar, count);
        return chuckNoris.toString().trim();
    }

    /**
     * Takes in the chuck noris string builder to be adjusted, the bit to check and the amount of
     * zeros to add. The method checks if there is anything in the Stringbuilder, if not it appends
     * an empty space for formatting. Next it checks the bit and appends the correct amount of
     * zeros to represent the binary digit, 1 = 0  and 0 = 00. Finally, it adds the correct
     * amount of zeros to represent the count of binary digits in a row.
     *
     * @param chuckNoris The block to be appended.
     * @param bit The bit to convert.
     * @param count The amount of bits to add as zeros.
     */
    private static void appendChuckNorrisBlock(StringBuilder chuckNoris, char bit, int count) {
        // Add a space
        if (chuckNoris.length() > 0) {
            chuckNoris.append(" ");
        }

        // Add the correct amount of zeros based on the bit.
        if (bit == '1') {
            chuckNoris.append("0 ");
        } else {
            chuckNoris.append("00 ");
        }

        // Add the amount of zeros representing same binary digit in a row
        for (int i = 0; i < count; i++) {
            chuckNoris.append("0");
        }
    }
}
