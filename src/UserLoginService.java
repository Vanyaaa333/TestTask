import java.util.Scanner;

public class UserLoginService {

    public boolean login(User user) {
        while (true) {
            if (!user.isUserBlocked()) {
                System.out.println("Введите пароль:");
                Scanner scanner = new Scanner(System.in);
                String password = scanner.nextLine();
                if (password.equals(user.getPassword())) {
                    System.out.println("You successfully login");
                    user.resetOfTriesCounter();
                    return false;
                } else {
                    user.decreaseOfTriesCounter();
                    if (user.getCOUNTER_OF_TRIES() == 0) {
                        user.blockUser();
                        return false;
                    } else {
                        System.out.printf("Вы ввели неверный пароль, У вас осталось %s попыток", user.getCOUNTER_OF_TRIES());
                        System.out.println();
                        login(user);
                    }
                }
                return false;
            }
            else return false;
        }
    }
}
