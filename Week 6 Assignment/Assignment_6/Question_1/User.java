package Assignment_6.Question_1;

public class User {

    private static String name;
    private String age;
    private String address;
    private String phoneNumber;
    private static String bankAccountNumber;
    private static String bankAccountPassword;
    private static double balance = 0;
    private static double deposit = 0;
    private static double withdraw = 0;


    public User(String name, String age, String address, String phoneNumber,
                String bankAccountNumber, String password){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.bankAccountNumber = bankAccountNumber;
        this.bankAccountPassword = password;
    }

    public static void setBalance(double balance) {
        User.balance = balance;
    }
    public static double getBalance() {
        return balance;
    }

    public static void setDeposit(double deposit) {
        User.deposit = deposit;
    }
    public static double getDeposit() {
        return deposit;
    }

    public static void setWithdraw(double withdraw) {
        User.withdraw = withdraw;
    }
    public static double getWithdraw() {
        return withdraw;
    }


    public static String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getAge(){
        return age;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public static String getBankAccountNumber(){
        return bankAccountNumber;
    }

    public static String getPassword(){
        return bankAccountPassword;
    }


}
