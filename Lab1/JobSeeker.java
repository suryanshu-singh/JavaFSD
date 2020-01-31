import java.util.*;
class JobSeeker{
	public static void main(String[] args) {
		boolean value=false;
		System.out.println("Enter the username:");
		Scanner scan = new Scanner(System.in);
		String input= scan.nextLine();
		StringTokenizer token= new StringTokenizer(input,"_job");
		if(input.contains("_job")){
			if(input.indexOf("_job")+4==input.length()){
				while(token.hasMoreTokens()){
					if(token.nextToken().length()>=8){
						value=true;
					}
				}
			}
		}
		if(value){
			System.out.println("The username is valid!!");
		}
		else{
			System.out.println("The username is invalid!!");
		}
		
	}
}