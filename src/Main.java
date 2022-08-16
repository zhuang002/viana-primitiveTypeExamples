import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//integerSamples();
		
		//doubleSamples();
		
		//arraySamples();
		booleanSamples();
		//loopSamples();
		
		/*int f = factorial(10); // 10!
		System.out.println(f);
		
		f = factorial(15); // 15!
		System.out.println(f);*/
	}
	
	

	private static void booleanSamples() {
		// TODO Auto-generated method stub
		boolean a,b,c;
		
		a= true;
		b = false;
		
		c = !a;
		System.out.println(c);
		
		c = a && b;
		System.out.println(c);
		
		c = a || b;
		System.out.println(c);
		
		a = 10 > 9;
		b = 2 > 3;
		
		c = 4!=4;
		
		System.out.println(a+" "+b+" "+c);
		
		if (c) {
			System.out.println("c is true");
		} else {
			System.out.println("c is false");
		}
		
		if (a && b) {
			System.out.println("a and b is true");
		} else {
			System.out.println("a and b is false");
		}
				
		int i1,i2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input i1 and i2: ");
		i1 = sc.nextInt();
		i2 = sc.nextInt();
		
		a = i1>i2;
		if (a) {
			System.out.println("i1 is larger than i2");
		} else if (i1<i2) {
			System.out.println("i1 is smaller than i2");
		} else {
			System.out.println("i1 equals to i2");
		}
		
	}



	private static void arraySamples() {
		// TODO Auto-generated method stub
		int[] ia = new int[10];
		int a=1;
		int b=1;
		for (int i=0;i<10;i++) {
			a = a+i;
			b = b+i;
			ia[i] = a+b;
		}
		
		for (int i=0;i<10;i++) {
			System.out.print(ia[i]+" ");
		}
		
		System.out.print(ia[12]);
	}



	private static int factorial(int n) {
		// TODO Auto-generated method stub
		int prod = 1;
		for (int i=1;i<=n;i++) {
			prod = prod * i;
		}
		return prod;
	}

	private static void loopSamples() {
		// TODO 1+2+3...+100 --> 5050
		int sum = 0;
		for (int i=1;i<=10;i=i+1) { // for (init; loop-condition; updating) {}
			sum = sum + i;
		}
		System.out.println(sum);
		
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
