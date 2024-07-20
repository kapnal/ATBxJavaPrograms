package src.practiceString;

public class Car implements Engine,Break{

    void Start(){
        startEngine();
        Breaks();
        System.out.println("Starting the Car");
    }
    @Override
    public void startEngine() {
        System.out.println("Started Engine");
    }

    @Override
    public void Breaks() {
        System.out.println("Break is working fine");
    }
}
