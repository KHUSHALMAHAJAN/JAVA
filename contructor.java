import java.util.Scanner;

class demo {
    int num1, num2;
    String name;

    demo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name");
        name = sc.nextLine();
        System.out.println("Enter a number 1");
        num1 = sc.nextInt();
        System.out.println("Enter a number 2");
        num2 = sc.nextInt();
    }

    int add() {
        System.out.println("Your name is " + name);
        return num1 + num2;
    }
}

public class contructor {
    public static void main(String args[]) {
        demo obj = new demo();
        System.out.println("Ans is " + obj.add());
    }
}
