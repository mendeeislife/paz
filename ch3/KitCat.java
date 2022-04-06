import acm.program.*;

public class KitCat extends ConsoleProgram {

	public void run() {
		int n = 0;
		for (int i = 1; i <= WIVES; i++)
			for (int j = 1; j <= SACKS; j++)
				for (int k = 1; k <= CATS; k++)
					for (int x = 1; x <= KITS; x++)
						n++;
		println(n);

	}

	private static final int WIVES = 7;
	private static final int SACKS = 7;
	private static final int CATS = 7;
	private static final int KITS = 7;

}