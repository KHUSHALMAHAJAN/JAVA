import java.util.Scanner;

class add {
    int getfun(int nu1, int nu2) {
        return nu1 + nu2;
    }
}

public class returntype {
    public static void main(String args[]) {
        add obj = new add();
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a frist number");
        num1 = sc.nextInt();
        System.out.println("Enter a number");
        num2 = sc.nextInt();
        int sum = obj.getfun(num1, num2);
        System.out.println("Ans is " + sum);
    }
}
