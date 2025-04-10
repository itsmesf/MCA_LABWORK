package LMS;

interface a{
    void display();
}

class A implements a{
    public void display(){
        System.out.println ("Class method" );
    }
}
public class Test {

    public static void main ( String[] args ) {
        a obj;
        obj = new A();

        obj.display ();
    }
}
