package Logic;

import GUI.vPrincipal;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FichaMedica {

    public static void main(String[] args) {
        LogicSystem sistema = null;
        try{
            FileInputStream fileIn = new FileInputStream("data.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            sistema = (LogicSystem) in.readObject();
            in.close();
            fileIn.close();
        }
        catch(Exception i){
            sistema = new LogicSystem();           
            return;
        }
        finally{
            vPrincipal w = new vPrincipal (sistema);
            w.setVisible(true); 
        }   
    }
    
}
