import java.util.Scanner;

public class UserInput{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // input  ke liye is line ko yuj kiya jata hy 
        System.out.print("Please enter your name:  "); //yha hm output kar rhe 
         String name = input.nextLine();   // yha hm input kar rhe hy 
         System.out.println("Good Morning "  + name);
         System.out.print(name + " Also tell me your age ");
         int age = input.nextInt(); //yha hm variable ki valu le rhe hy
         System.out.println("Your age is:  "  + age);
         
    }

    
}