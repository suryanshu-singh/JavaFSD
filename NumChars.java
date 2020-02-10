import java.io.*;
 
class NumChars{
public static void main(String [] args) {
    final String myFileName="file.txt";

            int numChar=0;
            int numWords=0;
            int lineNo=0;
            int value;
            String line = null;
        try
        {
            File myFile=new File(myFileName);
            FileInputStream fileIn=new FileInputStream(myFile);
            while((value = fileIn.read())!=-1)
            {
                numChar+=1;
                //System.out.print((char)value);
            } 

            
            /* FileReader reads text files in the default encoding */
            FileReader fileReader = new FileReader(myFileName);
            
            /* always wrap the FileReader in BufferedReader */
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null)
            {
                    lineNo+=1;
                    String []words = line.split(" ");
                    numWords+=words.length;

                    System.out.println(line);
            }
            bufferedReader.close();
            System.out.println("No of characters is:"+ numChar); 
            System.out.println("No of words is:"+ numWords); 
            System.out.println("No of lines is:"+ lineNo); 
        }
        catch(IOException ex)
        {
            System.out.println("Error reading file named '" + myFileName + "'");
        }

}
}