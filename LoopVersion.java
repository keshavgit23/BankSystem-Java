import java.util.Scanner;
import java.util.ArrayList;

class BankSystem
{
    int balance;
    public void deposit(Scanner sc)
    {
        System.out.println("Enter amount to deposit:");
        int deposit = sc.nextInt();
        if(deposit>=0)
        {
            System.out.println("Your amount deposited successfully!");
            balance+=deposit;
            System.out.println("Your current balance is " +balance);
        }
    }
    public void withdraw(Scanner sc)
    {
        System.out.println("Enter amount to withdraw:");
        int withdraw = sc.nextInt();
        if(withdraw>0)
        {
            if(withdraw<=balance)
            {
            System.out.println("Amount withdrawn successfully!");
            balance-=withdraw;
            System.out.println("Your current balance is: " +balance);
        }
        
        }
    }
    
    public void checkBalance()
    {
        System.out.println("Your current account balance is:" + balance);
    }
    public void depositCheck(Scanner sc)
    {
        System.out.println("Enter Check Number:");
        long checkNumber = sc.nextLong();
        System.out.println("Check Number:" + checkNumber);
        System.out.println("Enter Check amount:");
        int checkAmount= sc.nextInt();
        System.out.println("Check Amount:" + checkAmount);
        if(checkAmount<=0)
        {
            System.out.println("Invalid Check! Your Check is bounce");
        }else{
            System.out.println("Your Check deposited successfully ");
            balance+=checkAmount;
            System.out.println("Your current balance is: " +balance);
        }
    }
    public void miniStatement(Scanner sc)
    {
        ArrayList<Integer>transactions= new ArrayList<Integer>();
        
        System.out.println("Enter 5 transactions:");
        for(int i =0;i<5;i++)
        {
            int amount = sc.nextInt();
            transactions.add(amount);
        }
        System.out.println();
        System.out.println("         Mini-Statement");
        System.out.println("Your Recent 5 transactions: ");
        for(int t:transactions)
        {
            if(t>=0)
            {
            System.out.println("Amount Deposited:" + t);
            }else{
                System.out.println("Amount Withdrawan:"+t);
            }
            balance+=t;
        }
        System.out.println("Your current account balance is: " + balance);
    }
	public static void main (String[] args)
	{
	 Scanner sc = new Scanner(System.in);
	 
	 BankSystem b = new BankSystem();
	 
   int choice;
    do  {
    System.out.println("Enter 1: Deposit Money");
    System.out.println("Enter 2: Withdraw Money");
    System.out.println("Enter 3: Check Account balance");
    System.out.println("Enter 4: Deposit Check");
    System.out.println("Enter 5: Display Mini Statement");
    
    System.out.println("Enter Choice:");
    choice = sc.nextInt();
    
    switch(choice){
        case 1:
            b.deposit(sc);
            break;
        case 2: 
            b.withdraw(sc);
            break;
        case 3:
            b.checkBalance();
            break;
        case 4: 
            b.depositCheck(sc);
            break;
        case 5: 
            b.miniStatement(sc);
            break;
        case 6:
            System.out.println("         Thank you for banking! ");
        default:
            System.out.println("Enter a valid choice!");
             }
        System.out.println("      Thank You for banking");
        } while(choice!=6);
}
}
