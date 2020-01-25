class Pass{
	public static void main(String[] args) {
		int number1=Integer.parseInt(args[0]);
		int number2=Integer.parseInt(args[1]);
		int number3=Integer.parseInt(args[2]);
		if(number1>=40){
			if(number2>=40){
				if(number3>=40){
					if(number1+number2+number3>=125){
						System.out.println("PASSING");
					}
				}
			}
		} 
		else
		{
			System.out.println("FAILING");
		}
	}
}