import service.ReverseString;

import java.util.Scanner;

public void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ReverseString reverser = new ReverseString();

    System.out.println("enter a string: ");
    String originalString = input.nextLine();

    String reversed = reverser.reverseLetters(originalString);

    System.out.println("reversed string: " + reversed);
    System.out.println("original string: " + originalString);
}