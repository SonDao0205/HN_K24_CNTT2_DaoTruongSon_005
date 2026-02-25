package Cau1;

import java.util.Scanner;

public class Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < input.length(); i++){
            int count = 0;
            char letter = input.charAt(i);
            for (int j = i; j < input.length(); j++){
                if(letter != input.charAt(j)){
                    break;
                }
                count++;
            }
            i += count - 1;
            result.append(letter);
            result.append(count);
        }
        if(result.length() < input.length() ){
            System.out.println(result.toString());
        }else{
            System.out.println(input);
        }
    }
}


