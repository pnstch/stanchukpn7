public class Login{
    public static boolean checkCorrect(String login, String password, String confirmPassword, String regex) {
        boolean a = true;
        try {
            if(!login.matches(regex)) {
                throw new  WrongLoginException("Неверный логин");
            }
            else if (!password.matches(regex)){
                throw new WrongPasswordException("Неверный пароль");
            }
            else if(!confirmPassword.equals(password)){
                throw new WrongPasswordException("Пароли не совпадают");
            }
        }
        catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e);
            a = false;
        }
        return a;
    }
}