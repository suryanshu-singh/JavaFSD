import java.util.*;
class PositiveString{
	static boolean checkPositiveString(String input){
		boolean check=false;
		for(int i=0;i<input.length()-1;++i){
			if(input.charAt(i)<input.charAt(i+1)){
				continue;
			}
			else{
				check=true;
				break;
			}
		}
		if(check){
			return false;
		}
		else{
			return true;
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the string to check whether it is positive or not:");
		Scanner scan = new Scanner(System.in);
		String input= scan.nextLine();
		input=input.toLowerCase();
		System.out.println("The result is:"+checkPositiveString(input));
	}
}