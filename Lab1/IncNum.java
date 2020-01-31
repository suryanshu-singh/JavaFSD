import java.util.*;
class IncNum{
	boolean checkNumber(Integer n){
		String s= Integer.toString(n);
		boolean check=false;
		for(int i=0;i<s.length()-1;++i){
			if(s.charAt(i)<s.charAt(i+1)){
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
		//IncNum object= new IncNum();
		System.out.println("Enter the number to check whether it is increasing or not:");
		Scanner scan = new Scanner(System.in);
		Integer number=new Integer(scan.nextInt());
		System.out.println("The result is:"+new IncNum().checkNumber(number));
	}
}