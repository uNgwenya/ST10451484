/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginapplication2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginApplication2 {

    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        
        if (checkUserName(username) && checkPasswordComplexity(password)) {
            System.out.println("Welcome " + firstName + ", " + lastName + " it is great to see you again.");
        } else {
            System.out.println("Username or password incorrect, please try again.");
        }
        
    }
    
    private static boolean checkUserName(String username) {
        if (username.contains("_") && username.length() <= 5) {
            System.out.println("Username successfully captured");
            return true;
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");
            return false;
        }
    }
    
    private static boolean checkPasswordComplexity(String password) {
        Pattern pattern = Pattern.compile("^(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[@#$%^&+=])(?=\\S+$).{8,}$");
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Password successfully captured");
            return true;
        } else {
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
            return false;
        }
    }
    
}

