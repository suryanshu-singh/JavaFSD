import java.util.*;
class Calculate{
	int calculateSum(int number){
		int sum=0;
		int divby3=0;
		int divby5=0;
		int divby15=0;
		for(int i=1;i<number;++i){
			if(i%3==0){
				divby3+=i;
			}
			if(i%5==0){
				divby5+=i;
			}
			if(i%15==0){
				divby15+=i;
			}
		}
		return divby3+divby5+divby15;
	}
	public static void main(String[] args) {
		Calculate object=new Calculate();
		System.out.println("Enter the natural number:");
		Scanner scan = new Scanner(System.in);
		int number=scan.nextInt();
		System.out.println("The sum of number divisible by 3 or 5 is:"+object.calculateSum(number));
	}
}