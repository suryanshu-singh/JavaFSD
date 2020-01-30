import java.util.Scanner;
class ReplaceBuffer{
	public static void main(String[] args) {
		System.out.println("Enter the original string buffer");
		Scanner scan = new Scanner(System.in);
		StringBuffer buffer=new StringBuffer(scan.nextLine());
		System.out.println("Original Buffer String:"+buffer);
		System.out.println("Enter the string you want to replace in the buffer:");
		StringBuffer rep=new StringBuffer(scan.nextLine());
		buffer.replace(0,buffer.length(),newString(rep));
		System.out.println("The updated string is:"+buffer);

	}
}