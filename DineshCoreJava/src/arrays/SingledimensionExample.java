package arrays;

public class SingledimensionExample {

	public static void main(String[] args) {
		String name[] = new String[4];
		name[0] = "one";
		name[1] = "two";
		name[2] = "three";
		name[3] = "four";
		// name[4] = "five";
		System.out.println("length " + name.length);
		for (int I = 0; I < name.length; I++) {

			System.out.println(name[I]);
		}
		System.out.println("=================="); //enhanced for
		for (String names : name) {
			System.out.println(" name -- " + names);
		}

	}

}
