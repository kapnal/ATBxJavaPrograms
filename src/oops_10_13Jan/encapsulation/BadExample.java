package src.oops_10_13Jan.encapsulation;

public class BadExample {
    public static void main(String[] args) {
        vwoLogin vwoLogin = new vwoLogin("admin","admin");
        // admin and admin

        boolean check = vwoLogin.isLoggedIn("admin","password");
        vwoLogin.setUsername("admin");//For username we allowed both getter & setter
        vwoLogin.getUsername();//For username we allowed both getter & setter
       // vwoLogin.setPassword("admin");//For password we only allowed getter not setter for securing
       vwoLogin.getPassword();
        //vwoLogin.password = "password";  //As username & password private so we can not access outside the function
        System.out.println(check);

        boolean check2 = vwoLogin.isLoggedIn("admin","password");

        System.out.println(check2);


    }

}

class vwoLogin{
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;

    public String getPassword() {
        return password;
    }

    private String password;
    public vwoLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    boolean isLoggedIn(String username, String password) {
        if (this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password)) {
            System.out.println("Logged IN!!");
            return true;
        } else {
            System.out.println("Wrong");
            return false;

        }


    }

}
