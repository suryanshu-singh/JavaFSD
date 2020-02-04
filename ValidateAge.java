import java.util.Scanner;
class InvalidAgeException extends Exception{
	void ageException()
	{
		System.out.println("Age not valid!!");
	}
}
class ValidateAge{
		void checkAge(int n) throws InvalidAgeException{
				if(n<=15){
					throw new InvalidAgeException();
				}
				else{
					System.out.println("Age is valid!!");
				}
			}
	public static void main(String[] args){
		System.out.println("Enter the age to validate:");
		Scanner scan = new Scanner(System.in);
		try{
			Integer input=scan.nextInt();
			new ValidateAge().checkAge(input);
		}catch(InvalidAgeException e){
			new InvalidAgeException().ageException();
		}
	}
}