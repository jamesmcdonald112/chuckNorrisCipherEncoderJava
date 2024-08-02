## Chuck Norris Cipher Encoder/Decoder

This project provides a simple command-line interface to encode and decode messages using the Chuck Norris Cipher technique. 
The program supports three operations: encoding a string, decoding a string, and exiting the program.

## Features
	•	Encode: Converts a string to a binary representation and then encodes it using the Chuck Norris technique.
	•	Decode: Decodes a string encoded with the Chuck Norris technique back to its original text form.
	•	Validation: Ensures the encoded string is valid before attempting to decode it.
	•	User Interface: Provides a looped menu for the user to choose an operation or exit the program.

## How to Use
1.	Clone the repository:
 
 ```bash
git clone https://github.com/jamesmcdonald112/chuckNorrisCipherEncoderJava.git
cd chuckNorrisCipherEncoderJava/Chuck\ Norris\ Cipher\ Encoder\ \(Java\)/task/src/
```

2.	Compile the program:
 
 ```bash
javac chucknorris/main/Main.java 
```

3.	Run the program:

 ```bash
java chucknorris/main/Main.java
```

4.	Follow the on-screen instructions:

	•	To encode a message, type encode and enter the message.
	•	To decode a message, type decode and enter the encoded message.
	•	To exit the program, type exit.


## Example

```bash
Please input operation (encode/decode/exit):
> encode
Input string:
> Hello, World!
Encoded string:
0 0 00 0000 0 00 00 00 0 0 00 0000 0 0 00 0 0 0 00 00 00 00 00 0 00 0 0 0 0 00 000 0 00 00 0000 0 00 00 0000 0 000 00 00 0 0 00 0 0 0000 00 00 0 0 00 0 0 0 00 000 0 0

Please input operation (encode/decode/exit):
> decode
Input encoded string:
> 0 0 00 0000 0 00 00 00 0 0 00 0000 0 0 00 0 0 0 00 00 00 00 00 0 00 0 0 0 0 00 000 0 00 00 0000 0 00 00 0000 0 000 00 00 0 0 00 0 0 0000 00 00 0 0 00 0 0 0 00 000 0 0
Decoded string:
Hello, World!

Please input operation (encode/decode/exit):
> exit
Bye!
```

## License

This project is licensed under the MIT License.

## Conclusion
This project was similar to an encryption and decryption project I completed in college. I don't feel I learned anything new, but I did reenforce some good habits, like planning and making my code clear.
