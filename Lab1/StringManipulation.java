import java.util.Scanner;
import java.util.Arrays;
class StringManipulation{
	String manipulate(String input){
		char []tempArray= input.toCharArray();
		Arrays.sort(tempArray);
		String sortedInput= new String(tempArray);
		//for(int i=0;i<sortedInput.length())
		int n= sortedInput.length();
		String format="";
		if(n%2==0){
			String s=sortedInput.substring(0,n/2);
			s.toUpperCase();
			String st=sortedInput.substring(n/2,n);
			st.toLowerCase();
			format+=s;
			format+=st;
		}
		else{
			String s=sortedInput.substring(0,(n/2)+1);
			s=s.toUpperCase();
			String st=sortedInput.substring((n/2)+1,n);
			st=st.toLowerCase();
			format+=s;
			format+=st;
		}
		return format;

	}
	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner scan = new Scanner(System.in);
		String input= scan.nextLine();
		StringManipulation Object= new StringManipulation();
		System.out.println("The manipulated string is:"+Object.manipulate(input));
	}
}