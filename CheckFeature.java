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
   
   public void check(long checkNumber, int checkAmount)
   {
       if(checkAmount<=0)
       {
           System.out.println("Invalid Check! Your Check is Bounce");
       }else{
        System.out.println(" Your Check Amount is successfully deposited");
           balance+=checkAmount;
       }
       System.out.println("Your Account Balance is "+balance);
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
	
    System.out.println("Enter Check Number:");
    long num =sc.nextLong();
    
    System.out.println("Enter Amount:");
    int amt = sc.nextInt();
    
    b.check(num,amt);
    
	sc.close();
	
	}
   }

#Added Check Feature 
