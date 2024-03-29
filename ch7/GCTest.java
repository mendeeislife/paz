import acm.program.*;
import java.lang.Runtime;

public class GCTest extends ConsoleProgram {
	// Initializes Runtime myRuntime.
	private Runtime myRuntime = Runtime.getRuntime();
	/**
	 * Runs program.
	 */
	public void run() {
		println("This program tests the 'Garbage-Collector'.\n");
		println("Allocating 10000 Rational objects.");
		for (int i = 0; i < 10000; i++) {
			new Rational();
		}
		// Measures free memory before garbage collector is run. 
		long preMem = myRuntime.freeMemory();
		myRuntime.gc();
		// Measures free memory after garbage collector has finished.
		long postMem = myRuntime.freeMemory();
		println("Garbage collection freed " + (postMem - preMem) + " bytes."); 
	}
}