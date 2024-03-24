class parent {
    void parentfun() {
        System.out.println("I know c,c++");
    }
}

class child extends parent {
    void childfun() {
        System.out.println("I learn c,c++ but i know also core java");
    }
}

public class inheritances {
    public static void main(String agrs[]) {
        child objChild = new child();
        objChild.parentfun();
        objChild.childfun();
    }
}