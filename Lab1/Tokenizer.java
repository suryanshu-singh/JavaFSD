import java.util.*;
class Tokenizer{
	public static void main(String[] args) {
		System.out.println("Input the line of integers:");
		Scanner scan = new Scanner(System.in);
		StringTokenizer input= new StringTokenizer(scan.nextLine()," ");
		int sum=0;
			while(input.hasMoreTokens()){
				int number=Integer.parseInt(input.nextToken());
				System.out.println("The Integers are:"+number);
				sum+=number;
			}
		System.out.println("The sum of the integers are:"+sum);
			
		}
}