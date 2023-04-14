package util;

import java.util.Scanner;

public class InputUtil {

    public static String requireText(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.print(title + ":");
        String answer = sc.next();
        return answer;
    }

    public static int requireNumber(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.print(title + ":");
        int answer = sc.nextInt();
        return answer;
    }

}
