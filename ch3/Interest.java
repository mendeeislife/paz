import acm.program.*;

public class Interest extends ConsoleProgram {
	
	public void run() {
		println("Interest calculation program");
		
		double balance = readDouble("Enter starting balance: ");
		double interest = readDouble("Enter annual interest rate:  ");
		
		double profit = balance / 100 * interest;
		double balanceAfterYear = balance + profit;
		
		println("Balance after one year = " + balanceAfterYear);
	}
	
}