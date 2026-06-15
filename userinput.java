import java.util.Scanner;


public class userinput {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = scn.nextLine();
        System.out.println("Enter Your Age : ");
        int age = scn.nextInt();
        System.out.println("your age : "+ age);
        boolean isstudent =scn.nextBoolean();
        System.out.println("Are you a student?? : "+ isstudent);

        System.out.println("Hello, " + name + "!");
        System.out.println("You are "+ age + " years old");

        scn.close();
    }
}
