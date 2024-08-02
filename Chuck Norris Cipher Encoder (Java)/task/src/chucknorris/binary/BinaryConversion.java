package chucknorris.binary;

public class BinaryConversion {

    /**
     * Converts a character to a binary number, first by getting the ascii value and then
     * converting that using a helper method. The binary number is returned and padded.
     *
     * @param character The character to be converted.
     * @return The binary string.
     */
    public static String convertFromCharacterToBinary(char character) {
        // Convert the character to an ASCII value
        int asciiValue = character;
        String binaryString = convertToBinaryString(asciiValue);
        return padBinaryString(binaryString, 7);
    }

    /**
     * Converts the ascii value to a binary string.
     *
     * @param value The ascii value to be converted
     * @return The binary value.
     */
    private static String convertToBinaryString(int value) {
        // StringBuilder for storing the binary string
        StringBuilder binaryString = new StringBuilder();

        // Manually convert the ASCII value to a binary string
        int currentValue = value;
        while (currentValue > 0) {
            if (currentValue % 2 == 0) {
                binaryString.append('0');
            } else {
                binaryString.append('1');
            }
            currentValue = currentValue /2;
        }
        // Reverse the binary string since the least significant bit is appended first
        return binaryString.reverse().toString();
    }

    /**
     * Pads the start of the binary string with '0's up to the specified length.
     *
     * @param binaryString The binary string to be padded
     * @param length The length of the string after padding
     * @return The padded binary string.
     */
    private static String padBinaryString(String binaryString, int length) {
        StringBuilder paddedBinaryString = new StringBuilder(binaryString);

        // Pad the binary string with leading zeros to ensure it is 8 bits long
        while (paddedBinaryString.length() < length) {
            paddedBinaryString.insert(0, '0');
        }
        return paddedBinaryString.toString();
    }

}
