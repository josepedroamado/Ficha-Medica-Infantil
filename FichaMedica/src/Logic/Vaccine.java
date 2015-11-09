package Logic;
import java.time.LocalDate;

//Clase Vacuna, contienen todos los datos pertinentes a la misma
public class Vaccine {
    //Attributes
    private String name;
    private boolean mandatory;
    private boolean received;
    private LocalDate receivedDate;
    private LocalDate expirationDate;
    
    //Getters and Setters
    //Name
    public String getNombre() {
        return name;
    }
    public void setNombre(String nombre) {
        name = nombre;
    }
    //Mandatory (Obligatoria)
    public boolean getMandatory() {
        return mandatory;
    }
    public void setObligatoria(boolean obligatoria) {
        mandatory = obligatoria;
    }
    //Received
    public boolean getReceived() {
        return received;
    }
    public void setReceived(boolean dada) {
        received = dada;
    }
    //ReceivedDate
    public LocalDate getReceivedDate() {
        return receivedDate;
    }
    public void setReceivedDate(LocalDate fechaDada) {
        receivedDate = fechaDada;
    }
    //ExpirationDate
    public LocalDate getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(LocalDate fechaVencimiento) {
        expirationDate = fechaVencimiento;
    }

    //Constructors
    //Empty
    public Vaccine(){
        name = "Sin Nombre";
        mandatory = false;
        received = false;
        receivedDate = null;
        expirationDate = null;
    }
    //Parametered
    public Vaccine(String nombre, boolean obligatoria, boolean dada, LocalDate fechaDada, LocalDate fechaVencimiento) {
        name = nombre;
        mandatory = obligatoria;
        received = dada;
        receivedDate = fechaDada;
        expirationDate = fechaVencimiento;
    }
    
    
}
