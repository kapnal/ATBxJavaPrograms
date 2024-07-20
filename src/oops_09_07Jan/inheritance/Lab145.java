package src.oops_09_07Jan.inheritance;

public class Lab145 {
    public static void main(String[] args) {

        Programming p = new Programming("Collection Framework",18);
        p.printInfo();
        Java j = new Java("OOPS");
        j.printInfo();
//       Programming p2 = new Java();
//        // Java j2 = new Programming();  //This is invalid -Child Reference can not have parent object

//        Java j1 = new Java();
//         j1.car();
//         j1.bhk3();

//         Python p1 = new Python();
//         p.bhk3();


    }
}
