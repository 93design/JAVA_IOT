package ForEach;

public class ForEachExample {

	public static void main(String[] args) {
		
		int[] array = new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = i*2;
		}
		System.out.println("----------vooruit--------------");
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
		System.out.println("-----------	achteruit---------");
		for (int k = array.length - 1; k >= 0; k--) {
			System.out.println(array[k]);
		}
		System.out.println("----------foreach-------------");
		for(int element: array) {
			element *=2;
			System.out.println(element);
		}

	}

}
