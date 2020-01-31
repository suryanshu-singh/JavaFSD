import java.util.*;
class CalDiff{
	int calculateDifference(int n){
		return ((n*(n+1)*(2*n+1)/6)-(n*(n+1)/2));
	}
	public static void main(String[] args) {
		CalDiff object=new CalDiff();
		System.out.println("Enter the natural number:");
		Scanner scan = new Scanner(System.in);
		int number=scan.nextInt();
		System.out.println("The required difference is:"+object.calculateDifference(number));
	}
}
