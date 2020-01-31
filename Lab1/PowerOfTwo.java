import java.util.*;
class PowerOfTwo{
	boolean checkNumber(Integer n){
		//String s= Integer.toString(n);
		boolean check=false;
		while(n%2==0){
			check=true;
			n=n/2;
		}
		if(n==1 && check){
			return true;

		}
		else
		{
			return false;
		}

	}
	public static void main(String[] args) {
		System.out.println("Enter the number to check whether it is power of 2 or not:");
		Scanner scan = new Scanner(System.in);
		Integer n=new Integer(scan.nextInt());
		System.out.println("The result is:"+ new PowerOfTwo().checkNumber(n));
	}
}