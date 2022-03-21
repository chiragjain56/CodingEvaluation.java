package Unit4C2.q1;


public class Main {
    public static void main(String[] args) {
        InterfaceThree obj = new ClassTwo();
        System.out.println(obj);
        obj.methodOne();
        obj.methodTwo();
        obj.methodThree();
        InterfaceOne obj2 = new ClassTwo();
        obj2.methodOne();

        obj2 = (InterfaceOne)obj2;
        obj.methodThree();
        obj.methodTwo();
    }
}
