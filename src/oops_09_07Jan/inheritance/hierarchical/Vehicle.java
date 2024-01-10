package src.oops_09_07Jan.inheritance.hierarchical;

public class Vehicle {

    Vehicle(){
        System.out.println("DC Vehicle");
    }

    void vehicleHasTopSpeed(){

        System.out.println("Yeah from "+getClass().getSimpleName());
    }
}
