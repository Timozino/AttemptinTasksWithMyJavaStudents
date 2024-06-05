
import java.io.File;
import java.io.IOException;


public class CreateFileClass {
    public static void main(String[] args){
        try{
            File myFile = new File("yuvraj.txt");
            if (myFile.createNewFile()){
                System.out.println("File created : "+myFile.getName());
            }else{
                System.out.println("File Exists Already");

            }
            
    }catch (IOException e){
        System.out.println("An error occurred");
        e.printStackTrace();

    }
    }
}
