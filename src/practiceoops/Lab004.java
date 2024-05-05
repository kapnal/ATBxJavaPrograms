package src.practiceoops;

public class Lab004 {
    public static void main(String[] args) {
         //Hidden
        vwoLoginFixed vwoLogin = new vwoLoginFixed("admin","password");
        //Hidden

        boolean check = vwoLogin.isLoggedIn("admin","admin");
        String u = vwoLogin.getUsername();
       // String p = vwoLogin.getPassword();  Not allowed because of Encapsulation password is private
        //vwoLogin.password = "test123";

        System.out.println(u);
        System.out.println(check);


    }

}

class vwoLoginFixed {

    private String username;
    private String password;

    //Create Getter and Setter only for username so that we can access & Change this in main method

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }




    vwoLoginFixed(String username, String password) {
        this.username = username;
        this.password = password;
    }

    boolean isLoggedIn(String username, String password) {
        if(this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password)){

            System.out.println("Logged In!!");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }

    }

}

