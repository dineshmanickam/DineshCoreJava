package Basic;

public class NestedLoopBreakContinueExample {

	public static void main(String[] args) {
		String personDetails[][] = { { "Dinesh", "Male" },
				{ "Ramesh", "Male" }, { "Anika", "Female" } };
		for (String person1[] : personDetails) {
			for (String person2 : person1) {
				if (person2 == "Ramesh") continue;
				System.out.print(person2 + " ");
			}
			System.out.println();
		}
		System.out.println("=======Break with the first coulmn =======");
		for (String person1[] : personDetails) {
			for (String person2 : person1) {
				if (person2 == "Ramesh") break;
				System.out.print(person2 + " ");
			}
			System.out.println();
		}
		System.out.println("=======Break with the Second coulmn =======");
		for (String person1[] : personDetails) {
			for (String person2 : person1) {
				if (person2 == "Male") break;
				System.out.print(person2 + " ");
			}
			System.out.println();
		}
	}

}
