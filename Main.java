class Calculator{
	public static int add(int a,int b) {
		return a+b;
	}
	public static int difference(int a,int b) {
		return b-a;
	}
}

public class Main {
	public static void main(String[] args) {
		int cal1 = Calculator.add(9, 1);
		int cal2 = Calculator.difference(1, 10);
		
		System.out.println(cal1 + " " + cal2);
	}
}
