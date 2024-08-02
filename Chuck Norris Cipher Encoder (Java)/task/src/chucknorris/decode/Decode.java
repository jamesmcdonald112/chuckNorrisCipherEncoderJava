package chucknorris.decode;

public class Decode {

    /**
     * Handles the logic for decoding and encoded string.
     *
     * @param encodedString The string to be decoded
     * @return Returns the string decoded.
     */
    public static String decode(String encodedString) {
        if (!DecodeValidator.isValidEncodedString(encodedString)) {
            throw new IllegalArgumentException("Invalid encoded string");
        }
        String binaryString = decodeToBinary(encodedString);

        if (!DecodeValidator.isValidBinaryStringLength(binaryString)) {
            throw new IllegalArgumentException("Invalid binary string length");
        }
        return binaryToText(binaryString);
    }

    /**
     * Converts the encoded string to binary.
     *
     * @param encodedString The string to be converted to binary
     * @return The binary string.
     */
    private static String decodeToBinary (String encodedString) {
        // Store the decoded binary string
        StringBuilder binary = new StringBuilder();

        // Split the encoded string into blocks
        String[] encodedBlocks = encodedString.split(" ");

        // Iterate over the encoded block in groups of 2
        for (int i = 0; i < encodedBlocks.length - 1; i += 2) {
            String firstBlock = encodedBlocks[i];
            String secondBlock = encodedBlocks[i + 1];

            // Check of the first block represents a 1 or zero
            char bit = firstBlock.length() == 1 ? '1' : '0';
            int amount = secondBlock.length();

            for (int j = 0; j < amount; j++) {
                binary.append(bit);
            }
            
        }

        return binary.toString();
    }

    /**
     * Converts the binary string to text.
     *
     * @param binary The binary string to be converted
     * @return The text as a string.
     */
    private static String binaryToText(String binary) {
        // Store the converted binary
        StringBuilder result = new StringBuilder();

        // Iterate through the binary code 7 digits at a time.
        for (int i = 0; i < binary.length(); i += 7) {
            // Substring of 7 binary digits
            String byteString = binary.substring(i, Math.min(i + 7, binary.length()));
            // Converts the byte string to unicode char
            int charCode = Integer.parseInt(byteString, 2);
            // append to the result
            result.append((char)(charCode));

        }
        return result.toString();
    }
}
