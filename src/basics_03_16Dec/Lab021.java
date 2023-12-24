package src.basics_03_16Dec;

public class Lab021 {
    public static void main(String[] args) {
        //Interview Question - Relational operator
        System.out.println(10==10);
        System.out.println(10>=10);
        System.out.println(10<=10);
        System.out.println(10>10);
        System.out.println(10<10);

        System.out.println('A' ==65);  //ASCII
        System.out.println('A');
        //System.out.println('A'=3); not allowed
        byte b=65;
        System.out.println('A' ==b);
        System.out.println('A' ==65.0);//This is property of java
        System.out.println('A' ==65.0f);
        System.out.println('A' ==65.2);
        //System.out.println(true ==0);
    }
}
