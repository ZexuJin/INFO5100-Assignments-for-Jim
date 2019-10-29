package Assignment_6.Question_1;

import java.util.Scanner;

public class Atm {

    public static void depositMoney(){
        System.out.println("\tYou've deposited the amount of " + User.getDeposit()+" dollars.");
    }

    public static void withdrawMoney(){
        if(User.getWithdraw() > User.getBalance() && User.getBalance() <= 100) {
            System.out.println("\tThe amount you entered is either greater than your current balance, or below 100.");
            System.out.println("\tPlease check the number you entered.");
        }
        else {
            User.setBalance(User.getBalance() - User.getWithdraw());
            System.out.println("\n\tYou've successfully withdrew the total amount of " + User.getWithdraw()+" dollars.");
        }
    }

    public static void checkBalance(){
        System.out.println("\tYour current balance is " + User.getBalance());
    }

    public static void atmTransactionSystem(){
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("\tPlease select ATM Transactions");
            System.out.println("\tPress [1] Deposit");
            System.out.println("\tPress [2] Withdraw");
            System.out.println("\tPress [3] Balance Inquiry");
            System.out.println("\tPress [4] Exit");

            System.out.print("\tInput your choice of number: ");
            String select2 = scanner.nextLine();

            switch (select2) {
                case "1":
                    System.out.print("\n\tEnter the amount of money to deposit: ");
                    User.setDeposit(scanner.nextDouble());
                    User.setBalance(User.getBalance()+User.getDeposit());
                    depositMoney();
                    System.out.println("****************************************************");
                    break;

                case "2":
                    System.out.print("\n\tTo withdraw, make sure that you have sufficient balance in your account.");
                    System.out.println();
                    System.out.print("\tEnter amount of money to withdraw: ");
                    User.setWithdraw(scanner.nextDouble());
                    withdrawMoney();
                    System.out.println("****************************************************");
                    break;

                case "3":
                    checkBalance();
                    System.out.println("****************************************************");
                    break;

                case "4":
                default:
                    System.exit(0);
                    break;
            }
        }
    }


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int choice = 0;

        System.out.println("****************************************************");
        System.out.println("  Welcome to the main page of ATM Operation System");
        System.out.println("****************************************************");
        System.out.println();

        while (true) {
            System.out.println("\tThis is the login/register page：");
            System.out.println("\tPress [1] register");
            System.out.println("\tPress [2] login");
            System.out.println("\tPress [3] exit");

            UserImpl udi = new UserImpl();

            System.out.print("\tInput your choice of number: ");
            String select1 = read.nextLine();

            switch (select1) {
                case "1":
                    System.out.println("\n\tThis is the register page: ");
                    System.out.print("\n\tPlease enter your name: ");
                    String name = read.nextLine();
                    System.out.print("\tPlease enter your address: ");
                    String address = read.nextLine();
                    System.out.print("\tPlease enter your age: ");
                    String age = read.nextLine();
                    System.out.print("\tPlease enter your phone number: ");
                    String phoneNumber = read.nextLine();
                    System.out.print("\tPlease enter your bank account number: ");
                    String bankAccountNumber = read.nextLine();
                    System.out.print("\tPlease enter your bank account password: ");
                    String bankAccountPassword = read.nextLine();
                    User user = new User(name, age, address, phoneNumber, bankAccountNumber, bankAccountPassword);
                    udi.register(user);
                    System.out.println("\tRegistration completed!");
                    System.out.println("****************************************************");
                    break;


                case "2":
                    System.out.println("\n\tThis is the login page: ");
                    System.out.print("\n\tPlease enter your bank account number: ");
                    String inputUserName = read.nextLine();
                    System.out.print("\tPlease enter your bank account password: ");
                    String inputPassWord = read.nextLine();

                    boolean isLogin = udi.isLogin(inputUserName, inputPassWord);
                    if (isLogin) {
                        System.out.println("\tLogin successfully!");
                        System.out.println("****************************************************");
                        atmTransactionSystem();
                    } else {
                        System.out.println("\tLogin failed! Please input correct numbers.");
                        System.out.println("****************************************************");
                    }
                    break;


                case "3":
                default:
                    System.exit(0);
                    break;
            }
        }
    }
}

