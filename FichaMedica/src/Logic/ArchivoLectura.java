package Logic;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArchivoLectura {
    String linea = "";
    BufferedReader in;

    public ArchivoLectura(String unNombre) throws FileNotFoundException{
        in = new BufferedReader(new FileReader(unNombre));
    }

    public boolean hayMasLineas(){
        boolean hayMas;
        try{
            linea = in.readLine();
        }
        catch(IOException e){
        }
        hayMas = linea != null;
        return hayMas;
    }

    public String linea(){
        return linea;
    }

    public boolean cerrar(){
        boolean ok=true;
        try{
            in.close();
        }
        catch(Exception e){
            ok = false;
        }
        return ok;
    }

}
