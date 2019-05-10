package demo;



public class StringBuilderExample {

    public static void main(String[] args) {

        StringBuilder sentence = new StringBuilder("");
        StringBuilder copy = sentence;

        sentence.append("This ").append("is ").append("method ").append("chaining!");
        System.out.println(copy);

        copy.deleteCharAt(copy.length() - 1);

        System.out.println(sentence);


    }

}
