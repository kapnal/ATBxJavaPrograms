package src.practiceoops;

public class Car implements Engine,Break{

    void start(){
        System.out.println("Starting the car");
        StartEngine();
        breakes();

    }
    @Override
    public void StartEngine() {
        System.out.println("Started Engine");
    }

    @Override
    public void breakes() {
        System.out.println("Break is working fine");

    }
}
