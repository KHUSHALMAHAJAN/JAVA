class parent {
    int x = 1;

    parent() {
        System.out.println("I am parent");
    }
}

class child extends parent {
    int x = 2;

    child() {
        super();
        System.out.println("I am child");
    }

    void display() {
        System.out.println("value in super class " + super.x);
        System.out.println("value in sub class " + this.x);
    }
}

public class usethis {
    public static void main(String args[]) {
        child objchild = new child();
        objchild.display();

    }
}
