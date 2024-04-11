import java.util.*;
//import java.util.Scanner;
class myexception extends Exception{
   myexception(){
     super("age not valid");
  }
}
class simple {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("starting a program");
        try {
            System.out.println("Enter your age");
            int age = sc.nextInt();
            if(age<18){
              throw new myexception();
              }
            System.out.println("enter the first number");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number");
            int num2 = sc.nextInt();
            int div = num1 /num2;
            System.out.println("Ans is " + div);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException occurred");
            System.out.println(e.getMessage());
            // Clearing the invalid input
            sc.nextLine();
        }
         catch(ArithmeticException e){
            System.out.println("Arithmathic Exception get");
            sc.nextLine();
         }
          catch(Exception e)
         {
            System.out.println(e.getMessage());
            sc.nextLine();
          }
        System.out.println("end of program");
    }
}