class Fibonacci{
	public static void main(String[] args) {
		int count = 89, num1 = 0, num2 = 1;
        System.out.print(" Fibonacci Series of numbers from 1 to 89: ");

        while(num2<=89)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
		
	}
}