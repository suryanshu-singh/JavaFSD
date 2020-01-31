import java.util.*;
class SecondSmallest{
	int getSecondSmallest(int[] array){
		//int result;
		for(int i=0;i<array.length-1;++i){
			for(int j=i;j<array.length;++j){
				if(array[i]>array[j]){
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
	return array[1];

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
		System.out.println("The second smallest number of the array is:"+new SecondSmallest().getSecondSmallest(numbers));
	}
}