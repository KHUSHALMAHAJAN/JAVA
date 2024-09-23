import java.util.*;

class PrintAsciiValueExample1 {
    void fun() {
        // character whose ASCII value to be found
        Scanner sc = new Scanner(System.in);
        char ch1 = sc.next().charAt(0);
        char ch2 = 'b';
        // variable that stores the integer value of the character
        int asciivalue1 = ch1;
        int asciivalue2 = ch2;
        System.out.println("The ASCII value of " + ch1 + " is: " + asciivalue1);
        System.out.println("The ASCII value of " + ch2 + " is: " + asciivalue2);
    }
}

class ASCII {
    public static void main(String[] args) {
        PrintAsciiValueExample1 obj = new PrintAsciiValueExample1();
        obj.fun();
    }
}