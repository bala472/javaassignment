import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

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
        Scanner in = new Scanner(System.in);
        Database database = new Database();
        Bank bank = new Bank();
        bank.setName("Bala M");
        bank.setAccountNumber("021000076525");
        bank.setAtmPin(1234);
        bank.setAmountInSavings(10000);
        database.setCustomerList(bank);
        starBanking();

    }
    public static void starBanking(){
        System.out.println("     -----  Welcome To IOB ATM  ------  \n");
        System.out.println("Enter ATM Pin Number (1234) : \n");
        try{
            int pinInput = in.nextInt();
            if(pinInput==database.getCustomerList().get(0).getAtmPin()){
                System.out.println("\n Enter Amount to withdraw ( Balance Rs. "+database.getCustomerList().get(0).getAmountInSavings()+" ) : ");

                try{
                    int amount = in.nextInt();
                    if(amount<=database.getCustomerList().get(0).setAmountInSavings()){
                        database.getCustomerList().get(0).setAmountInSavings(database.getCustomerList().get(0).getAmountInSavings()-amount);
                        System.out.println("\nAmount debited Sucessfully ");
                        starBanking();
                    }else {
                        throw new Exception("Insufficient Balance");
                    }
                }catch (InputMismatchException e){
                    System.out.println("Amount must be number ");
                }catch (Exception e){
                    System.out.println(e);
                }
            }
            else
                throw new Exception("Incorrect Pin");
        }catch(InputMismatchException e){
            System.out.println("Pin Number must be Number ");
        }catch (Exception e){
            System.out.println(e);
        }
    }

}