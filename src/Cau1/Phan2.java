package Cau1;

import java.util.Scanner;

public class Phan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();
        StringBuilder result = new StringBuilder();
        String[] array =  input.split(" ");
        for (String s : array) {
            String[] splitLetter = s.split("");
            int left = 0;
            int right = splitLetter.length - 1;
            while (left < right) {
                String temp = splitLetter[left];
                splitLetter[left] = splitLetter[right];
                splitLetter[right] = temp;
                left++;
                right--;
            }
            for (String string : splitLetter) {
                result.append(string);
            }
            result.append(" ");
        }

        System.out.println(result.toString());
    }
}

//Lap trinh Java