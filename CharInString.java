import java.util.Scanner;
class CharInString{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s= scan.nextLine();
		System.out.println("Enter the character to search in the string that you have entered:");
		String ele=scan.nextLine();
		if(s.contains(ele)){
			System.out.println("First instance of character found at position:"+s.indexOf(ele));
		}
		else{
			System.out.println("character not found!!");
		}
	}

}