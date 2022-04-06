import acm.program.*;

public class Interest2 extends ConsoleProgram {
	
	public void run() {
		println("Interest calculation program");
		
		double balance = readDouble("Enter starting balance: ");
		double interest = readDouble("Enter annual interest rate:  ");
		
		for(int i = 1; i <= 2; i++) {
			double profit = balance / 100 * interest;
			balance += profit;
			println("Balance after " + i + " year = " + balance);
		}
		
	}
	
}