package ru.study.task;

import module java.base;
import ru.study.service.ReverseString;

public class ReverseLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ReverseString reverser = new ReverseString();

        System.out.println("enter a string: ");
        String originalString = input.nextLine();

        String reversed = reverser.reverseLetters(originalString);

        System.out.println("reversed string: " + reversed);
        System.out.println("original string: " + originalString);
    }
}