package excercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args ) {

        System.out.println("What is your name?");
        Scanner myName = new Scanner(System.in);
        String username = myName.nextLine();
        System.out.println("Hello, " + username);

    }
}
