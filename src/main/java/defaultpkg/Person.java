package defaultpkg;

public class Person implements Intro_Java_23_Interfaces{        // o clasa poate implementa mai multe interfete, separate prin virgula
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello !");
    }

    @Override
    public void showInfo() {
        System.out.println("The person name is: " + name);
    }
}
