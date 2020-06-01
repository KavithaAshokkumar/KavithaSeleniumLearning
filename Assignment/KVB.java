package week3.day1.Assignment;

public class KVB extends RBI {
	
	public void loadInterestRate (String personalLoan)
	{
		System.out.println("The loan interest rate of KVB for personal loan is diplayed in string:"+personalLoan);
	}

	public static void main(String[] args)

	{
		KVB obj = new KVB();
		obj.loanInterestRate();
		obj.loanInterestRate("Agriculture 2%");
		obj.loadInterestRate("Personal Loan 7%");
		
	
	}
}

