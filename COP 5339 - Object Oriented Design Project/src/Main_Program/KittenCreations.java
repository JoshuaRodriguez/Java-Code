package Main_Program;

import GUI_Classes.*;
import Kitten_Creation_Classes.AccountDataBase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Main program 
 * @author Joshua
 */
public class KittenCreations 
{
   public static void main(String args[]) throws ClassNotFoundException, IOException 
   {
       /* To set Nimbus look and feel */
       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
           try {
               if("Nimbus".equals(info.getName())) {
                   UIManager.setLookAndFeel(info.getClassName());
                   break;
               }
           }
           catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
               
           }
         }
       
       /**
        * an AccountDataBase object called kiittenCreationDataBase
        * This variable is essentially the data model of this application
        */
       AccountDataBase kittenCreationDataBase;
       
       // Creates a new file object with the name kittenCreationsDataBase.dat
       File f = new File("kittenCreationsDataBase.dat");
       
       // Checks to see if the file object f is a file and if it can be read
       // essentially this is here to check if the file exists in the directory
       // it is suppose to be in. If the file is not in the directory it belongs
       // in it just pulls an existing instance of the kitteCreationDataBase from
       // the AccountDataBase class. If the file does exist in the directory it
       // belongs in, it will deserialize the file into the variable. The
       // AccountDataBase class was implemented using the Singleton design pattern.
       if(f.isFile() && f.canRead()) {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
            kittenCreationDataBase = (AccountDataBase) in.readObject();
            in.close();
       }
       else {
           kittenCreationDataBase = AccountDataBase.getInstance();
       }

       // Create a new instance of the LandingScreen Jframe
       LandingScreen startScreen = new LandingScreen(kittenCreationDataBase);
       
       // Set default close operation to exiting if window closes
       // and set the display location 
       startScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       startScreen.setLocationRelativeTo(null); startScreen.setVisible(true); startScreen.setResizable(false);
       
       // This runs a thread when the compiler detects that the program is exiting
       // the purpose for this is to allow me to 
       Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                   ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("kittenCreationsDataBase.dat"));
                   out.writeObject(kittenCreationDataBase);
                   out.close();
               }
               catch(Exception e) {
                   
               }
           }
       }));
    }
}
