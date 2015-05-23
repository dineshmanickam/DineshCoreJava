package Basic;

public class LoopBreakContinueExample {

	public static void main(String[] args) {
		int numbers[] = { 5, 10, 15, 16, 17, 18, 19 };

		for (int num : numbers) {
			if (num == 17)
				continue;
			System.out.println("Numbers -- " + num);
		}

		System.out.println("====================");
		for (int num : numbers){
			if (num == 17) break;
			System.out.println("Numbers -- " + num);
		}
	}

}
