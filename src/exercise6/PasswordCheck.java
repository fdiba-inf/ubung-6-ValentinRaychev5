package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        do {
            String password = input.next();
            int digitcounter = 0;
            boolean valid = false;

            if (password.length() < 8)   {
                valid = false;
                continue;
            }
            else  {
                for (int i = 0; i < password.length(); i++)  {
                    if (Character.isDigit(password.charAt(i)))   {
                        digitcounter++;
                    }
                    if (!Character.isLetterOrDigit(password.charAt(i))) {
                        valid = false;
                        break;
                    }
                }
            }
            if (digitcounter >= 2)   {
                break;
            }

        } while(true);

        System.out.println("Password valid!");
    }
}
