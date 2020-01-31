import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class Duration{
	public static void main(String[] args) {
		System.out.println("Enter the date for which you want to calculate the duration in yyyy-MM-dd format:");
		Scanner scan = new Scanner(System.in);
		StringTokenizer input= new StringTokenizer(scan.nextLine(),"-");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate localDate = LocalDate.now();
		StringTokenizer localDate1= new StringTokenizer(localDate.toString(),"-");
		int days=0;
		int months=0;
		int years=0;
		while(input.hasMoreTokens()){
			years=Math.abs(Integer.parseInt(input.nextToken())-Integer.parseInt(localDate1.nextToken()));
			months=Math.abs(Integer.parseInt(input.nextToken())-Integer.parseInt(localDate1.nextToken()));
			days=Math.abs(Integer.parseInt(input.nextToken())-Integer.parseInt(localDate1.nextToken()));
		}
		System.out.println("The no of year is:"+years);
		System.out.println("The no of month is:"+months);
		System.out.println("The no of days is:"+days);

	}
}