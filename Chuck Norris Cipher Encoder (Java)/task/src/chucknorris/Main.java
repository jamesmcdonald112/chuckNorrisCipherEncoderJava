package chucknorris;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input String");
        Scanner SCANNER = new Scanner(System.in);

        String input = SCANNER.nextLine();

        char[] characters = input.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            System.out.print(characters[i] + " ");
        }

    }
}