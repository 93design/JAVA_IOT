package demo;

public class StringBuilderExample {

	public static void main(String[] args) {

		StringBuilder sentence = new StringBuilder("");
		StringBuilder copy = sentence;
		StringBuilder test1 = new StringBuilder("Hallo");
		StringBuilder test2 = new StringBuilder("Hallo");
		StringBuilder test3 = test2;
				
		test2.setCharAt(1, 'e');;
		System.out.println(test1);
		System.out.println(test2);
		
		if (test2 == test3) {
			System.out.println("a");
		} else {
			System.out.println("B");
		}
		
		if (test2.equals(test3)) {
			System.out.println("a");
		} else {
			System.out.println("B");
		}
		
		if (test1 == test3) {
			System.out.println("a");
		} else {
			System.out.println("B");
		}
		
		if (test1.equals(test3)) {
			System.out.println("a");
		} else {
			System.out.println("B");
		}
		
				
		sentence.append("This ").append("is ").append("method ").append("chaining!");

		// sentence = sentence.append("this");
		// sentence = sentence.append("is");
		// sentence = sentence.append("method");
		// sentence = sentence.append("Chaining!");

		System.out.println(copy);

		copy.deleteCharAt(copy.length() - 1);

		System.out.println(sentence);
		
		String temp1 = "TGIF";
		String temp2 = " = THANK GOD IT IS FRIDAY";
		
		System.out.println(temp1 + temp2);

	}

}
