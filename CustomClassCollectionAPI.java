
 
// 1. Add a new Computer
// 2. Display all computers
// 3. Search for a computer : By Name, Color, HDDSize, RamSize, ID
// 4. Delete a computer : By ID
// 5. UPdate Computer Details: Name, Color, HDDSize, RamSize



import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class CustomClassCollectionAPI{
	static List list = new java.util.ArrayList();
    public static void main(String[] args) {
    	Integer choice =0;
    	while(choice!=6){
    	System.out.println("Choose one of the following:");
    	System.out.println("Press 1 to Add a new Computer:");
    	System.out.println("Press 2 to Display all the Computers:");
    	System.out.println("Press 3 to Search for a Computer:");
    	System.out.println("Press 4 to Delete a Computer by ID:");
    	System.out.println("Press 5 to update existing Computer Details:");
    	System.out.println("Press 6 to EXIT this API:");
    	Scanner scan = new Scanner(System.in);
    	choice = scan.nextInt();
    	scan.nextLine();
    	switch(choice){
    		case 1:
    				list.add(Computer.func());
    				System.out.println("Added Successfully!!");
    				break;
    		case 2:
    				System.out.println("The Details of all the Computers entered so far are:");
    				System.out.println(list);
    				break;
    		case 3:
    				Computer.search();
    				break;
    		case 4:
    				Computer.delete();
    				System.out.println("Deleted Successfully!!");
    				break;

    		case 5:
    				Computer.update();
    				break;
    		default:
    			System.out.println(" Please enter number between 1 to 6!!!");
    	}
    }
    
	}
}

 
class Computer{
    String brand, color;
    int hddSize, ramSize, ID;
 
    Computer(String brand, String color, int hddSize, int ramSize, int ID){
        this.brand = brand;
        this.color = color;
        this.hddSize = hddSize;
        this.ramSize = ramSize;
        this.ID = ID;
    }

    static Object func(){
    		Scanner scan = new Scanner(System.in);
    		System.out.println("Enter the brand:");
	    	String b= scan.nextLine();
	    	System.out.println("Enter the color:");
	    	String c = scan.nextLine();
	    	System.out.println("Enter the hddSize:");
	    	int h= scan.nextInt();
	    	System.out.println("Enter RAM size:");
	    	int r= scan.nextInt();
	    	System.out.println("Enter the ID");
	    	int id= scan.nextInt();
	    	return new Computer(b,c,h,r,id);
    }

    static void search(){
    	Scanner scan1 = new Scanner(System.in);
    				System.out.println("Enter the ID of the computer:");
    				Integer n= scan1.nextInt();
    				for(Object values:CustomClassCollectionAPI.list){
    					Computer ref = (Computer)values;
    					System.out.println("The id is:"+ ref.getID());
    					if(ref.getID()==n){
    						System.out.println("The brand name is:"+ref.getBrand()+",The color is:"+ref.getColor()+",The HDDSize is:"+ref.getHddSize()+",The RAM is:"+ref.getRamSize());
    					}
    				}
    }
    static void delete(){
    				Scanner scan1 = new Scanner(System.in);
    				//int i=0;
    				System.out.println("Enter the ID of the computer to be deleted:");
    				Integer n= scan1.nextInt();
    				Computer ref;
    				for(Object values:CustomClassCollectionAPI.list){
    					ref = (Computer)values;
    					if(ref.getID()==n){
    						CustomClassCollectionAPI.list.remove(ref);
    						break;
    					}
    				}
    }

    static void update(){
    				Scanner scan1 = new Scanner(System.in);
    				System.out.println("Enter the ID of the computer to be updated:");
    				Integer n= scan1.nextInt();
    				scan1.nextLine();
    				Computer ref;
    				for(Object values:CustomClassCollectionAPI.list){
    					ref = (Computer)values;
    					//System.out.println("The id is:"+ ref.getID());
    					if(ref.getID()==n){
    						//scan1.nextLine();
    						System.out.println("What do you want to update:");
    						System.out.println("1. Brand Name");
    						System.out.println("2. Color");
    						System.out.println("3. hddSize");
    						System.out.println("4. RamSize");
    						System.out.println("5. ID");
    						Integer subChoice = scan1.nextInt();
    						scan1.nextLine();
    						switch(subChoice){
    							case 1:
    									System.out.println("Enter the new brand name:");
    									ref.brand=scan1.nextLine();
    									break;
    							case 2:
    									System.out.println("Enter the new color:");
    									ref.color= scan1.nextLine();
    									break;
    							case 3:
    									System.out.println("Enter the new HDDSize:");
    									ref.hddSize= scan1.nextInt();
    									break;
    							case 4:
    									System.out.println("Enter the new RamSize:");
    									ref.ramSize= scan1.nextInt();
    									break;
    							case 5:
    									System.out.println("Enter the new ID:");
    									ref.ID= scan1.nextInt();
    									break;
    							default:
    							System.out.println("Wrong value entered!!!");

    						}
    						
    						//scan1.nextLine();
    						
    						
    					}
    				}
    }
 
    public String getColor(){
        return this.color;
    }
 
    public String getBrand(){
        return this.brand;
    }
 
    public Integer getHddSize(){
        return this.hddSize;
    }
     
    public Integer getRamSize(){
        return this.ramSize;
    }

    public Integer getID(){
    	return this.ID;
    }
 
    @Override
    public String toString(){
        return this.getBrand()
            + ", " + this.getColor()
            + ", " + this.getHddSize()
            + ", " + this.getRamSize()
            + ", " + this.getID();
    }
 
 
}