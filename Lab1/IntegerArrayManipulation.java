import java.util.*;
class IntegerArrayManipulation{
	Integer[] getSorted(int []numbers){
		Integer []reversedArray= new Integer[numbers.length];
		for(int i=0;i<numbers.length;++i){
			StringBuilder sb = new StringBuilder(); 
		    sb.append(numbers[i]); 
		    sb=sb.reverse();
		    //String str7 = sb.toString();
			String s=sb.toString();
			reversedArray[i]=Integer.parseInt(s);
		}
		for(int i=0;i<reversedArray.length-1;++i){
			for(int j=i;j<reversedArray.length;++j){
				if(reversedArray[i]>reversedArray[j]){
					int temp=reversedArray[i];
					reversedArray[i]=reversedArray[j];
					reversedArray[j]=temp;
				}
			}
		}
		return reversedArray;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		Integer size = new Integer(scan.nextInt());
		int []numbers= new int[size];
		System.out.println("Enter the integer array:");
		for(int i=0;i<size;++i){
			numbers[i]= scan.nextInt();
		}
		System.out.println("The reversed number array is:"+Arrays.toString(new IntegerArrayManipulation().getSorted(numbers)));
	}
}