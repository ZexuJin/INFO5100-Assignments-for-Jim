package Assignment_6.Question_1;

import java.util.ArrayList;

public class UserImpl {
    static ArrayList<User> users=new ArrayList<>();

    public void register(User user) {
        users.add(user);
    }

    public boolean isLogin(String bankAccountNumber, String password) {
        boolean isLogin = false;
        for (User user : users) {
            if(bankAccountNumber.equals(User.getBankAccountNumber())&&password.equals(User.getPassword())){
                isLogin = true;
                break;
            }
        }
        return isLogin;
    }
}
