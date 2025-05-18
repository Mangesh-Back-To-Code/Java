import java.util.Scanner;

public class Welcom2 {

public static void main(String[] args) {

    System.out.print(" please enter your name:  ");
    Scanner input  = new Scanner (System.in);
    String name = input.nextLine();
    System.out.println("welcom "  + name + " to  kg coding");
}

}