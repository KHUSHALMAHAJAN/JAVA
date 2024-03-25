class getnum1 {
    int num1;

    getnum1(int n1) {
        num1 = n1;
    }
}

class getnum2 extends getnum1 {
    int num2;

    getnum2(int n1, int n2) {
        super(n1);
        num2 = n2;
    }

    void display() {
        System.out.println("frist value is " + num1);
        System.out.println("second value is " + num2);
    }
}

public class usesuper {
    public static void main(String args[]) {
        getnum2 obj = new getnum2(2, 6);
        obj.display();
    }
}