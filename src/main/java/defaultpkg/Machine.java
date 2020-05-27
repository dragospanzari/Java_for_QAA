package defaultpkg;

public class Machine implements Intro_Java_23_Interfaces{
    private int id = 7;
    public void start()
    {
        System.out.println("Machine Started ! ");
    }

    @Override
    public void showInfo() {
        System.out.println("Machine id is: " + id);
    }
}
