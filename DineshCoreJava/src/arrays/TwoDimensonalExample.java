package arrays;

public class TwoDimensonalExample {

	public static void main(String[] args) {

		int age[] = { 10, 20, 30 };
		int height[] = { 40, 50, 60 };

		int person1[] = { 10, 40 };
		int person2[] = { 20, 50 };
		int person3[] = { 30, 60 };

		int person[][] = { person1, person2, person3 };

		System.out.println(person[0][0] + " " + person[0][1]);
		System.out.println("================");
		for (int i = 0; i < person.length; i++) {
			for (int j = 0; j < person[i].length; j++) {
				System.out.print(person[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=========="); // enhanced for
		for (int i[] : person) {
			for (int j : i) {
				System.out.print(j + " ");

			}
			System.out.println();
		}
	}

}
