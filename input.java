import java.util.Scanner;

class getnum {
    int num1, num2;

    void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1");
        num1 = sc.nextInt();
        System.out.println("Enter a second number");
        num2 = sc.nextInt();
    }

    int addfun() {
        return (num1 + num2);
    }
}

public class input {
    public static void main(String args[]) {
        getnum obj = new getnum();
        obj.get();
        int sum = obj.addfun();
        System.out.println("ans is " + sum);
    }
}
