import java.util.Scanner;
class SumOfCubes{
	int sum=0;
	int result(int number){
		while(number>0){
			int digit= number%10;
			number/=10;
			sum+=Math.pow(digit,3);
		}
		return sum;
	}
	public static void main(String[] args) {
		SumOfCubes object= new SumOfCubes();
		System.out.println("Enter the number:");
		Scanner scan = new Scanner(System.in);
		Integer number= scan.nextInt();
		System.out.println("The sum of cubes of individual digits is:"+object.result(number));
	}
}