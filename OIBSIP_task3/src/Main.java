import java.util.*;
import java.lang.*;
class ATM_Interface
{
	String transaction_history="";
	int no_of_transactions=0;
    float balance=250000.00f;
    	public void TransactionsHistory()
    	{
    		if(no_of_transactions==0)
    		{
    			System.out.println("\nThere has not yet been any transaction.....");
    		}
    		else
    		{
    			System.out.println("--------------------TRANSACTION HISTORY RECORD------------------ : ");
    			System.out.println("\n"+transaction_history);
    		}
    	}
    	public void Withdraw()
    	{
    		Scanner sc=new Scanner(System.in);
    		System.out.print("\nEnter the amount to be withdrawn : ");
    		float f=sc.nextFloat();
    		if(balance>=f)
    		{
    			balance=balance-f;
    			System.out.println("\nYou've been successful in withdrawing the money....");
    			no_of_transactions++;
    			String s="Rs "+f+"/- withdrawn from your account\n";
    			transaction_history = transaction_history.concat(s);
    		}
    		else
    		{
    			System.out.println("\nYour balance is not enough to make a withdrawal...");
    		}
		
    		System.out.println("\nBalance remained after a withdrawal from your account : "+balance);
    		System.out.println("\n");
    	}
    	public void deposit()
    	{
    		Scanner sc=new Scanner(System.in);
    		System.out.print("\nEnter the amount to be deposited : ");
    		float d=sc.nextFloat();
		
    		balance=balance+d;
    		System.out.println("\nDeposited successfully..");
    		no_of_transactions++;
    		String s = "Rs "+d+"/- deposited into your account\n";
    		transaction_history = transaction_history.concat(s);
    		System.out.println("\nBalance remained after making a deposit into your account: "+balance);
    		System.out.println("\n");
    	}
    	public void transfer()
    	{
    		Scanner sc=new Scanner(System.in);
    		System.out.print("\nFill in the recipient's name here : ");
    		String s=sc.nextLine();
    		System.out.print("\nEnter the amount to be transferred to the "+s+" account : ");
    		float f=sc.nextFloat();
    		if(balance>=f)
    		{
    			if(f<=100000)
    			{
    				no_of_transactions++;
    				balance=balance-f;
    				System.out.println("\nSuccessfully transferred to "+s+" account");
    				String st = "Rs "+f+"/- transferred to "+s+" account\n";
    				transaction_history = transaction_history.concat(st);
    				System.out.println("\nAfter transferring the money to "+s+" account, the remaining balance is : "+balance);
    			}
    			else
    			{
    				System.out.println("\nSorry, but you can only transfer up to Rs. 100,000.");
                
    			}
    		}
    		else
    		{
    			System.out.println("\nYour balance is insufficient for money transfer....");
    		}
    	}
    
}
public class Main {

	public static void main(String[] args) {
		System.out.println("\t\t\t********================WELCOME TO ATM INTERFACE APPLICATION==================*********\t\t\t");
	    System.out.println("\n");
	    System.out.println("\nPlease choose one from the below options...: ");
		System.out.println("1.Please register to create your account\n2.Exit");
		Scanner sc = new Scanner(System.in);
		ATM_Interface a = new ATM_Interface();
		int c=sc.nextInt();
		if(c==1)
		{
		    System.out.print("Enter the User ID : ");
		    String Userid=sc.next();
	        System.out.print("Enter the User PIN : ");
		    String pin=sc.next();
		    System.out.println("Registration is completed .. Please, login here ");
		    boolean enter=false;
		    while(!enter)
		  {
		    
		    System.out.print("Enter your User ID : ");
			String un=sc.next();
			if(un.equals(Userid))
			{
				while(!enter)
				{
					System.out.print("Enter your User PIN : ");
					String pw=sc.next();
					if(pw.equals(pin))
					{
						System.out.println("\nYour login has been successful.");
						enter=true;
					}
					else
					{
						System.out.println("Incorrect User PIN...");
						enter=false;
					}
					
				}
			}
			else
			{
				System.out.println("Incorrect User ID....");
				enter=false;
			}
		 }
			
			boolean choice=false;
		    while(!choice)
		    {
		            System.out.println("------------------------====================================-------------------------------");
		        	System.out.println("\t1.Transaction history\n \t2.Withdraw\n \t3.Deposit\n \t4.Transfer\n \t5.Quit (or) To exit");
					System.out.print("From the above options, Enter the operation you want to perform : ");
					int k=sc.nextInt();
					switch(k)
					{
					    case 1: a.TransactionsHistory();
					            break;
					    case 2: a.Withdraw();
								break;
						case 3: a.deposit();
								break;
						case 4: a.transfer();
								break;
						case 5: System.out.println("\nYou have chosen to exit from the ATM Interface application");
						        System.exit(0);
						        break;
					}
		    }
			
		}
		else
		{
		    System.out.println("\nYou have chosen to exit from the ATM Interface application");
		    System.exit(0);
		}

	}

}
					
       


