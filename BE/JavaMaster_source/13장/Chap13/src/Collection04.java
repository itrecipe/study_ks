import java.util.HashSet;

public class Collection04 {
	public static void main(String[] args) {

		HashSet<String> str = new HashSet<String>();

		str.add("A");
		str.add("B");
		str.add("C");

		System.out.println(str);

		System.out.print("HashSet ��� : ");

		for (String elements : str) {
			System.out.print(elements + " ");
		}

		String[] array = new String[str.size()];
		str.toArray(array);
		System.out.println();
		System.out.print("Array ��� : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}
