import java.util.Scanner;

class getinfor {
    int roll_no;
    String name;

    void gemahiti() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a roll no");
        roll_no = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a name");
        name = sc.nextLine();
    }

    void display() {
        System.out.println("roll no is :- " + roll_no);
        System.out.println("name is :- " + name);
    }
}

public class basicinfor {
    public static void main(String args[]) {
        getinfor array[] = new getinfor[3];

        for (int i = 0; i < 3; i++) {
            array[i] = new getinfor();
        }

        for (int i = 0; i < 3; i++) {
            array[i].gemahiti();
        }
        for (int i = 0; i < 3; i++) {
            array[i].display();
        }
    }
}
