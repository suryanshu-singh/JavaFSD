import java.util.Scanner;
class MyException extends Exception{
		void func(){
			System.out.println("Value other than red,green or yellow entered!!");
		}
	}
class TrafficLight{
		static void trafficCheck(String input) throws MyException{
				switch (input){
				case "red":
				System.out.println("The light is red.");
				break;
				case "green":
				System.out.println("The light is green.");
				break;
				case "yellow":
				System.out.println("The light is yellow.");
				break;
				default:
				throw new MyException();
				}
		}


	public static void main(String[] args) throws MyException {
		System.out.println("Enter the traffic light colour:");
		Scanner scan = new Scanner(System.in);
		String input=scan.nextLine();
		input=input.toLowerCase();
		try{
			trafficCheck(input);
		}catch(MyException e){
			new MyException().func();
		}
	}
}