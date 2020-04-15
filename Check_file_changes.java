import java.util.Scanner; //scans stuff
import java.io.File; //file stuff
import java.io.IOException; //the try, catch, exception stuff (handle errors)
import java.io.FileWriter; // to write files
//Tesing
public class Check_file_changes
{
   public Check_file_changes(){
       System.out.println("What file do you want to check"); //asks for file
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
           long current = myFile.lastModified();
           long previous = myFile.lastModified();
           while(true){
               try{
                Thread.sleep(1000);
               }
                catch(InterruptedException e){
               }
               current = myFile.lastModified();
               if(current != previous){
                   Scanner readTheFileNew = new Scanner(myFile);//'gets' file
                        while(readTheFileNew.hasNextLine()){//keeps looping until there are no more lines to read in
                            System.out.println(readTheFileNew.nextLine());//reads 1 line from file
                        }
               }
               previous = myFile.lastModified();
               
           }
       }
       catch (IOException e){//this happens if somethings goes wrong, or if the file the person entered doesn't exist
           System.out.println("Something went wrong, or that file doesn't exist"+"\n"+"Did you remember the to add the .txt ?");
       }
   }
}
