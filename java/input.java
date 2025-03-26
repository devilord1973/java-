import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name: "+ name);
        System.out.println("enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age: "+ age);
        System.out.println("enter your room price :");
        double price = sc.nextFloat();
        System.out.println("room price is : "+ price);
    }
}