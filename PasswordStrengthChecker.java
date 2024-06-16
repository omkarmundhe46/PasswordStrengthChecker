package Task2;

import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        System.out.println("Welcome to PasswordStrengthChecker");
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre your password : ");
        String str = sc.nextLine();

        if (str.contains(" ")){
            System.out.println("Invalid Password...");
            return;
        }

        boolean hasatleast8character = str.length() >= 8;
        boolean hasuppercase = false;
        boolean haslowercase = false;
        boolean hasdigit = false;
        boolean hasspecialsymbol = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)){
                hasuppercase = true;
            }else if (Character.isLowerCase(ch)){
                haslowercase = true;
            }else if (Character.isDigit(ch)){
                hasdigit = true;
            }else{
                hasspecialsymbol = true;
            }
        }

        if (hasuppercase && haslowercase && hasdigit && hasspecialsymbol && hasatleast8character){
            System.out.println( "It Is Strong Password..." );
        }else {
            System.out.println( "It Is Weak Password..." );
        }
        sc.close();
    }
}
