package chucknorris.decode;

public class DecodeValidator {

    /**
     * Ensures the encoded string has the correct symbols, has the right amount of blocks and
     * checks that each block is correct.
     *
     * @param encodedString The string to be validated.
     * @return True if it is valid; false otherwise.
     */
    public static boolean isValidEncodedString(String encodedString) {
        // Checks if the encoded string contains only '0' and spaces
        if (!encodedString.matches("[0 ]+")) {
            return false;
        }

        // Split encoded string into blocks
        String[] blocks = encodedString.split(" ");

        // Check if the number of blocks is even
        if (blocks.length % 2 != 0) {
            return false;
        }

        // Check each pair of blocks
        for (int i = 0; i < blocks.length; i += 2) {
            if (!(blocks[i].equals("0") || blocks[i].equals("00")) || !blocks[i + 1].matches("0+")) {
                return false;
            }
        }
        return true;
    }

    /**
     * Validate the length of the binary string.
     *
     * @param binaryString The binary string to validate.
     * @return True if the binary string length is a multiple of 7, otherwise false.
     */
    public static boolean isValidBinaryStringLength(String binaryString) {
        return binaryString.length() % 7 == 0;
    }
}
