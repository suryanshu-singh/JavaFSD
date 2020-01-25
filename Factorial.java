class Factorial{
	public static void main(String[] args) {
		int number=Integer.parseInt(args[0]);
		int factorial=1;
		while(number>1)
		{
			factorial*=number;
			number--;
		}
		System.out.println("The factorial is:"+factorial);
	}
}