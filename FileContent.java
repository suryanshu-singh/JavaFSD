import java.io.*;
 
class FileContent{
public static void main(String [] args) {
	final String myFileName="file.txt";

		int lineNo=1;
		int value;
            String line = null;
		try
        {
            /* FileReader reads text files in the default encoding */
            FileReader fileReader = new FileReader(myFileName);
            
            /* always wrap the FileReader in BufferedReader */
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null)
            {
                    System.out.print(lineNo+": ");
                    lineNo+=1;
                    System.out.println(line);
            }
            
            /* always close the file after use */
            bufferedReader.close();
        }
        catch(IOException ex)
        {
            System.out.println("Error reading file named '" + myFileName + "'");
        }

}
}