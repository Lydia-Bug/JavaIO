import java.util.Scanner; //scans stuff
import java.io.File; //file stuff
import java.io.IOException; //the try, catch, exception stuff (handle errors)
import java.io.FileWriter; // to write files
public class WriterOfFiles
{
   public WriterOfFiles(){
       System.out.println("Enter what you want to name your file"); //asks for file
       Scanner in = new Scanner(System.in);
       String fileName = in.next(); 
       System.out.println("Enter the content of the file\nYou can only enter 30 values\nWhen you've finshed type .");
       String[] content = new String[30];
       int i = 0;
       String checker = null;
       while(!".".equals(checker)){
           content[i] = in.next();
           checker = content[i];
           i++;
       }
       printFile(fileName, content);
   }
   void printFile(String file, String content[]){//reads file
       File myFile = new File(file);//sets file name to myFile variable
       try{
           FileWriter writer = new FileWriter(myFile);
           for(int i = 0; i<30; i++){
               if(content[i]!=null&&!".".equals(content[i])){
                   writer.write(content[i]+"\n");
               }
           }
           writer.flush();//makes sure its all good
           writer.close();//bye bye
       }
       catch (IOException e){//this happens if somethings goes wrong, or if the file the person entered doesn't exist
           System.out.println("Something went wrong, or that file doesn't exist"+"\n"+"Did you remember the to add the .txt ?");
       }
   }
}
