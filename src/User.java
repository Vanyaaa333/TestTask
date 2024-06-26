public class User {

    private String login;
    private String password;
    private static boolean isUserBlocked = false;
    private static int counterOfTries = 3;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isUserBlocked() {
        return isUserBlocked;
    }


    public int getCOUNTER_OF_TRIES() {
        return counterOfTries;
    }

    public void resetOfTriesCounter(){
        counterOfTries = 3;
    }
    public void blockUser(){
        isUserBlocked = true;
        System.out.println("User is blocked!!");
    }
    public void decreaseOfTriesCounter(){
        counterOfTries--;
    }
}
