package greetings;

public class GreetHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!!!");
		GreetHelloWorld adding = new GreetHelloWorld();
		System.out.println(adding.sumOfTwo(10, 30));
	}
	
	public int sumOfTwo(int num1, int num2) {
		return num1+num2;
	}

}
