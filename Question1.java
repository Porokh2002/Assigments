import java.util.Scanner;

//Write a simple String program to take input from user.
public class Question1{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Your Name");
        String str= scan.next();
        System.out.println("You have entered "+str);
        
    }
}