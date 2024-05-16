public class HelloWorld {
	public static void main(String[] args) {
		String helloWorld = ""; // hello_world
		if (args.length > 0) {
			for (String str: args) {
				System.out.println(str);
			}
		} else {
			System.out.println("Hello World");
		}
	}
}