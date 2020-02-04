import java.util.*;

class FibonacciU
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to calculate the 'nth' sequence of fibonacci series:");
		int n=sc.nextInt();

		int k=fiboRecursive(n);

		System.out.println("Using recursive method is:"+k);
		int l= fiboLoop(n);
		System.out.println("Using loop is:"+l);
	}


	static int fiboRecursive(int n)
	{
		if(n<=1)
			return n;

		return fiboRecursive(n-1)+fiboRecursive(n-2);

	}
	static int fiboLoop(int n)
	{
		int n1=1;
		int n2=1;
		int n3=0;
		for(int i=2;i<n;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}

		return n3;
	}

}
