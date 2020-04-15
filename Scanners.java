import java.util.Scanner; //scans stuff
import java.io.File; //file stuff
import java.io.IOException; //the try, catch, exception stuff
public class Scanners
{
   public Scanners(){
        System.out.println("File? (Remember to add .txt)"); //asks for file
        Scanner in = new Scanner(System.in);
        String fileName = in.next(); 
        printFile(fileName);
   }
   void printFile(String file){//reads file
       File myFile = new File(file);//sets file name to myFile variable
       try{
           Scanner readTheFile = new Scanner(myFile);//'gets' file
           while(readTheFile.hasNextLine()){//keeps looping until there are no more lines to read in
               System.out.println(readTheFile.nextLine());//reads 1 line from file
           }
       }
       catch (IOException e){//this happens if somethings goes wrong, or if the file the person entered doesn't exist
           System.out.println("Something went wrong, or that file doesn't exist\nDid you remember the to add the .txt ?");
       }
   }
}
