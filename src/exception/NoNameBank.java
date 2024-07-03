package exception;

import java.util.Scanner;

public class NoNameBank {
    private double balance;
    public void deposite(double amount) throws InvalidAmountException {
        if(amount <0 ){
            throw new InvalidAmountException();
        }else{
            balance=balance+amount;
        }
    }

    public double withdraw(double amount) throws InsufficientFundsException{
        if(balance<amount){
            throw new InsufficientFundsException();
        }else{
            balance=balance-amount;
        }
        return amount;
    }
    public void balanceEnquiry(){
        System.out.println("current Amount is : "+balance);
    }

        public static void menu(){
        NoNameBank noNameBank=new NoNameBank();


            String desire;
           try{
               do {
                   System.out.println("Enter 1 if you want to deposite");
                   System.out.println("Enter 2 if you want to withdraw");
                   System.out.println("Enter 3 if you want to balance enquiry");

                   Scanner scanner=new Scanner(System.in);
                   String option=scanner.nextLine();
                   switch (option){
                       case "1":
                           System.out.println("Enter the amount you need to depsoite");
                           double amount= scanner.nextDouble();
                           noNameBank.deposite(amount);
                           noNameBank.balanceEnquiry();
                           break;
                       case "2":
                           System.out.println("Enter the amount you need to withdraw");
                           double x=scanner.nextDouble();
                           noNameBank.withdraw(x);
                           noNameBank.balanceEnquiry();
                           break;
                       case "3":
                               noNameBank.balanceEnquiry();
                               break;
                       default:
                           System.out.println("Please enter invalid option from the list ");
                   }
                   System.out.println("If you want to complete enter yes");
                 desire  =scanner.nextLine();
               }while(!desire.equalsIgnoreCase("no"));
           }catch(InvalidAmountException e){
               System.out.println(e);
           }catch (InsufficientFundsException e){
               System.out.println( e);
           }
        }
}
