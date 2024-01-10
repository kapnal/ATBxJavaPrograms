package src.oops_09_07Jan.inheritance;

public class Java extends Programming {

    String newFeature;

    Java(){
        System.out.println("Java DC");
    }

    Java(String feature){
        this.newFeature = feature;
    }

   void printInfo(){
        System.out.println("Feature is " + this.newFeature);

    }

}
