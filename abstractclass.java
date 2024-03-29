abstract class demo {
    void show() {
        System.out.println("thi not abstract");
    }

    abstract public void display();
}

class child extends demo {
    public void display() {
        System.out.println("this method is abstract");
    }
}

public class abstractclass {
    public static void main(String args[]) {
        child obj = new child();
        obj.display();
        obj.show();
    }
}
