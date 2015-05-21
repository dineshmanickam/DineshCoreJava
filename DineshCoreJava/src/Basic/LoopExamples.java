package Basic;

public class LoopExamples {

	public static void main(String[] args) {
		int rolls[] = { 5, 10, 15, 20, 25, 30, 35 };

		System.out.println("====for loop =====");
		for (int i = 0; i < rolls.length; i++) {
			System.out.print(rolls[i] + " ");
		}
		System.out.println();
		System.out.println("==== Enhanced For Loop =====");
		for (int roll : rolls) {
			System.out.print(roll + " ");
		}

		System.out.println();
		System.out.println(" ==== While Loop =====");
		int i = 0;
		while (i < rolls.length) {
			System.out.print(rolls[i++] + " ");

		}

		System.out.println();
		System.out.println(" ==== do while loop ====");
		int j = 0;
		do {
			System.out.print(rolls[j++] + " ");
		} while(j < rolls.length);
		
		
	}

}
