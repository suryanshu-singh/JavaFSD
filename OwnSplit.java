import java.util.Scanner;
import java.util.*;
class OwnSplit{
	static String[] OwnSplitMethod(String input, String delimeter){
		int arr[]=new int[100];
		
			int count = 0, fromIndex = 0,i=0;

		// to find the starting indexes of the delimeter in the string
        while ((fromIndex = input.indexOf(delimeter, fromIndex)) != -1 ){
 
            //System.out.println("Found at index: " + fromIndex);
            arr[i]=fromIndex;
            count++;
            fromIndex++;
            i++;
            
        }

        //String []su=;
        //System.out.println("Total occurrences: " + count);
        int k=0;
        ArrayList<String> stringArray = new ArrayList<String>(0);
        //String s="";
        for(int j=0;j<count;++j){
        	// String s="";
        	//int k=0;
        	//String s1="";
        	String s="";
        	for(;k<input.length();k+=1){
        		if(k!=arr[j]){
        			//System.out.println("index to be appended:"+k);
        			s+=input.charAt(k);
        		}
        		else{

        			k+=delimeter.length()-1;
        			// System.out.println("k is:"+k);
        			// System.out.println("The substring is:"+s);
        			if(!s.equals(""))
        			{
        				stringArray.add(s);
        			}
        			s="";
        			j+=1;
        		}

        	}
        	if(!s.equals(""))
        			{
        				stringArray.add(s);
        			}
        	//System.out.println("The delimeted substring is:"+s);
        }
        
        //creating string array from arraylist
        int size=stringArray.size();
        //System.out.println("Size is:"+size);
        String []ans= new String[size];
        for(int p=0;p<size;++p){
        	ans[p]=stringArray.get(p);
        }
		return ans;
	}
	public static void main(String[] args) {
			//OwnSplitMethod("suryanshu singh","s");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String input=scan.nextLine();
		System.out.println("Enter your own delimeter");
		String delimeter= scan.nextLine();
		String []result=OwnSplitMethod(input,delimeter);
		System.out.println("The array is:"+Arrays.toString(result));

	}
}