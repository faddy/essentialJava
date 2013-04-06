package recursion;

public class FibonacciTest {
	
	public static void main(String[] args){
		int n = 2;
		System.out.println(fib(n));
		System.out.println(iterativeFib(n));
	}
	
	public static int fib(int n){
		if (n < 0) return -1;
		if (n==0) return 0;
		if (n==1) return 1;
		
		return fib(n-2) + fib(n-1);
	}

	public static int iterativeFib(int n){
		
		if (n < 0) return -1;
		if (n==0) return 0;
		if (n==1) return 1;
		
		int a = 1, b = 1;
		for (int i=3; i<=n; i++){
			int c = a+b;
			a = b;
			b = c;
		}
		return b;
	}
}
