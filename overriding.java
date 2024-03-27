class parent {
    void function() {
        System.out.println("A class parent");
    }
}

class child extends parent {
    void function() {
        System.out.println("A class of child");
    }
}

public class overriding {
    public static void main(String args[]) {
        child objchild = new child();
        objchild.function();
    }
}
