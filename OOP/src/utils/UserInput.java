package utils;

import java.util.Scanner;

public class UserInput {
    private static Scanner sc = new Scanner(System.in);

    public static int inputInt(String helpMsg) {
        System.out.print(helpMsg);
        return sc.nextInt();
    }

    public static float inputFloat(String helpMsg) {
        System.out.print(helpMsg);
        return sc.nextFloat();
    }

    public static boolean userAgree(String helpMsg) {
        System.out.print(helpMsg);
        String choice = sc.next();
        choice = choice.toLowerCase();

        return choice.startsWith("y");
    }
}
