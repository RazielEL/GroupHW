package GH2;

class Registration {

    private String email;
    private String userName;
    private String password;

    void setEmail(String email){
        if (email.contains("yahoo")){
            System.out.println(email + " - email is valid");
        } else {
            System.out.println(email + " email is invalid");
        }

    }

    void setUserName(String userName){
        this.userName = userName;

        if (userName.isEmpty()){
            System.out.println("Username cannot be empty");
        } else if (userName.length() < 6) {
            System.out.println("Username must have more than 6 characters");
        }else {
            System.out.println("Username is valid");
        }
    }

    void setPassword (String password) {
        this.password = password;

        if (password.isEmpty()){
            System.out.println("Password cannot be empty");
        } else if (password.length() < 6) {
            System.out.println("Password must have more than 6 characters");
        } else if (password.contains(userName)){
            System.out.println("Password cannot contain Username");
        } else {
            System.out.println("Password is valid");
        }
    }

}

public class Yahoo {
    public static void main (String[] args){

        Registration user1 = new Registration();

        user1.setEmail("adamo91@yahoo.com");
        user1.setUserName("KaczkaDziwaczka");
        user1.setPassword("wrobelekelemelek2");

    }
}
