package src.oops_10_13Jan.accessModifiers.criminal;

import src.oops_10_13Jan.accessModifiers.police.Cop;

public class Thief {
    public static void main(String[] args) {

        Cop cop = new Cop(10);
        System.out.println(cop.gun);
        //cop.canIShoot();  //this not allowed as it is protected and we are accessing the outside the police folder
    }
}
