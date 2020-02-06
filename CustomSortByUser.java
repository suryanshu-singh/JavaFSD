import java.util.*;
class Employee{
    int age;
    String name;
 
    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
 
    public Integer getAge(){
        return this.age;
    }
 
    public String getName(){
        return this.name;
    }
 
    @Override
    public String toString(){
        return this.getName();
    }
}
 
 
 
 
 
class SortByFirstName implements java.util.Comparator{
    @Override
    public int compare(Object firstObj, Object secondObj){
        String first=((Employee)firstObj).getName();
        String[] firstAr = first.split(" ");
        String firstf= ((Employee)secondObj).getName();
        String[] firstfAr = firstf.split(" ");
        return firstAr[0].compareTo(firstfAr[0]);
    }
}




class SortByLastName implements java.util.Comparator{
    @Override
    public int compare(Object firstObj, Object secondObj){
        String first=((Employee)firstObj).getName();
        String[] firstAr = first.split(" ");
        String firstf= ((Employee)secondObj).getName();
        String[] firstfAr = firstf.split(" ");
        if(firstfAr.length>1 && firstAr.length>1)
            return firstfAr[1].compareTo(firstAr[1]);
        else if(firstfAr.length>1 && firstAr.length==1)
            return firstAr[0].compareTo(firstfAr[1]);
        else if(firstfAr.length==1 && firstAr.length>1)
            return firstAr[1].compareTo(firstfAr[0]);
        else
            return firstfAr[0].compareTo(firstAr[0]);
    }
}




 
 
class SortByAge implements java.util.Comparator{
    @Override
    public int compare(Object firstObj, Object secondObj){
        return ((Employee)firstObj).getAge().compareTo(((Employee)secondObj).getAge());
    }
}
 
 
 /* 1. Add New Employee
        - Enter name
        - ENter Age
    Do you want to add more(y/n) :n
 
    Sort by:
    1. First name
    2. Last name
    3. Age */ 
class CustomSortByUser{
    public static void main(String[] args) {
        String ch="y";
        boolean flag =true;
        java.util.List employeeList = new java.util.ArrayList();
        Scanner scan = new Scanner(System.in);
        while(ch.compareTo("y")==0){
            System.out.println("Choose the option:");
            System.out.println("1.Add New Employee:");
            System.out.println("2.Sort:");
            Integer choose = scan.nextInt();
            scan.nextLine();
            switch(choose){
                case 1:
                        System.out.println("Enter the Name of the Employee:");
                        String name = scan.nextLine();
                        System.out.println("Enter the age:");
                        Integer age = scan.nextInt();
                        employeeList.add(new Employee(name,age));
                        break;
                case 2:
                        System.out.println("Sort By:");
                        System.out.println("1.First Name");
                        System.out.println("2.Last Name");
                        System.out.println("3.Age");
                        Integer subChoice = scan.nextInt();
                        scan.nextLine();
                        switch(subChoice){
                            case 1:
                                    java.util.Collections.sort(employeeList, new SortByFirstName());
                                    System.out.println(employeeList);
                                    System.out.println("Hit enter to continue....");
                                    break;
                            case 2:
                                    java.util.Collections.sort(employeeList, new SortByLastName());
                                    System.out.println(employeeList);
                                    System.out.println("Hit enter to continue....");
                                    break;
                            case 3:
                                    java.util.Collections.sort(employeeList, new SortByAge());
                                    System.out.println(employeeList);
                                    System.out.println("Hit enter to continue....");
                                    break;
                            default:
                                    System.out.println("Enter number between 1 to 3");
                        }
                        break;
                        default:
                                System.out.println("Enter correct number");
            }
            //String ch="n";
            scan.nextLine();
            //scan.nextLine();
            System.out.println("Do you want to add more employees:(y/n)");
            //scan.nextLine();
            ch=scan.nextLine();
            //System.out.println("Let's see :"+ch);
            
        }
 
        //System.out.println("List before sorting : " + employeeList);
 
       // java.util.Collections.sort(employeeList, new SortByRegId());
 
        //System.out.println("List after sorting : " + employeeList);
 
 
    }
}
 
 
 
    
 
 
 
 
// Comparator
//  - public int compare(Object first, Object second)