import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		integerSamples();
		
		doubleSamples();
		
		/*arraySamples();
		booleanSamples();
		loopSamples();
		*/
	}

	private static void doubleSamples() {
		// TODO Auto-generated method stub
		System.out.println("---Double Sample ---");
		double a,b,c;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input a and b: ");
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = a + b;
		System.out.println("a+b=" + c);
		
		c = a - b;
		System.out.println("a-b=" + c);
		
		c = a * b;
		System.out.println("a*b=" + c);
		
		c = a / b;
		System.out.println("a/b=" + c);
		
		
		
		if (a>b) {
			System.out.println("a is larger than b");
		} else if (a == b) {
			System.out.println("a equals to b");
		} else {
			System.out.println("a is smaller than b");
		}
		
		if (a>=b) {
			System.out.println("a is larger than or equal to b");
		} else {
			System.out.println("a is smaller than b");
		}
		
		int i1 = 25;
		int i2 = 3;
		c = i1/i2;
		System.out.print("i1/i2="+c);
		
	}

	private static void integerSamples() {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("---Integer Sample---");
		System.out.print("Please input a and b: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = a + b;
		System.out.println("a+b=" + c);
		
		c = a - b;
		System.out.println("a-b=" + c);
		
		c = a * b;
		System.out.println("a*b=" + c);
		
		c = a / b;
		System.out.println("a/b=" + c);
		
		c = a % b;
		System.out.println("a%b=" + c);
		
		if (a % 2 == 0) {
			System.out.println("a is even.");
		} else {
			System.out.println("a is odd.");
		}
		
		if (b % 2 == 0) {
			System.out.println("b is even.");
		} else {
			System.out.println("b is odd.");
		}
		
		if (a>b) {
			System.out.println("a is larger than b");
		} else if (a == b) {
			System.out.println("a equals to b");
		} else {
			System.out.println("a is smaller than b");
		}
		
		if (a>=b) {
			System.out.println("a is larger than or equal to b");
		} else {
			System.out.println("a is smaller than b");
		}
		
		
		
	}

}
