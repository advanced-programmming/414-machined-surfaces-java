package com.co.pa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = Integer.parseInt(sc.nextLine());
            if(n == 0) break;
            int max = -1, total = 0;

            for(int i = 0 ; i < n ; ++i) {
                String line = sc.nextLine();
                int amountX= getAmountX(line);
                max = max < amountX ? amountX : max;
                total += amountX;
            }

            System.out.println( ((n - 1) * max ) - (total - max));
        }
    }

    public static int getAmountX(String array){
        char[] charArray = array.toCharArray();
        int length = charArray.length;
        int result = 0;

        for(int i = 0; i < length; i++) {
            if (charArray[i] == 'B') break;
            if (charArray[i] == 'X') result++;
        }

        for(int i = (length - 1); i > 0; i--) {
            if (charArray[i] == 'B') break;
            if (charArray[i] == 'X') result++;
        }
        return result;
    }
}
