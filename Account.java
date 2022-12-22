package atm_03;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import demo_ATM.HomePage;

public class Account  {

	String Email;
	int AccNum, PinNum;
	int SaveBalance = 5000, SaveDeposit, SaveWithdraw;
	int CurrentBalance = 5000, CurrentDeposit, CurrentWithdraw;

	Scanner s = new Scanner(System.in);

	HashMap <Integer, Integer> UserInfo = new HashMap <Integer, Integer> ();

	public void SignUp() 
	{
		try {
			while(true) 
			{
				System.out.println("\nenter a new account number : ");
				AccNum = s.nextInt();

				System.out.println("\nenter a new pin number : ");
				PinNum = s.nextInt();

				if(!UserInfo.containsKey(AccNum)) 
				{
					UserInfo.put(AccNum, PinNum);

					System.out.println("\n.....account created successfully.....");
					break;
				}

				else 
				{
					System.out.println("\n.....account already exist.....");
					System.out.println("\n.....Try loging in.....");
					Login();
					
					
				}
			}
		}

		catch(InputMismatchException e) 
		{
			System.out.println( e + "\n.....enter a valid number");
		}

	}

	public void Login() 
	{
		try {
			while(true) 
			{
				System.out.println("\nenter account number to login : ");
				int loginAccNum = s.nextInt();

				if(UserInfo.containsKey(loginAccNum)) 
				{
					System.out.println("\n.....account number verified.....");

					System.out.println("\nenter your login pin number");
					int loginPinNum = s.nextInt();

					if(UserInfo.get(loginAccNum) == loginPinNum) 
					{
						System.out.println("\n.....Login successful.....\n");
						
//						System.out.println("\n.....Select your account type.....");
						AccountType();
						
						break;
					}

					else 
					{
						System.out.println("\n.....incorrect password.....");
					}
					
				}
				
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	public void SavingsAcc() 
	{

		while(true)  
		{  
			try {
				System.out.println("\nSAVINGS ACCOUNT");  
				System.out.println("\nChoose 1 for Withdraw");  
				System.out.println("Choose 2 for Deposit");  
				System.out.println("Choose 3 for Check Balance");  
				System.out.println("Choose 4 to go back");
				System.out.println("Choose 5 for EXIT");
				System.out.print("\nChoose the operation you want to perform:");  

				int n = s.nextInt();  
				switch(n)  
				{  
				case 1:  
					System.out.print("\nEnter money to be withdrawn:");  

					SaveWithdraw = s.nextInt();  

					if(SaveBalance >= SaveWithdraw)  
					{  
						SaveBalance = SaveBalance - SaveWithdraw;  
						System.out.println("\nPlease collect your money");  
					}  
					else  
					{  
						System.out.println("\nInsufficient Balance");  
					}  
					System.out.println(" ");  
					break;  

				case 2:  

					System.out.print("\nEnter money to be deposited: ");  

					SaveDeposit = s.nextInt();  

					SaveBalance = SaveBalance + SaveDeposit;  
					System.out.println("\nYour Money has been successfully deposited");  
					System.out.println(" ");  
					break;  

				case 3:  
					System.out.println("\nBalance : " + SaveBalance );  
					System.out.println(" ");  
					break;  

				case 4:  
					AccountType();
					
				case 5:
					System.exit(0);  
					
				default:
					System.out.println("\ninvalid selection");
				}  
			}
			catch(InputMismatchException e) 
			{
				System.out.println( e + "\n.....enter a valid number\n");
				break;
			}
		}
	}

	public void CurrentAcc() 
	{

		while(true)  
		{  
			try {
				System.out.println("\nCURRENT ACCOUNT");  
				System.out.println("\nChoose 1 for Withdraw");  
				System.out.println("Choose 2 for Deposit");  
				System.out.println("Choose 3 for Check Balance");  
				System.out.println("Choose 4 to go back");
				System.out.println("Choose 5 for EXIT");
				System.out.print("\nChoose the operation you want to perform:");  

				int n = s.nextInt();  
				switch(n)  
				{  
				case 1:  
					System.out.print("\nEnter money to be withdrawn: ");  

					CurrentWithdraw = s.nextInt();  

					if(CurrentBalance >= CurrentWithdraw)  
					{  
						CurrentBalance = CurrentBalance - CurrentWithdraw;  
						System.out.println("\nPlease collect your money");  
					}  
					else  
					{  
						System.out.println("\nInsufficient Balance");  
					}  
					System.out.println(" ");  
					break;  

				case 2:  

					System.out.print("\nEnter money to be deposited: ");  

					CurrentDeposit = s.nextInt();  

					CurrentBalance = CurrentBalance + CurrentDeposit;  
					System.out.println("\nYour Money has been successfully depsited");  
					System.out.println(" ");  
					break;  

				case 3:  
					System.out.println("\nBalance : "+CurrentBalance);  
					System.out.println(" ");  
					break;  

				case 4:  
					AccountType();
					
				case 5:
					System.exit(0); 

				default:
					System.out.println("\ninvalid selection\n");

				}  
			}
			catch(InputMismatchException e) 
			{
				System.out.println( e + "\n.....enter a valid number");
			}
		}
	}
	
	public void AccountType() 
	{
		while(true) 
		{
				System.out.println("\nSelect your account type");
				System.out.println("\n" + "enter 1 for savings account");
				System.out.println("enter 2 for current account");
				System.out.println("enter 3 to go back");
				System.out.println("enter 4 to exit");

				int n = s.nextInt();
				switch(n) 
				{
				case 1:
					SavingsAcc();
					break;

				case 2:
					CurrentAcc();
					break;

				case 3:
					Home();
					
				case 4:
					System.exit(0);

				default:
					System.out.println("\ninvalid selection");
				}
			
		}


	}
	
	public void Home() 
	{
		while(true) 
		{

			System.out.println("\nATM Machine");
			System.out.println("\n" + "enter 1 for signup");
			System.out.println("enter 2 for login");
			System.out.println("enter 3 to exit");

			int n = s.nextInt();

			
				try {
					switch(n) 
					{
					case 1:
						SignUp();
						break;

					case 2:
						Login();
						break;

					case 3: 
						System.exit(0);
						
					default:
						System.out.println("\ninvalid selection");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}
	
}
















