public class StaRTProgram {
    public static void main(String[] args) {
        User user1 = new User("roma", "vanya");
        new UserLoginService().login(user1);
    }
}
