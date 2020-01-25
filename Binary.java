class Binary{
	public static void main(String[] args) {
		String s="";
		int number=Integer.parseInt(args[0]);
		while(number>1){
			s+=number%2;
			//System.out.print(Number%2);
			number/=2;
		}
		s+=number;
		int lengthS=s.length();
		for(int i=lengthS-1;i>=0;--i)
		System.out.print(s.charAt(i));
	}
}