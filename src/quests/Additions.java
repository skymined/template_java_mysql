package quests;

import java.util.Scanner;

public class Additions {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int intFirst = scanner.nextInt();
        int intSecond = scanner.nextInt();
        int int_sum = intFirst + intSecond;
        System.out.println("두 숫자의 합: " + int_sum);
    }
}
