package src.basics_01_10Dec;

public class Programming {

        int version;
        String author;
        Programming(){
            System.out.println("Programming DC");
        }

    Programming(String author,int version){
            this.author= author;
            this.version= version;
    }

    void printInfo(){
        System.out.println("Programming Info "+this.version+ " author "+this.author);

    }

    void bhk3(){
        System.out.println("bhk3");
    }




}
