import java.util.Scanner;
class PrimeUptoN{
		void printPrime(int n){
				for (int num = 2; num <= n; num++){

		       	    boolean isPrime = true;
		            for (int i=2; i <= num/2; i++)
		            {
		                if ( num % i == 0)
		                {
		                    isPrime = false;
		                    break;
		                }
		            }
		 
		            if ( isPrime == true )
		                System.out.println(num);
				 }
			}
	public static void main(String[] args) throws MyException {
		System.out.println("Enter the value upto which prime number is to be calculated:");
		Scanner scan = new Scanner(System.in);
		try{
			Integer input=scan.nextInt();
			new PrimeUptoN().printPrime(input);
		}catch(java.util.InputMismatchException e){
			System.out.println("Integer not entered");
		}
	}
}