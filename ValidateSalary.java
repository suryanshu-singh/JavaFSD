import java.util.Scanner;
class EmployeeException extends Exception{
	void salaryException()
	{
		System.out.println("Salary not valid!!");
	}
}
class ValidateSalary{
		void checkSalary(int n) throws EmployeeException{
				if(n<=3000){
					throw new EmployeeException();
				}
				else{
					System.out.println("Salary is valid!!");
				}
			}
	public static void main(String[] args){
		System.out.println("Enter the salary to validate:");
		Scanner scan = new Scanner(System.in);
		try{
			Integer input=scan.nextInt();
			new ValidateSalary().checkSalary(input);
		}catch(EmployeeException e){
			new EmployeeException().salaryException();
		}
	}
}