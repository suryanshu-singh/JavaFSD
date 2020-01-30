import java.util.Scanner;
class Reverse{
		public static void main(String[] args) {
			System.out.println("Enter the string to reverse:");
			Scanner scan = new Scanner(System.in);
			StringBuffer input=new StringBuffer(scan.nextLine());
			System.out.println("The reversed string is:"+input.reverse());
		}

}