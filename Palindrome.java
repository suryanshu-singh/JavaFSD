import java.util.Scanner;
class Palindrome{
	public static void main(String[] args) {
			System.out.println("Enter the string to check for palindrome:");
			Scanner scan = new Scanner(System.in);
			StringBuffer input=new StringBuffer(scan.nextLine());
			StringBuffer reversed= new StringBuffer(input.reverse());
			if(reversed.compareTo(input)==0){
				System.out.println("Palindrome");
			}
			else{
				System.out.println("Not a Palindrome");
			}

	}
}