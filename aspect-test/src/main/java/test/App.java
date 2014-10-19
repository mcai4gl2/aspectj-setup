package test;

public class App {

    public void hello(String name) {
        System.out.println(name);
    }

    public static void helloStatic(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        App app = new App();
        App.helloStatic("hello ");
        app.hello("world");
    }
}