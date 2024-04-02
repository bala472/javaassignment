import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private String name;
    private String accountNumber;
    private int amountInSavings;

    private int atmPin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAmountInSavings() {
        return amountInSavings;
    }

    public void setAmountInSavings(int amountInSavings) {
        this.amountInSavings = amountInSavings;
    }

    public int getAtmPin() {
        return atmPin;
    }

    public void setAtmPin(int atmPin) {
        this.atmPin = atmPin;
    }
}
class Database{
    private List<Bank> CustomerList = new ArrayList<>();

    public List<Bank> getCustomerList() {
        return CustomerList;
    }

    public void setCustomerList(Bank customerList) {
        this.CustomerList.add(customerList);
    }

}
class BankView{
    public static void main(String[] args) {
        Database database = new Database();
        Bank bank = new Bank();
        bank.setName("Bala M");
        bank.setAccountNumber("021000076525");
        bank.setAtmPin(1234);
        bank.setAmountInSavings(10000);
        database.setCustomerList(bank);
        startBanking(database);

    }
    public static void startBanking(Database database){
        Scanner in = new Scanner(System.in);
        System.out.println("\n     -----  Welcome To IOB ATM  ------  \n");
        System.out.println("Enter ATM Pin Number (1234) : \n");
        try{
            int pinInput = in.nextInt();
            if(pinInput==database.getCustomerList().get(0).getAtmPin()){
                System.out.println("\n Enter Amount to withdraw ( Balance Rs. "+database.getCustomerList().get(0).getAmountInSavings()+" ) : ");

                try{
                    int amount = in.nextInt();
                    if(amount<=database.getCustomerList().get(0).getAmountInSavings()){
                        database.getCustomerList().get(0).setAmountInSavings(database.getCustomerList().get(0).getAmountInSavings()-amount);
                        System.out.println("\nAmount debited Sucessfully ");
                        startBanking(database);
                    }else {
                        throw new Exception();
                    }
                }catch (InputMismatchException e){
                    System.out.println("Amount must be number ");
                    startBanking(database);
                }catch (Exception e){
                    System.out.println("Insufficient Balance");
                    startBanking(database);
                }
            }
            else
                throw new Exception();
        }catch(InputMismatchException e){
            System.out.println("Pin Number must be Number ");
            startBanking(database);
        }catch (Exception e){
            System.out.println("Incorrect Pin");
            startBanking(database);
        }
    }

}