import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		String fileName = "/home/qainfotech/eclipse-workspace/TxtFileReadWrite/write1.txt";

        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);
            fileWriter.write("i"+fileName);
            fileWriter.write("\n i"+fileName);			
            fileWriter.write("\n i"+fileName);
			  // Always wrap FileWriter in BufferedWriter. 
            BufferedWriter bufferedWriter =
			  new BufferedWriter(fileWriter);
			  
			  // Note that write() does not automatically // append a newline character.
              bufferedWriter.newLine();
			  bufferedWriter.write("Hello there,");
			  bufferedWriter.write(" here is some text."); 
			  bufferedWriter.newLine();
			  bufferedWriter.write("We are writing");
			  bufferedWriter.write(" the text to the file.");
			  
			  //Always close files. 
			  //bufferedWriter.close();
			  
    fileWriter.close();			 
    
        }
        catch(IOException ex) {
            System.out.println("Error writing to file '"+ fileName + "'");
            
        }	

	}

}
