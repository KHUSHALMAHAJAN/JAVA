interface parent {
    int x = 5;

    void display();
}

class child implements parent {
    public void display() {
        System.out.println("sucessfully display");
    }
}

public class interfaceclass {
    public static void main(Strgiting args[]) {
        child obj = new child();
        obj.display();
    }
}
