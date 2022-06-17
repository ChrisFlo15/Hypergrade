import java.util.Scanner;

public class Question1
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = keyboard.nextInt();
        int answer = number + 1;
        System.out.println(number + " + 1 = " + answer);
    }
}
