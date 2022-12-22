package atm_03;

import java.util.InputMismatchException;

public class ATM extends Account {

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
						
						
					case 4:
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

//	public void AccountType() 
//	{
//		while(true) 
//		{
//				System.out.println("Select your account type");
//				System.out.println("\n" + "enter 1 for savings account");
//				System.out.println("\n" + "enter 2 for current account");
//				System.out.println("\n" + "enter 3 to exit");
//
//				int n = s.nextInt();
//				switch(n) 
//				{
//				case 1:
//					SavingsAcc();
//					break;
//
//				case 2:
//					CurrentAcc();
//					break;
//
//				case 3:
//					System.exit(0);
//
//				default:
//					System.out.println("invalid selection");
//				}
//			
//		}
//
//
//	}

}
