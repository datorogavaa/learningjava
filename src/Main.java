import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        Integer Age = scanner.nextInt();

        System.out.println("Enter your name: ");
        String name = scanner.next();

        System.out.println("You are " + Age + "years old");
        System.out.println("You are name is " + name );


        scanner.close();

    }}
