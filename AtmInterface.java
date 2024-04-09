import java.util.*;
    public class BankAccount{
        private double balance;
         BankAccount(double initialamount){
            this.balance=initialamount;
        }
        public double getBalance(){
            return balance;
        }
        public void deposit(double amount){
            if(amount>0){
                balance+=amount;
                System.out.println("the amount"+amount+ "is deposited");
            }
            else{
                System.out.println("invalid amount for deposit");
            }
        }
        public void withdraw(double amount){
            if(amount<balance && amount>0){
                balance-=amount;
                System.out.println("the amount"+amount+ "is debited");
            }
            else{
                System.out.println("insufficient amount for withdraw");
            }
        }
    }
    class ATM{
          BankAccount account;
          ATM(BankAccount account){
            this.account=account;
          }
          public void run(){
            int choice;
            Scanner sc=new Scanner(System.in);
            while (true) {
                System.out.println("1. Check Balance");
		        System.out.println("2. Deposit");
		        System.out.println("3. Withdraw");
		        System.out.println("4. Exit");
		        System.out.println("");
                System.out.println("Enter your choice: ");
                choice=sc.nextInt();
                // switch (choice) {
                //     case 1:
                //         System.out.println("Your Balance is :"+account.getBalance());
                //         break;
                //     case 2:
                //         System.out.println("Enter the amount to deposit:");
                //         double amount=sc.nextInt();
                //         account.deposit(amount);
                //         break;
                //     case 3:
                //         System.out.println("Enter the amount to withdraw :");
                //         double amount =sc.nextInt();
                //         account.deposit(amount);
                //         break;
                //     case
                //     default:
                //         break;
                // }
                if(choice ==1){
                    System.out.println("Your Balance is :"+account.getBalance());
                    break;
                }
                else if(choice==2){
                    System.out.println("Enter the amount to deposit:");
                            double amount=sc.nextInt();
                            account.deposit(amount);
                            break;
                }
                else if(choice==3){
                    System.out.println("Enter the amount to withdraw :");
                            double amount =sc.nextInt();
                            account.deposit(amount);
                            break;
                }
                else if(choice==4){
                    System.out.println("Thankyou for using the ATM.......\n.......visit again");
                }
                else {
                    System.out.println("---->invalid choice ..\n Please enter a valid choice");
                }

            }
          }
    }

public class AtmInterface {
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE ATM");
        System.out.println("ENTER THE PIN:");
        Scanner sc=new Scanner(System.in);
        int pin=sc.nextInt();
        BankAccount newacc=new BankAccount(1000);
        ATM newatm=new ATM(newacc);
        newatm.run();
    }
}
