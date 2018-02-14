import java.util.Scanner;

public class TestBankAccount {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Integer accountNumber;
    String ownerName;
    Double accountBalance;
    BankAccount ba1 = new BankAccount();
    BankAccount ba2 = new BankAccount();
    BankAccount ba3 = new BankAccount();
    BankAccount ba4 = new BankAccount();
    //call getData method three times
    ba1.getAccountNumber();
    ba1.getOwnerName();
    ba1.getAccountBalance();
    ba2.getAccountNumber();
    ba2.getOwnerName();
    ba2.getAccountBalance();
    ba3.getAccountNumber();
    ba3.getOwnerName();
    ba3.getAccountBalance();
    //prompt a user for values for each field for a bank accountNumer
    System.out.println("Input the account number: ");
    accountNumber = input.nextInt();
    System.out.println("Input the Owner's name: ");
    ownerName = input.nextLine();
    System.out.println("Input the account Balance: ");
    accountBalance = input.nextDouble();
    ba1.setAccountNumber(accountNumber);
    ba1.setOwnerName(ownerName);
    ba1.setAccountBalance(accountBalance);

    System.out.println("Input the account number: ");
    accountNumber = input.nextInt();
    System.out.println("Input the Owner's name: ");
    ownerName = input.nextLine();
    System.out.println("Input the account Balance: ");
    accountBalance = input.nextDouble();
    ba2.setAccountNumber(accountNumber);
    ba2.setOwnerName(ownerName);
    ba2.setAccountBalance(accountBalance);

    System.out.println("Input the account number: ");
    accountNumber = input.nextInt();
    System.out.println("Input the Owner's name: ");
    ownerName = input.nextLine();
    System.out.println("Input the account Balance: ");
    accountBalance = input.nextDouble();
    ba3.setAccountNumber(accountNumber);
    ba3.setOwnerName(ownerName);
    ba3.setAccountBalance(accountBalance);
    //
    ba1.displayData();
    ba2.displayData();
    ba3.displayData();


     }
}
