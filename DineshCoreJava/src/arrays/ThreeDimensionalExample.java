package arrays;

public class ThreeDimensionalExample {

	public static void main(String[] args) {

		int person1[] = { 1, 2, 3 };
		int person2[] = { 4, 5, 6 };
		int person3[] = { 7, 8, 9 };
		int persons1[][] = { person1, person2, person3 };
		int person4[] = { 10, 20, 30 };
		int person5[] = { 40, 50, 60 };
		int person6[] = { 70, 80, 90 };
		int persons2[][] = { person4, person5, person6 };

		int persons[][][] = { persons1, persons2 };
		System.out.println("length 1 = " + persons.length);
		System.out.println("length 2 = " + persons[0].length);
		System.out.println("length 3 = " + persons[0][0].length);
		System.out.println("===================");

		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons[i].length; j++) {
				for (int k = 0; k < persons[i][j].length; k++) {
					System.out.print(persons[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

		System.out.println("===Enhanced For ====");
		for (int i[][] : persons) {
			for (int j[] : i) {
				for (int k : j) {
					System.out.print(k + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
