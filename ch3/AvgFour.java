import acm.program.*;

public class AvgFour extends ConsoleProgram {
	
	public void run() {
		println("This program converts feet and inches to centimeters.");
		
		int[] n = new int[4];
		int total = 0;
		
		for(int i=0; i < n.length; i++) {
			int index = i + 1;
			n[i] = readInt("Enter number " + index + ": ");
			total += n[i];
		}
		
		double avg = total / n.length;
		
		print("Average of ");
		for(int i=0; i < n.length; i++)
			print(n[i] + " ");
		print("is = " + avg);
		
	}
	
}