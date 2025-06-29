import java.util.Scanner;

  class Bank
{
  String accHolder;
  int balance;
   
   public void deposit()
   {
       balance+=2000;
       System.out.println("Amount Deposited = 2000");
   }
   
   public void withdraw()
   {
       balance-=500;
       System.out.println("Amount Withdrawed = 500");
   }
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	Bank b = new Bank();
	b.accHolder = "Vivek Oberoi";
	b.balance = 0;
	
	System.out.println("Account Holder Name is "+b.accHolder);
	
	b.deposit();
	b.withdraw();
	System.out.println("Account Balance is "+b.balance);
	
	sc.close();
	
	}
    }
