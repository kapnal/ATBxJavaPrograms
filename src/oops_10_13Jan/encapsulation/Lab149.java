package src.oops_10_13Jan.encapsulation;

public class Lab149 {
    public static void main(String[] args) {
        // Hidden
        vwoLoginFixed vwoLogin = new vwoLoginFixed("admin","admin");
        // Hidden

        boolean check = vwoLogin.isLoggedIn("admin","password");
        String u =vwoLogin.getUsername();
        System.out.println(u);
        System.out.println(check);
        //String u = vwoLogin.getPassword();  //Not allowed declared private & not created getter & setter for password
       //vwoLogin.password = "?";
    }

}

class vwoLoginFixed {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;
    private String password;

    vwoLoginFixed(String u, String p) {
        this.password = p;
        this.username = u;
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
