import java.util.*;

class MyExceptionName extends Exception{
	void NameException()
	{
		System.out.println("Full name not entered!!");
	}
}


class FullName
{
	void validateName(String Name) throws MyExceptionName
	{
			String[] words=Name.split(" ");	
			if(words.length<=1)
				throw new MyExceptionName();

	}


	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the full employee name:");
	String Name=sc.nextLine();
		try
		{
			new FullName().validateName(Name);
		}

		catch(MyExceptionName e)
		{
			new MyExceptionName().NameException();
			//System.out.println("Enter full name");
		}

	}

}