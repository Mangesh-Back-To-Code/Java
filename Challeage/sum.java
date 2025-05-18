import java.util.Scanner;

public class sum {

    public static void main(String[] args) {
   Scanner input = new Scanner (System.in);
        System.out.println("Welcom to our calculator");
        System.out.print("please enter first number:  ");
        int firstNum = input.nextInt();
        System.out.print("Now please enter the second number:  ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("sum of your numbers is:  " + sum );// create a program to add two numbers my challeange complit
    }
}