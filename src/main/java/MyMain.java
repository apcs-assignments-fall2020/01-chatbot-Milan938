import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Add some code here!
        System.out.println("What's your name friend??????");
        String name = scan.next();
        System.out.println("Hello there " + name);
        System.out.println("What is you favorite color, " + name + "?");
        String color = scan.next();
        System.out.println(color + " is a great color!");
        System.out.println("What's your favorite sport?");
        String sport = scan.next();
        System.out.println("I love " + sport + " too!");
        System.out.println("How old are you " + name + " ?");
        int age = scan.nextInt();
        System.out.println("No way, my mom is " + age + " too.");
        System.out.println("Last question, what's your favorite food?");
        String food = scan.next();
        System.out.println("Oh, I'm actually allergic to " + food + " :(");
        System.out.println("So, just to be clear, your name is " + name + ", your favorite color is " + color
        + ", your favorite sport is " + sport + ", you are " + age + " years old, and your favorite food is " +
        food);
        scan.close();
    }
}
